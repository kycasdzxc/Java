package chap04;

public class Ex4_03 {
	public static void main(String[] args) {
		
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 1 ; i <= 10 ; i++) {
			sum1 += i;
			sum2 += sum1;
			System.out.printf("%3d, %3d, %3d%n", i, sum1, sum2);
		}
		
//		int sum1 = 0;
//		int sum2 = 0;
//		
//		for (int i = 1 ; i <= 10 ; i++) {
//			sum1 += i;
//			sum2 += sum1;
//			System.out.printf("%2d	%2d	%2d %n", i, sum1, sum2);
//		}
//		
//		System.out.println(sum2);
	}
}
