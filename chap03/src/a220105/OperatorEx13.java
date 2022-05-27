package a220105;

import java.util.Calendar;

public class OperatorEx13 {
	public static void main(String[] args) {
		char c1 = 'a';
		// char c2 = c1 + 1;	변수와 리터럴의 합
		char c2 = 'a' + 1;		// 리터럴과 리터럴의 합
		char c3 = 98;
		System.out.println(c2);
		
		// D-Day 계산
		
		Calendar cal = Calendar.getInstance();
		cal.set(2022,  5, 18);
		System.out.println(cal);
		
		// 예정시간 - 현재시간
		System.out.println(System.currentTimeMillis()); // TimeMillis : 1000분의 1초로 계산
		
		long dDay = cal.getTimeInMillis();
		long now = System.currentTimeMillis();
		
		long result = dDay - now;
		System.out.println(result);							// 남은 시간: ms : 1000분의 1초 단위
		System.out.println(result / 1000);					// 남은 시간:  s : 초 단위
		System.out.println(result / 1000 / 60);				// 남은 시간:  m : 분 단위
		System.out.println(result / 1000 / 60 / 60);		// 남은 시간:  h : 시 단위
		System.out.println(result / 1000 / 60 / 60 / 24);	// 남은 시간:  d : 일 단위
		
	}
}
