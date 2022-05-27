package a220105;

public class OperatorEx8 {
	public static void main(String[] args) {
		int a = 1_000_000;	// 1,000,000  1백만
		int b = 2_000_000;	// 2,000,000  2백만
		
		long c = a * b;
		// a * b = 2,000,000,000,000  2조
		
		System.out.println(c);
		
		int result1 = a * a / a;	// 연산자의 방향 중요(왼->오)
		int result2 = a / a * a;
		System.out.println(result1);
		System.out.println(result2);
		
		// '0' > 48, 'A' > 65, 'a' > 97
		// '9' 48 + 9
		
		char ch = 91;
		System.out.println(ch++);
		System.out.println(ch++);
		System.out.println(ch++);
		System.out.println(ch++);
		System.out.println(ch++);
		System.out.println(ch++);
		System.out.println(ch++);
		
		System.out.println("======================");
		System.out.println((int)' ');
			
	}
}
