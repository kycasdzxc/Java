package a220114;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		// [4, 5, 3, 1, 2]
		// [4        1   ]
		// [1, 5, 3, 1, 2]	// 1회차
		// [1, 2, 3, 4, 5]	// 2회차
		// [1, 2, 3, 4, 5]	// 3회차
		// [1, 2, 3, 4, 5]	// 4회차
		
		int[] arr = {4, 5, 1, 2, 3};
		
//		int min = arr[0];
		
		for (int j = 0 ; j < arr.length - 1; j++) {
			int idx = j;
		
		for (int i = j + 1 ; i < arr.length; i++) {
//			if (min > arr[i]) {
//				min = arr[i];
			if (arr[idx] > arr[i]) {
				idx = i;
			}
		}
		
//		System.out.println(min);
		System.out.println(idx);
		
		int tmp = arr[j];
		arr[j] = arr[idx];
		arr[idx] = tmp;
		
		System.out.println(Arrays.toString(arr));

		}
	}
}
