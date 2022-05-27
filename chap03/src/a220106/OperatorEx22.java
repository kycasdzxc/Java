package a220106;

public class OperatorEx22 {
	public static void main(String[] args) {
		float f = 0.1f;
		double d = 0.1;
		double d2 = (double)f;
		
		System.out.printf("10.0 == 10.0f %b%n", 10.0 == 10.0f);
		System.out.printf("0.1 == 0.1f %b%n", 0.1 == 0.1f);
		System.out.printf("f = %19.17f%n", f);
		System.out.printf("d = %19.17f%n", d);
		System.out.printf("d2 = %19.17f%n", d2);
		System.out.printf("d == f %b%n", d == f);
		System.out.printf("d == d2 %b%n", d == d2);
		System.out.printf("d2 == f %b%n", d2 == f);
		System.out.printf("(float)d == f %b%n", (float)d == f);
		
		// .java
		
		// Hello.java(원시파일) >>>>> compile >>>>> Hello.class(바이트코드, 바이너리파일) >>>>> interpret >>>>> 실행
		
		// error
		// 1. 문법 오류
		// 2. 실행 중 오류
		   // 논리, 물리
		
		// 논리적 오류 : 개발자가 원하는대로 안되는 경우/ 코딩 비둘기		
		// 물리적 오류
		// System.out.println(3/0) 에러. 시스템 보호를 위해
		// System.out.println("이건 출력이 안됨");
		
		// 기계어
		// 어셈블러 LDA 불러오기 STO 저장하기
		// 절차형 언어 (C언어)
		// 객체지향 언어 (java)
		
	}
}
