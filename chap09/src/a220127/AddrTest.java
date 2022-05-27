package a220127;

import java.util.HashMap;
import java.util.TreeMap;

public class AddrTest {
	public static void main(String[] args) {
		Addr a1 = new Addr(1, "1길동", "영등포");
		Addr a2 = new Addr(2, "2길동", "당산");
		Addr a3 = new Addr(1, "1길동", "영등포");
		Addr a4 = new Addr(1, "3길동", "여의도");
		System.out.println(a1.equals(a2));
		System.out.println(a1 == a2);
		
		// 
		System.out.println(a1.equals(a3));
		System.out.println(a1.equals(a4));
		
//		a1.equals(new AddrTest());
		System.out.println("abcd".equals(null));
		System.out.println("abcd".equals(a1));
		
		// ArrayList, HashMap
		// List > 순번 통해 값을 관리
		// Map 	> 키 통해 값을 관리
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("가", "abcd");
		map.put("나", "1234");
		map.put("kor", "100");
		map.put("eng", "90");
		System.out.println(map);
		
		System.out.println(map.get("kor"));
		
		// hashing
		// 출생연도
		
		// 83 >> 0x100
		// 93 94 >> 0x200
		// 00 01 >> 0x300
		
		// f(94) >> 0x200
		
		System.out.println(a1);
		System.out.println(a1.hashCode());
		System.out.println(String.format("%x", a1.hashCode()));
	}
}

class Addr { // address
	int no;
	String name;
	String addr;
	public Addr(int no, String name, String addr) {
		super();
		this.no = no;
		this.name = name;
		this.addr = addr;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return obj != null && obj instanceof Addr && no == ((Addr)obj).no && name.contentEquals(((Addr)obj).name);
	}
	
}