package a220110;

public class Switch {
	public static void main(String[] args) {
		int val = 10;
		switch (val) {
		case 1:
			System.out.println("case 1");
			break;
			
		case 2:
			System.out.println("case 2");
			break;
			
		case 3:
			System.out.println("case 3");
			break;

		default:
			System.out.println("default");
			break;
		}
		// rwx 읽기 쓰기 실행
		// 111 이런 식으로 표현 7[2]
		
		int grant = 7;
		switch (grant) {
			case 7:
				System.out.println("작성권한 취득");
			case 5:
				System.out.println("실행권한 취득");
			case 4:
				System.out.println("읽기권한 취득");
				break;
			default:
				System.out.println("권한 없음");
				break;
		}
		
	}
}
