package a220110;

public class Result {
	public static void main(String[] args) {
//		1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		int x = 10;
		boolean b1 = x > 10 && x < 20;
				
//		2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
		char ch = ' ';
		boolean b2 = ch != ' ' || ch != '\t';
		
//		3. char형 변수 ch가 'x' 또는 'X'잉ㄹ 때 true인 조건식
		boolean b3 = ch == 'x' || ch == 'X';
		
//		4. char형 변수 ch가 숫자('0'~'9')일 때 true인 조건식
		boolean b4 = ch >= '0' && ch <= '0' + 9;
		
//		5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
		boolean b5 = ch >= 'A' && ch <= 90 || ch >= 'a' && ch <= 'z';
		
//		6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때 true인 조건식
		int year = 0;
		boolean b6 = year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
		
//		7. boolean형 변수 powerOn가 false일 때 true인 조건식
		
//		8. 문자열 참조변수 str이 "yes"일 때 true인 조건식
	}
}
