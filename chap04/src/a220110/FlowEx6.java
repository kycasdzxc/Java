package a220110;

import java.util.Scanner;

public class FlowEx6 {
	public static void main(String[] args) {
		System.out.print("현재 월을 입력하세요. >");
		int month = new Scanner(System.in).nextInt();
		switch (month/3) {
		//switch ((month >= 3 && month < 6 ? 1 : (month >= 6 && month < 9 ? 2 : (month >= 9 && month < 12 ? 3 : (month == 1 || month == 11 || month == 12 ? 4 : 0))))) {
		case 1:
		/*  case 3:
			case 4:
			case 5:
		*/
			System.out.println("현재의 계절은 봄입니다.");
			break;
			
		case 2:
		// case 6: case 7: case 8:
			System.out.println("현재의 계절은 여름입니다.");
			break;
		
		case 3:
		// case 9: case 10: case 11:
			System.out.println("현재의 계절은 가을입니다.");
			break;

		default:
//		case 12: case 1: case 2:
			System.out.println("현재의 계절은 겨울입니다.");
			break;
		}
		// 계절별 case를 한개로 코드 수정
	}
	
}
