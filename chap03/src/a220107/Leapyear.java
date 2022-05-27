package a220107;

import java.util.Scanner;

public class Leapyear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("연도를 입력하세요. >>");		
		String input = scanner.nextLine();
		int year = Integer.parseInt(input);
		
		String result  = year % 4 != 0 ? "평년" : "윤년";
		String result2 = year % 4 != 0 ? "평년" : (year % 100 == 0 ? "평년" : "윤년");
		String result3 = year % 400 == 0 ? "윤년" : (year % 100 == 0 ? "평년" : (year % 4 == 0 ? "윤년" : "평년"));
		String result4 = year % 400 != 0 ? "평년" : "윤년";
		String result5 = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "윤년" : "평년";
		
		// System.out.println(result);
		// System.out.println(result2);
		System.out.println(result3);
		// System.out.println(result4);
		System.out.println(result5);
		
		
	}
}
