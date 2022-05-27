package a220105;

public class OperatorEx2 {
	public static void main(String[] args) {
		int i = 5, j = 0;
		j = i++;
		System.out.printf("j = i++ 실행 후, i = %d, j = %d%n", i, j);

		i = 5; // 결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경
		j = 0;
			
		j = ++i;
		System.out.printf("j = i++ 실행 후, i = %d, j = %d%n", i, j);
		
		byte b = Byte.MAX_VALUE;
		b++;
		System.out.println(b);
		
		i = 0;
		System.out.println(~i);
		
		
		// 10 / 4 = 2 .. 2
		//  9 / 4 = 2 .. 1
		
		// 2 * 4 + 1 = 9
		
		// 9 / 0
		
		// x * 0 + y = 9
		
		// 8 / 4 = 2
		
		// 8 / 0 = ?
		
		// ? * 0 = 8
		
//		System.out.println(3/0);
		// 실수간 연산
		System.out.println(3/0f); // 무한
		System.out.println(0/0f); // NaN : Not a Number (정의할 수 없는 특수값)
		
	}
}
