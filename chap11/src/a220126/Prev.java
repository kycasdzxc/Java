package a220126;

import java.util.ArrayList;

public class Prev {
	public static void main(String[] args) {
		String str = "abcd";
		String[] strings = new String[10];
		strings[0] = str;
		// 길이 제한
		System.out.println(strings.length);
		
		ArrayList<String> list = new ArrayList<String>();
		System.out.println(list.size());
		list.add(str);
		System.out.println(list.size());
		
		list.add("가");
		list.add("나");
		list.add("다");
		
		System.out.println(list);
		
		System.out.println(strings[0]);
		System.out.println(list.get(0));
		
		list.set(2, "a");
		
		list.remove("가");
		
		System.out.println(list);
	}
}
