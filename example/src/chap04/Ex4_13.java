package chap04;

public class Ex4_13 {
	public static void main(String[] args) {
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		// charAt(int i) 반복문을 이용해서 문자열의 문자를 하나씩 읽어서 검사한다.
		// 모든 글자가 숫자이어야 한다.
		// 대우. 단 하나의 글자도 문자가 있어서는 안된다.
		
		for (int i = 0 ; i < value.length(); i++) {
			ch = value.charAt(i);
			System.out.println(ch);
			
			if (!(ch >= '0' && ch <= '9')) {
				isNumber = false;
				break;
			}
		}
		
			if (isNumber) {
				System.out.println(value + " 는 숫자입니다");
			} else {
				System.out.println(value + " 는 숫자가 아닙니다");
		
		}
	}
}
