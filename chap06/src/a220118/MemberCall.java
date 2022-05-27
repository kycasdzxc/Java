package a220118;

public class MemberCall {
	int i; // 인스턴스 변수
	static int si; // 클래스 변수
	int i2 = si;
//	static int si2 = i2; 불가. 클래스 변수에 인스턴스 변수 대입 불가

	int i3 = i;
	static int si3 = si;
	
	void m() { // 인스턴스 메서드
		sm();
		si = 10;
	}
	
	static void sm() { // 클래스 메서드
//		m(); 불가
//		i = 10; 불가
	}
}
