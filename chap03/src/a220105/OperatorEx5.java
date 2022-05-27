package a220105;

import java.util.*;

public class OperatorEx5 {
	public static void main(String[] args) {
		int a = 10;
		int b = 4;
		
		System.out.printf("%d + %d = %d%n", a, b, a + b);
		System.out.printf("%d - %d = %d%n", a, b, a - b);
		System.out.printf("%d * %d = %d%n", a, b, a * b);
		System.out.printf("%d / %d = %d%n", a, b, a / b);
		System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b);
		
		// 두 정수를 입력 받아 사칙연산 결과를 출력하시오.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요 >");
		a = Integer.parseInt(scanner.nextLine());
		
		System.out.print("두번째 수를 입력하세요 >");
		String input = scanner.nextLine();
		b = Integer.parseInt(input);
		
		System.out.printf("%d + %d = %d%n", a, b, a + b);
		System.out.printf("%d - %d = %d%n", a, b, a - b);
		System.out.printf("%d * %d = %d%n", a, b, a * b);
		System.out.printf("%d / %d = %d%n", a, b, a / b);
		System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b);
		
		
		
	}
}
