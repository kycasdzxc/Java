package chap05;

public class Ex5_10 {
	public static void main(String[] args) {
		char[] abcCode =
			{ '`', '~', '!', '@', '#', '$', '%', '^', '&', '*',
			  '(', ')', '-', '_', '+', '=', '|', '[', ']', '{',
			  '}', ';', ':', ',', '.', '/'};
						// 0   1   2   3   4   5   6   7   8   9
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		
		String src = "abc123";
		String result = "";
		
//		char ch1 = src.charAt(0);
//		System.out.println(ch1);
//		// a = 0
//		int x = (char)(ch1 - 97);
//		System.out.println(abcCode[x]);
		
		
		// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for (int i = 0 ; i < src.length() ; i++) {
			char ch = src.charAt(i);
			// System.out.println(ch);
			
			if (ch >= 'a' && ch <= 'z') {
				int a = ch - 'a';
				result += abcCode[a];
				
			} else if (ch >= '0' && ch <= '9') {
				int n = ch - '0';
				result += numCode[n];
			}
			
		}
		
		System.out.println("src:" + src);
		System.out.println("result:" + result);
	}

}
