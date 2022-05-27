package a220103;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in); // scanner 객체(참조형 변수) 생성
	
	System.out.print("두자리 정수를 하나 입력해주세요 >>");
	String input = scanner.nextLine(); // nextLine() 입력 대기 상태 > 입력한 값을 input에 저장
	int num = Integer.parseInt(input); // String타입의 input을 int 타입의 num으로 변환
	
	/*
	 * 정수 집어넣지 않으면 에러가 뜸
	 */
	
	System.out.println("입력내용 : " + input);
	System.out.printf("num=%d%n", num);
	
	}
}
