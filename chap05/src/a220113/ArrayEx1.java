package a220113;

import java.util.Arrays;

public class ArrayEx1 {
	public static void main(String[] args) {
		int[] score = new int[5];
		int k = 1;
		
		score[0] = 50;
		score[1] = 60;
		score[k+1] = 70;
		score[3] = 80;
		score[4] = 90;
		
		int tmp = score[k+2] + score[4]; // int tmp = score[3] + score[4]
		
		// for문으로 배열의 모든 요소를 출력한다.
		for (int i = 0 ; i < 5 ; i++) {
			System.out.printf("score[%d]:%d%n", i, score[i]);
		}
		
		System.out.printf("tmp:%d%n", tmp);
//		System.out.printf("score[%d]:%d%n", 7, score[7]); // index의 범위를 벗어난 값
		
		// 1 int = 4byte * 20억
		// 80억 byte >> 800만 KB >> 8000MB >> 8GB
		
		// JVM : method area, call stack, heap
		System.out.println(args.length);
		// args.length = 10; >> 배열의 길이는 상수이다.
		
		// 참조자료형의 기본값 : null
		
		int[] array2 = new int[5];
		array2 = null;
//		System.gc();
		int i = 0;
		String s = null;
		
		String[] strs = new String[3];
		System.out.println(strs[0]);
		System.out.println(strs[1]);
		System.out.println(strs[2]);
		
		int[] arrays3 = new int[] {10, 15, 11, 12};
		for (int j = 0 ; j < arrays3.length ; j++) {
			System.out.println(arrays3[j]);
		}
		// 선언, 할당
		
		int[] arr2;
		arr2 = new int[3];
		
		int[] arr3;
		arr3 = new int[] {10, 11, 12, };
		
		for (int j = 0 ; j < arr3.length ; j++) {
			System.out.print(arr3[j] + ",");
		}
		System.out.println();
		System.out.println(Arrays.toString(arr3));
		
		System.out.println("============================");
		
		// strs라는 배열을 하나씩 순회해서 나온 결과를 String 타입의 변수 s2에 한 번씩 할당
		for (String s2 : strs) {
			System.out.printf("[%s]%n", s2);
		}
		
	}
}