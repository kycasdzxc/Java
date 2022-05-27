package chap04;

public class Ex4_15 {
	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		int result = 0;	// number 변수를 거꾸로 변환해서 담을 변수

		
//		result = result * 10 + tmp % 10;
//		tmp /= 10;
//		System.out.printf("%d \t %d%n", a, tmp);
//		
//		
//		a = tmp % 10;
//		tmp /= 10;
//		System.out.printf("%d \t %d%n", a, tmp);
//
//		result = result * 10 + a;
//		
//		a = tmp % 10;
//		tmp /= 10;
//		System.out.printf("%d \t %d%n", a, tmp);
//		
//		result = result * 10 + a;
//		
//		a = tmp % 10;
//		tmp /= 10;
//		System.out.printf("%d \t %d%n", a, tmp);
//		
//		result = result * 10 + a;
//		
//		a = tmp % 10;
//		tmp /= 10;
//		System.out.printf("%d \t %d%n", a, tmp);
//		
//		result = result * 10 + a;
//		
//		System.out.println(result);
		
		while (tmp != 0) {
			result = result * 10 + tmp % 10;
			tmp /= 10;
		}
		
		
		if (number == result)
			System.out.println(number + " 는 회문수 입니다.");
		else
			System.out.println(number + " 는 회문수가 아닙니다");
	}
}
