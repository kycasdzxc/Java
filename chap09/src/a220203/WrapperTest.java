package a220203;

import java.util.ArrayList;
import java.util.List;

public class WrapperTest {
	public static void main(String[] args) {
		int i = 10;
		Integer integer = new Integer(20); // 20
		
		System.out.println(i + integer.intValue());
		System.out.println(new Object().toString() + new Object());
//		i. >> 기본형은 멤버유무 확인 불가
//		integer. >> 참조형은 멤버유무 확인 가능
		
		System.out.println(Integer.toBinaryString(-1));
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		System.out.println(Long.SIZE);
		System.out.println(Long.BYTES);
		
		Integer i2 = 20; // auto box
		Integer i3 = new Integer(20); // 원래는 이렇게 표헌
		
		System.out.println(i2.equals(i3));
		System.out.println(i2 == i3);
		
		int[] arr;
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		
		// long String
		long l = 10; // 10L
		String s = l + ""; // "10"
		System.out.println(s);
		
		l = Long.parseLong(s);
		char c = (char)Integer.parseInt(s);
		System.out.println(c);
		
	}
}