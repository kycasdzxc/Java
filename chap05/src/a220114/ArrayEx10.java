package a220114;

public class ArrayEx10 {
	public static void main(String[] args) {
		// O(n^2) :
		// 버블(bubble) 정렬 : 회차당 마지막 인덱스값 부터 정렬 완료
		int[] numArr = new int[5];

		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int) (Math.random() * 10));
		}
		System.out.println();
		// [8, 9, 1, 5, 4]

		// i = 0
		// [8, 1, 9, 5, 4]
		// [8, 1, 5, 9, 4]
		// [8, 1, 5, 4 ,9]
		// ==================== 1회차

		// i = 1
		// [1, 8, 5, 4, 9]
		// [1, 5, 8, 4, 9]
		// [1, 5, 4, 8, 9]
		// ==================== 2회차
		
		// i = 2
		// [1, 5, 4, 8, 9]
		// [1, 4, 5, 8, 9]
		// ==================== 3회차
		
		// i = 3
		// [1, 4, 5, 8, 9]
		// ==================== 4회차

		for (int i = 0; i < numArr.length - 1; i++) {
			boolean changed = false; // 자리바꿈이 발생했는지를 체크한다.

			for (int j = 0; j < numArr.length - 1 - i; j++) {
				if (numArr[j] > numArr[j + 1]) { // 옆의 값이 작으면 서로 바꾼다.
					int temp = numArr[j];
					numArr[j] = numArr[j + 1];
					numArr[j + 1] = temp;
					changed = true; // 자리바꿈이 발생했으니 changed를 true로 저장
				}
			}

			if (!changed)
				break; // 자리바꿈이 없으면 반복문을 벗어난다.

			for (int k = 0; k < numArr.length; k++)
				System.out.print(numArr[k]); // 정렬된 결과를 출력
			System.out.println();
		}
	}
}
