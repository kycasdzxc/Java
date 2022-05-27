package a220107;

import java.util.Scanner;

public class OperatorEx25 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.printf("문자를 하나 입력하세요.>");
		
		String input = scanner.nextLine();
		ch = input.charAt(0);
		
		if(ch >= '0' && ch <= '9') {
			System.out.printf("입력하신 문자는 숫자입니다.%n");
		}
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.printf("입력하신 문자는 영문자입니다%n");
		}
	}
}
