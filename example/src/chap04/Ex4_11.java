package chap04;

public class Ex4_11 {
	public static void main(String[] args) {
		// Fibonnach 1, 1 수열의 시작의 첫 두 숫자로 한다
		int num1 = 1;
		int num2 = 0;
		int num3 = 0; // 세번째 값
		System.out.print(num3);
		
		for (int i = 0 ; i < 10 ; i++) {
		num3 = num2 + num1;
		System.out.print(", " + num3);
		num1 = num2;
		num2 = num3;
		}
	}
}
