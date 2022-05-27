package chap13;

public class ThreadEx1 {
	public static void main(String[] args) {
		ThreadEx_1 ex1_1 = new ThreadEx_1();
		ThreadEx_2 ex1_2 = new ThreadEx_2();
		
		ex1_1.start();
//		ex1_1.run();
//		new Thread(ex1_2).start();
//		for (int i = 0; i < 10_000 ; i++) {
//			System.out.print("2");
//		}
		System.out.println("end of main");
	}
}

class ThreadEx_1 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10_000 ; i++) {
//			System.out.println(getName());
			System.out.print("0");
		}
	}
	
}

class ThreadEx_2 implements Runnable {

	@Override
	public void run() {
		for(int i = 0 ; i < 10_000 ; i++) {
//			System.out.println(Thread.currentThread().getName());
			System.out.print("1");
		}
	}
	
}