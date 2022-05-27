package a220107;

import java.util.Scanner;

public class FlowEx3 {
	public static void main(String[] args) {
		System.out.print("숫자를 하나 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();	// 화면을 통해 입력받은 숫자를 input에 저장
		System.out.print("입력하신 숫자는 0");
		
		if (input == 0) {
			System.out.println("입니다.");
		} else { // input != 0인 경우
			System.out.println("이 아닙니다.");
		}
	}
}