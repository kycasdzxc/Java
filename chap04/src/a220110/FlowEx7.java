package a220110;

import java.util.Scanner;

public class FlowEx7 {
	public static void main(String[] args) {
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요. >");
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();			// 화면을 통해 입력받은 숫자를 user에 저장
		int com = (int)(Math.random() * 3) + 1;	// 1, 2, 3 중 하나가 com에 저장
		// Math.random() : 0 ~ 0.9999999999 >> 0 이상 1 미만의 난수 double 타입으로 반환
		// Math.random() * 3 : 0 ~ 2.999999999999999
		// (int)(Math.random() : 0, 1, 2
		// (int)(Math.random() : 1, 2, 3
		// 7 ~ 13까지의 수 만들기
		// Math.random() * 7 + 7 : 0 1 2 3 4 5 6
		
		// 6면체의 주사위 2번 굴렸을 때 합
		// 2 ~ 12
		// (int)(Math.random() * 11) + 2
		
		// 0000 윷 1/16
		// 0111
		// 1111
		// 1110 도 4/16 = 1/4
		// ..	걸 4/16
		// ..	개 6/16
		// ..
		// 1111 모 1/16

		
		System.out.println("당신은" + user + "입니다.");
		System.out.println("컴퓨터는" + com + "입니다.");
		
		switch (user - com) {
		case 2: case -1:
			System.out.println("당신이 졌습니다.");			
			break;
		case 1: case -2:
			System.out.println("당신이 이겼습니다.");			
			break;
		case 0:
			System.out.println("비겼습니다.");			
//			break;		// 마지막 문장이므로 break를 사용할 필요가 없다.
		}
		
	}
}
