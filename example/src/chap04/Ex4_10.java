package chap04;

public class Ex4_10 {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		while (num != 0) {
			sum += num % 10;
			num /= 10;
			System.out.println(num);
		}
		
		System.out.println("sum=" + sum);
	}
}
