package a220114;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = { 8, 5, 6, 2, 4 };

		// n^2
		int key = arr[1];
		if (key < arr[0]) {
			int tmp = arr[0];
			arr[0] = key;
			arr[1] = tmp;
		}
		System.out.println(Arrays.toString(arr));

		//
		if (arr[2] < arr[0]) {
			int tmp = arr[0];
			arr[0] = arr[2];
			arr[1] = tmp;
		}
		if (arr[2] < arr[1]) {
			int tmp = arr[1];
			arr[1] = arr[2];
			arr[2] = tmp;
		}
		System.out.println(Arrays.toString(arr));
		/*
		 * 0 01 012 0123
		 * 
		 * * ** *** ****
		 * 
		 */

		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] < arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}
}
