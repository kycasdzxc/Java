package app;

public class Test {
	public static void main(String[] args) {
//		// utf-16 한글 2byte 영어 2byte
		String str = "abcd";
		String str2 = "가나다라";
		
		System.out.println("123456789012345678901234567890");
		System.out.printf("|%8s|%n", str);
		System.out.printf("|%8s|%n", str2);
		
//		System.out.println();
//		
//		System.out.printf("|" + convert(str, 8) + "|%n");
//		System.out.printf("|" + convert(str2, 8) + "|%n");
		
		
		
//		String formatter = String.format("%%%ds%%%ds%%%ds%%n", 10-getKorCnt(str2), 10, 10);
//		System.out.printf(formatter, str2, str, str);
//		String formatter = "%" +7+ "s" + "%" + 10 + "s" + "%" +10+"s" +"%n";

//		System.out.print(convert(str, 10));
//		System.out.print(convert(str2, 10));
//		System.out.println();
//		System.out.println(getKorCnt(str2));

	}
	// static 매개변수 : 문자열 리턴 : 한글 개수
	
	private static int getKorCnt(String kor) {
		int cnt = 0;
		for (int i = 0 ; i < kor.length() ; i++) {
			if (kor.charAt(i) >= '가' && kor.charAt(i) <= '힣') {
				cnt++;
			}
		} return cnt;
	}
	
	public static String convert(String word, int size) {
		String formatter = String.format("%%%ds", size -getKorCnt(word));
		return String.format(formatter, word);
	}
}