package a220105;

// 들여쓰기 : text indent { block }
// 자동 들여쓰기 : ctrl + shift + F (이클립스 기준)
// 문법 오류가 있을 시 동작 안함
public class OperatorEx14 {
	public static void main(String[] args) {
		char c = 'a';
		for (int i = 0; i < 26; i++) { 		// 블럭{} 안의 문장을 26번을 반복
			System.out.print(c++); 			// 'a'부터 26개의 문자를 출력
		}
		System.out.println();

		c = 'A';
		for (int i = 0; i < 26; i++) {		 // 블럭{} 안의 문장을 26번을 반복
			System.out.print(c++);			 // 'A'부터 26개의 문자를 출력
		}
		System.out.println();

		c = '0';
		for (int i = 0; i < 10; i++) { 		// 블럭{} 안의 문장을 10번을 반복
			System.out.print(c++); 			// '0'부터 10개의 문자를 출력
		}
		System.out.println();
		
		// 한글의 갯수는 정확히 몇개 일까요?
		System.out.println('힣' - '가' + 1);
		System.out.println(11172 / 19f);
		
		for (int i = '가'; i < '까'; i++) {
			System.out.println((char) i);
		}
		
		System.out.println('a' - 'A');
	}
}
