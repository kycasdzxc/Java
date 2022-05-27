package a220118;

public class ReferenceParamEx {
	public static void main(String[] args) {
		int[] arr = new int[] {3, 2, 1, 6, 5, 4};
		printArr(arr);
		sortArr(arr);
		printArr(arr);
		System.out.println("sum=" + sumArr(arr));
	}
	
	static void printArr(int[] arr ) {
		System.out.print("[");
		for (int i : arr)
			System.out.print(i + ",");
		System.out.println("]");
	}
	
	static int sumArr (int[] arr) {
		int sum = 0;
		for (int i = 0 ; i < arr.length ; i++)
			sum += arr[i];
			return sum;
		}
		
		static void sortArr (int[] arr) {
			for (int i = 0 ; i < arr.length - 1 ; i++)
				for (int j = 0 ; j < arr.length - 1 - i ; j++)
					if (arr[j] > arr[j+1]) {
						int tmp = arr[j];
						arr[j] = arr[j+1];
					arr[j + 1] = tmp;

				}
			
//		자바의 모든 호출은 값에 의한 호출, call by value			
	}
}
