package chap13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadWaitEx1 {
	public static void main(String[] args) throws InterruptedException {
//		System.out.println();
//		
//		for(char i = '가' ; i < '까' ; i++) {
//			System.out.print(i);
//		}
//		// 19, 28
//		System.out.println("가각갂갃간갅갆갇갈갉갊갋갌갍갎갏감갑값갓갔강갖갗갘같갚갛".length());
//		
//		char ch = '가';
//		System.out.println(('가'-'가') % 28);
//		System.out.println(('까'-'가') % 28);
//		char ch2 = '각';
//		
//		char ch3 = '각';
//		
//		System.out.println(proc("경보", "가", "이"));
//		System.out.println(proc("동엽", "가", "이"));
//		System.out.println(proc("치형", "는", "은"));
//		System.out.println(proc("민지", "는", "은"));
		
		Table table = new Table();
		
		new Thread(new Cook(table), "요리사").start(); // 요리 시작
		new Thread(new Customer(table, "국밥"), "동엽").start();
		new Thread(new Customer(table, "돈까스"), "경보").start();
		new Thread(new Customer(table, "국밥"), "승종").start();
		
		Thread.sleep(5000);
		System.exit(0);
		
	}
	
	static String proc(String str, String s1, String s2) {
		return (str.charAt(str.length()-1) - '가') % 28 == 0 ? str + s1 : str + s2;
	}
}

class Table {
	List<String> dishNames = new ArrayList<String>(Arrays.asList(new String[] {"국밥", "국밥", "돈까스"}));
	final int MAX_FOOD = 6;
	
	ArrayList<String> dishes = new ArrayList<>();
	
	private ReentrantLock lock = new ReentrantLock();
	private Condition forCook = lock.newCondition();
	private Condition forCust = lock.newCondition();
	
	public void add(String dish) {
		lock.lock();
		try {
			if(dishes.size() >= MAX_FOOD) {
				System.out.println(ThreadWaitEx1.proc(Thread.currentThread().getName(), "가", "이") + " 기다립니다.");
				try {
					forCook.await();
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		dishes.add(dish);
		forCust.signal();
		System.out.println("접시의 메뉴 : " + dishes);
		} finally {
			lock.unlock();
		}
	}
	
	public void remove(String dish) {
		lock.lock();
		try {
			while(dishes.isEmpty()) {
				System.out.println(ThreadWaitEx1.proc(Thread.currentThread().getName(), "가", "이") + " 음식을 기다리는 중입니다.");
				try {
					forCust.await();
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			while(true) {
				for(int i = 0 ; i < dishes.size() ; i++) {
					if(dish.equals(dishes.get(i))) {
						dishes.remove(i);
						forCook.signal();
						return;
					}
				}
				System.out.println(ThreadWaitEx1.proc(Thread.currentThread().getName(), "가", "이") + " 음식을 기다리는 중입니다.");
				try {
					forCust.await();
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} finally {
			lock.unlock();
		}
	}
	
	public int dishNum() {
		return dishNames.size();
	}
}

class Cook implements Runnable {
	private Table table;
	public Cook(Table table) {
		this.table = table;
	}

	@Override
	public void run() {
		while(true) {
			int idx = (int)(Math.random() * table.dishNum());
			table.add(table.dishNames.get(idx));
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Customer implements Runnable {
	private Table table;
	private String food;
	public Customer(Table table, String food) {
		this.table = table;
		this.food = food;
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String name = Thread.currentThread().getName();
			table.remove(food);
			System.out.println(ThreadWaitEx1.proc(name, "가 ", "이 ") + ThreadWaitEx1.proc(food, "를", "을") + " 먹었습니다.");
		}
}
}