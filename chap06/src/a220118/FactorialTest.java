package a220118;

public class FactorialTest {
	public static void main(String[] args) {
//		int result = factorial(4); // 4! >> 4 * 3 * 2 * 1
		int result = FactorialTest.factorial2(4); // 같은 클래스 내에서는 생략 가능
		System.out.println(result);
	}
	
	static int factorial2 (int n) {
		int result = 1;
		for (int i = 1 ; i <= n ; i++) {
			result *= i;
		}
		return result;
	}
	
	static int factorial (int n) {
		int result = 0;
		
		if (n == 1) {
			result = 1;
		}
		else {
			result = n * factorial(n-1);
		}
		return result;
	}
}
