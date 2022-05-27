package utils;

import java.util.Scanner;

import exception.RangeException;

public class StudentUtil {
	private static Scanner scanner = new Scanner(System.in);
	
	public static String nextLine(String input) {
		return nextLine(input, false);
	}
	
	public static String nextLine(String input, boolean korean) {
		System.out.print(input);
		String str = scanner.nextLine();
		if (korean) {
			for (int i = 0 ; i < str.length() ; i++) {
				if (str.charAt(i) < '가' || str.charAt(i) > '힣') {
					throw new RuntimeException("한글로 입력해주세요.");
				}
			}
		}
		return str;
	}
	
	public static int nextInt(String input) {
		return nextInt(input, 0, 100);
	}
	
	public static int nextInt(String input, int start, int end) {
		int result = Integer.parseInt(nextLine(input));
		if (start > result || end < result)
			throw new RangeException(start, end);
		return result;
	}
}
