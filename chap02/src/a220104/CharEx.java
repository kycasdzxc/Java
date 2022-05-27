package a220104;

public class CharEx {
	public static void main(String[] args) {
		char ch = '\uAC02';		 // char ch = 65;
		int code = (int)ch;  // ch에 저장된 값을 int타입으로 변환하여 저장한다.
		
		System.out.printf("%c=%d(%#X)%n",ch, code, code);
		
		char hch = '힣';
		System.out.printf("%c=%d(%#X)%n",hch, (int)hch, (int)hch);
		// char 의 크기 2byte
		// 2^16 = 65536
		
		// escape char
		System.out.println("\"");
		System.out.println("\'");
		
		System.out.println("가\t나     다");
		
		/*
		 * MS windows \r\n 개행문자
		 * MAC OSX	  \r
		 * LINUX	  \n
		 * 
		 * codec : coder + decoder 부호화 + 복호화
		 * 	영상 및 음성을 디지털로 해석해주는 것
		 *  음성은 wave(파형)을 가지고 있음 - 아날로그(곡선)
		 *  이 곡선을 얼마나 촘촘하게 만드냐가 바로 디지털
		 * 
		 * modem : modulator + demodulator
		 * 전화기 또한 modem을 통해 디지털화 시키는 것
		 */
		
		// byte short int long
		// 클래스의 첫글자 대문자
		System.out.println("========================");
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println("========================");
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println("========================");
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println("========================");
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		// JVM (Java Virtual Machine)
		// 메모리 자동 해제

		System.out.println("========================");
		System.out.println("int의 최대값 : " + Integer.MAX_VALUE);
		// 0 1111111 11111111 11111111 11111111 int의 최대값
		System.out.println("int의 최대값 + 1 : " + (Integer.MAX_VALUE + 1));
		// 1 0000000 00000000 00000000 00000000 int의 최소값
		System.out.println("int 최소값의 2진수 : " + Integer.toBinaryString(Integer.MIN_VALUE));
		System.out.println("-1의 2진수 : " + Integer.toBinaryString(-1));
		
	}
}
