package a220110;

public class For {
	public static void main(String[] args) {
		/* for (int i = 0 ; i < 3 ; i++ ) {
			System.out.println("안녕히가세요");
		} */
		
		// for (1. 초기화 ; 2.조건식 ; 4. 증감식) {
		//		3. 문장
		// }
		
		for(int i = 0 ; i < 3 ; i++) {
		System.out.println(i + "안녕히가세요");
		System.out.println(i);
		}
		
		// 1 2 3 4 2 3 4 2 3 4 탈출 ...
		
		for(int i = 10 ; i > 0 ; i -= 1) {
			System.out.println(i);
		}
		System.out.println("======================");
		for(int i = 0 ; i <= 100 ; i += 5) {
			System.out.println(i);
		}
		System.out.println("======================");
		for(int i = 0 ; i <= 20 ; i++) {
			System.out.println(i*5);
		}
		System.out.println("======================");
		
		for(int i = 2 ; i <= 9 ; i++) {
			for(int j = 1 ; j <= 9 ; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}
		
		
		System.out.println(((String)Integer.toBinaryString(3)));
	}
}
