package a220208;

import java.util.Arrays;

public class Array2D {
	public static void main(String[] args) {
		String[] str1 = {"abc", "def"};
		String[] str2 = {"abc", "def"};
		
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {1, 2, 3};

		int[][] arr3 = {{1, 2}, {3, 4}};
		int[][] arr4 = {{1, 2}, {3, 4}};
		
		// arr3의 type? int[][] length 2
		// arr3[0]의 type? int[]
		// arr[0][1]의 type? int
		
		System.out.println(Arrays.equals(str1, str2));
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.deepEquals(arr3, arr4));
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.deepToString(arr3));
		System.out.println(Arrays.toString(arr4));
	}
}
