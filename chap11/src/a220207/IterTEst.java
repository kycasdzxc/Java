package a220207;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Vector;

public class IterTEst {
	public static void main(String[] args) {
		Integer[] arr = {10, 20, 30, 40};
		List<Integer> integers = new ArrayList<Integer>(Arrays.asList(arr));
		Set<Integer> integers2 = new HashSet<Integer>(integers);
		
		System.out.println(integers);
		System.out.println(integers2);
		
		// ~er, ~or, ~~하는 사람. ~~자 >> 인스턴스 생성 목적의 인터페이스
		// ~able ~~가 가능한 >> 클래스에 implements 키워드를 통한 구현 목적의 인터페이스	
		Iterator<Integer> iter1 = integers.iterator();
		Iterator<Integer> iter2 = integers2.iterator();
		
		// hasNext(), next()
		
//		System.out.println(iter1.next());
//		System.out.println(iter1.next());
//		System.out.println(iter1.next());
//		System.out.println(iter1.next());
		
		while (iter1.hasNext()) {
			Integer integer = iter1.next();
			System.out.println(integer);
		}
		
		while (iter2.hasNext()) {
			Integer integer = iter2.next();
			System.out.println(integer);
		}
		
		ListIterator<Integer> listIterator = integers.listIterator();
		System.out.println("================= list Iter");
//		System.out.println(listIterator.next()); // 내꺼 먼저 주고 다음 위치 이동
//		System.out.println(listIterator.next());
//		System.out.println(listIterator.previous());
//		System.out.println(listIterator.hasPrevious());

	while (listIterator.hasNext()) {
		System.out.println(listIterator.next());
	}
	while (listIterator.hasPrevious()) {
		System.out.println(listIterator.previous());
	}
	
	// Enumeration
	
	Vector<Integer> vector = new Vector<Integer>(integers);
	System.out.println(vector);
	
	Enumeration<Integer> en = vector.elements();
	while (en.hasMoreElements()) {
		Integer integer = (Integer) en.nextElement();
		System.out.println(integer);
	}
	
	
	}
}