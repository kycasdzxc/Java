package a211231;

public class Bit {

	public static void main(String[] args) {

		// 25
		
		/*
		 * 7
		 * 8
		 * 9
		 * .
		 * .
		 * .
		 * 18
		 * 19
		 * 20
		 * ---------------------------------------
		 *     0
		 *     1
		 *    10
		 *    11
		 *   100
		 *   101
		 *   110
		 *   111
		 *  1000
		 */
		
		System.out.println(0b100000);
		System.out.println(0b1000001);
		System.out.println(0b1011110);
		
		System.out.println(1024*1024);
		
		System.out.println(Integer.toBinaryString(65));
		
		System.out.println(Math.pow(26, 4));
		System.out.println(Math.pow(26, 8));
		System.out.println(Math.pow(82, 12));
		
		/*
		 * 55[10]
		 * 110111[2]
		 * 
		 * 1001001[2]
		 * 
		 * 1+8+64 = 73
		 * 
		 * 
		 * 456[10]
		 * = 400 + 50 + 6
		 * = 4 * 100 + 5 * 10 + 6 * 1
		 * = 4 * 10^2 + 5 * 10^1 + 6 * 10^1
		 * 
		 * 
		 * 1100[2]
		 * = 1000 + 100
		 * 
		 * = 1 * 2^3 + 1 * 2^2
		 * 
		 * 77[8] = 63
		 * 70 + 7
		 * = 7 * 8^1 + 7
		 * >>>
		 * 111111[2]
		 * 
		 * CA[16] = 202
		 * C0 + A
		 * = 12 * 16 + 10
		 * >>>
		 * 11001010[2]
		 * 
		 */
		
		System.out.println(077);
		System.out.println(0XCA);
		System.out.println(0b11001010);
	}

}
