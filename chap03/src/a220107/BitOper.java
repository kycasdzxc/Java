package a220107;

public class BitOper {
	public static void main(String[] args) {
		// & | ^ ~ << >> >>>
		// & | ^ 비트 간에 이항연산
		// ^ : XOR : eXclusive OR. 둘 다 참일 때 거짓
		
		System.out.println(8 & 6);
		System.out.println(8 | 6);
		System.out.println(8 ^ 6);
		
		// 1000
		// 0110
		
		// 111 : 7
		// 101 : 5
		
		
		// 010 : 2 XOR	
		// 111 : 7 OR
		// 101 : 5 AND
		
		// ~ 부정연산자. 숫자를 부정한다
		System.out.println(7);
		System.out.println(-7);
		
		System.out.print("0000000000");
		System.out.print("0000000000");
		System.out.print("000000000");
		System.out.println(Integer.toBinaryString(7));
		System.out.println(Integer.toBinaryString(~7));
		
		// ip
		// 0.0.0.0 ~ 255.255.255.255
		
		System.out.println(7 << 3);
		System.out.println(7 << 2);
		System.out.println(7 << 1);
		System.out.println(7 << 0);
		System.out.println(7 >> 0);
		System.out.println(7 >> 1);
		System.out.println(7 >> 2);
		System.out.println(7 >> 3);
		
		// 00001110 : 14 7*2^1
		// 00011100 : 28 7*2^2
		// 00111000 : 56 7*2^3
		
		// >>> ?
		
		System.out.println(Integer.toBinaryString(-1024));
		System.out.println(Integer.toBinaryString(-1024 >> 1)); // -512
		System.out.println(-1024 >> 1);
		System.out.println(Integer.toBinaryString(-1024 >>> 1)); // 부호무시 쉬프트 연산
		System.out.println(-1024 >>> 1);
		System.out.println(Integer.toBinaryString(-1024 << 1)); // -2048
		System.out.println(-1024 << 1);

	}
}
