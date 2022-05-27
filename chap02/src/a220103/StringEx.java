package a220103;

public class StringEx {
	public static void main(String[] args) {
		String name = "Ja" + "va"; // String 첫글자는 대문자
		String str = name + 8.0;
		
		System.out.println(name);
		System.out.println(str);
		
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + ""); // 덧셈기호는 진행방향이 중요. 산술방향 왼->오
		System.out.println("" + 7 + 7);
		
		// --------------------------------------
		System.out.println(7 + '7'); // 문자형은 48 = 0 ASCII문자
		
		
	}
}
