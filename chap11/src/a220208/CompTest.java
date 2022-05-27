package a220208;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CompTest {
	public static void main(String[] args) {
		String[] strs = {"가", "a", "b", "ㅋ", "1"};
		String[] strs2 = {"가", "나", "가나", "나가", "가"};
		
		Arrays.parallelSort(strs);
		Arrays.parallelSort(strs2);
		
		System.out.println(Arrays.toString(strs));
		System.out.println(Arrays.toString(strs2));
		
		Addr[] addrs = {new Addr(3, "가"), new Addr(1, "라"), new Addr(2, "마")};
		System.out.println(Arrays.toString(addrs));
		
		Comparator<Addr> comparator = new Comparator<Addr>() {

			@Override
			public int compare(Addr o1, Addr o2) {
				// TODO Auto-generated method stub
				return -(o1.name.compareTo(o2.name));
			}
			
		};
		
		// function supplier consumer
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		list.forEach(System.out::println);
		
//		Arrays.sort(addrs, comparator);
		Arrays.sort(addrs, new MyClass());
//		Arrays.sort(addrs, (a, b) -> a.name.compareTo(b.name));
//		Arrays.sort(addrs, Addr::compareTo);
		System.out.println(Arrays.toString(addrs));
		
		System.out.println(addrs[0].compareTo(addrs[1]));
		
		String s1 = "a";
		String s2 = "d";
		
		System.out.println(s1.compareTo(s2));
		
	}
}

class MyClass implements Comparator<Addr> {

	@Override
	public int compare(Addr o1, Addr o2) {
		// TODO Auto-generated method stub
		return o1.no - o2.no;
	}
	
	
}

final class Addr implements Comparable<Addr> {
	int no;
	String name;
	double coords;
	public Addr(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	public String toString() {
		return String.format("Addr [no=%s, name=%s]", no, name);
	}
	@Override
	public int compareTo(Addr o) {
		// TODO Auto-generated method stub
		return -(no - o.no); // no 내림차순
//		name 오름차순
//		return name.compareTo(o.name);
//		return new Integer(o.name).compareTo(o.no);
//		return coords - o.coords; 0.1과 0.2 구분 못함 >> 얘도 comareTo 있음
		
	}
}

//class MyAddr extends Addr {
//
//	public MyAddr(int no, String name) {
//		super(no, name);
//	}
//
//	@Override
//	public int compareTo(Addr o) {
//		return name.compareTo(o.name);
//	}
//}