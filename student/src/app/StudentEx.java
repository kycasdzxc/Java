package app;

import service.StudentService;
import service.StudentServiceImpl;
import utils.StudentUtil;

public class StudentEx {  
	public static void main(String[] args) {
		StudentService service = new StudentServiceImpl();
		// 1. 목록 조회 2. 학생 등록 3. 학생 정보 수정 4. 학생 삭제 5. 종료

		for (boolean b = true ; b ;) {	
			try {
			
				int input = StudentUtil.nextInt("1. 목록 조회 2. 학생 등록 3. 학생 정보 수정 4. 학생 삭제 5. 종료\n", 1, 5);
				
				switch (input) {
				case 1:
					System.out.println("목록 조회입니다.");
					service.list();
					break;
					
				case 2:
					System.out.println("학생 등록입니다.");
					service.register();
					break;
					
				case 3:
					System.out.println("학생 정보 수정입니다.");
					service.modify();
					break;
					
				case 4:
					System.out.println("학생 삭제입니다.");
					service.remove();
					break;
					
				case 5:
					System.out.println("종료합니다.");
					b = false;
					break;
					
				default:
					System.out.println("올바른 번호를 입력하세요.");
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("숫자 형식으로 입력해주세요.");
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}