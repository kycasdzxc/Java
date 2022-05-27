package chap04;

public class Ex4_09 {
	public static void main(String[] args) {
		String str = "12345";
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));

		int sum = 0;
		
		for (int i = 0 ; i < str.length() ; i++) {
			
			sum += str.charAt(i) - '0';
		}
		
		System.out.println("sum=" + sum);
	}
}
