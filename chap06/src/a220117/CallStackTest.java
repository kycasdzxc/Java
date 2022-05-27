package a220117;

public class CallStackTest {
	public static void main(String[] args) {
		System.out.println("main 1");
		firstMethod();
		System.out.println("main 2");
	}
	static void firstMethod() {
		System.out.println("first 1");
		secondMethod();
		System.out.println("first 2");
	}
	
	static void secondMethod() {
		System.out.println("Second");
	}
}

// Program Counter

/*
 * Student.java
 * 학번, 이름, 국어, 영어, 수학 >> 필드
 * 총점, 평균 >> 국어, 영어, 수학 계산 >> 메서드
 * 
 * StudentEx.java
 * main 메서드 제작
 * 1.목록 조회 / 2.학생 등록 / 3.학생 정보 수정 / 4.학생 삭제 / 5.종료
 * 
 * ex) 1번 입력시 >> 목록 조회 메뉴입니다. 출력 후 다시 상단의 메뉴가 제 출력
 * 
 */
