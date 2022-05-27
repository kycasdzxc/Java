package a220128;

import java.util.Calendar;
import java.util.Date;

public class ToStringTest {
	public static void main(String[] args) {
		// Date, Calender
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		
		System.out.println(date);
		System.out.println(cal);
		System.out.println(date.toString());
		System.out.println(cal.toString());
		System.out.println(date.toLocaleString());
		
		// 학생 예제
		// 1. 학번 순 조회 >> 학번 기준 오름차순
		// 2. 석차 순 조회 >> 점수 기준 내림차순
		
		// student >> students
		
		// CRUD : Creat Read Update Delete
	}
}
