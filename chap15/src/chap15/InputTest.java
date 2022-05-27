package chap15;

import java.io.IOException;

public class InputTest {
	public static void main(String[] args) {
//		int b = 0;
//		try {
//			while((b = System.in.read()) != -1) {
//				System.out.println("input : " + b + ", " + (char)b);
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		String input = nextLine("값을 하나 입력하세요 > ");
		System.out.println(input);
	}
	
	static String nextLine(String msg) {
		System.out.println(msg);
		String str = "";
		int b = 0;
		try {
			while((b = System.in.read()) != -1) {
//				System.out.println("input : " + b + ", " + (char)b);
				str += (char)b;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;
	}
}
