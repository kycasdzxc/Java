package a220117;

import java.util.Scanner;

public class StudentEx {
	public static void main(String[] args) {

		int menu = 0;

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("1. 목록 조회");
			System.out.println("2. 학생 등록");
			System.out.println("3. 학생 정보 수정");
			System.out.println("4. 학생 삭제");
			System.out.println("5. 종료");
			System.out.print("원하는 메뉴(1~5)를 선택하세요.");

			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);

			if (menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (!(menu >= 1 && menu <= 5)) {
				System.out.println("메뉴를 잘못 선택하셨습니다.");
				System.out.println();
			} else {
			
				switch (menu) {
				case 1:
					System.out.println();
					System.out.println("1. 목록 조회입니다.");
					System.out.println();
					break;
	
				case 2:
					System.out.println();
					System.out.println("2. 학생 등록입니다.");
					System.out.println();
					break;
	
				case 3:
					System.out.println();
					System.out.println("3. 학생 정보 수정입니다.");
					System.out.println();
					break;
	
				case 4:
					System.out.println();
					System.out.println("4. 학생 삭제입니다.");
					System.out.println();
					break;
				}
			}
		}
	}
}
