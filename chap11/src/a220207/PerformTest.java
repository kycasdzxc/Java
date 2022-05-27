package a220207;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformTest {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		LinkedList<String> linkedList = new LinkedList<String>();
		
		System.out.println("======== 순차 추가 ========");
		System.out.println("ArrayList : " + add1(arrayList) + " ms");
		System.out.println("LinkedList : " + add1(linkedList) + " ms");
		
		System.out.println("======== 중간 추가 ========");
		System.out.println("ArrayList : " + add2(arrayList) + " ms");
		System.out.println("LinkedList : " + add2(linkedList) + " ms");
		
		System.out.println("======== 탐색 ========");
		System.out.println("ArrayList : " + get(arrayList) + " ms");
		System.out.println("LinkedList : " + get(linkedList) + " ms");

		System.out.println("======== 중간 삭제 ========");
		System.out.println("ArrayList : " + remove1(arrayList) + " ms");
		System.out.println("LinkedList : " + remove1(linkedList) + " ms");

		System.out.println("======== 순차 삭제 ========");
		System.out.println("ArrayList : " + remove2(arrayList) + " ms");
		System.out.println("LinkedList : " + remove2(linkedList) + " ms");
		
		
	}
	
	// 순차 추가
	static long add1(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i = 0 ; i < 1_000_000 ; i++) list.add(i+"");
		long end = System.currentTimeMillis();
		return end - start;
	}
	// 중간 추가
	static long add2(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i = 0 ; i < 10__000 ; i++) list.add(0, i+"");
		long end = System.currentTimeMillis();
		return end - start;
	}
	// 중간 삭제
	static long remove1(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i = 0 ; i < 10__000 ; i++) list.remove(0);
		long end = System.currentTimeMillis();
		return end - start;
	}
	// 순차 삭제
	static long remove2(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i = list.size() - 1 ; i >= 0 ; i--) list.remove(i);
		long end = System.currentTimeMillis();
		return end - start;
	}
	// 탐색
	static long get(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i = list.size() - 1 ; i >= 0 ; i--) list.get(i);
		long end = System.currentTimeMillis();
		return end - start;
	}

	
}
