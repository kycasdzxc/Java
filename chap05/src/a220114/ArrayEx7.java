package a220114;

public class ArrayEx7 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for (int i = 0 ; i < numArr.length ; i++) {
			numArr[i] = i;	// 배열을 0~9의 숫자로 초기화
			System.out.print(numArr[i]);

		}
		
		System.out.println();
		
		for (int i = 0 ; i < numArr.length ; i++) {
			int n = (int)(Math.random() * 10);	// 0~9 중의 한 값을 임의로 얻는다.
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		for (int i = 0 ; i < numArr.length ; i++) {
			System.out.print(numArr[i]);
		}
	}
}
