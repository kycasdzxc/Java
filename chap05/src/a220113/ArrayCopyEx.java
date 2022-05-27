package a220113;

import java.util.Arrays; // ctrl + shift + o

public class ArrayCopyEx {
	public static void main(String[] args) {
		int[] arr = {5, 6, 7};
		
		int[] tmp = new int[arr.length * 2]; // 6
		
		System.arraycopy(arr, 0, tmp, 0, arr.length);
		
		// src : 소스(원시). 원본파일
		// srcPos : 원시 위치
		// dest : 타겟, 대상, 도착지
		// destPos: 목적지 위치
		// length : 길이를 변경하면 기존 배열의 2개만 데려옴
 		
		System.out.println(Arrays.toString(arr));

		arr = tmp;
		
		System.out.println(Arrays.toString(arr));
	}
}
