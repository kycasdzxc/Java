package a220104;

public class OverflowEx {
	public static void main(String[] args) {
		short sMin = -32768;
		short sMax = 32767;
		char cMin = 0;
		char cMax = 65535;
		
		// alt + 위아래 화살표 >> 이동
		// alt + ctrl + 위아래 화살표 >> 복사

		System.out.println("sMin   :: " + sMin);
		System.out.println("sMin-1 :: " + (short)(sMin-1));
		System.out.println("sMax   :: " + sMax);
		System.out.println("sMax+1 :: " + (short)(sMax+1));
		System.out.println("cMin   :: " + (int)cMin);
		System.out.println("cMin-1 :: " + (int)--cMin);
		System.out.println("cmax   :: " + (int)cMax);
		System.out.println("cmax+1 :: " + (int)++cMax);
		
		System.out.println("========================");
		System.out.println((int)Character.MAX_VALUE);
		System.out.println((int)Character.MIN_VALUE);
		
		
		/*
		 * 60.625[10]
		 * 6.0625 * 10^1
		 * 111000.101[2] >> 정규화          1.XXXXXX
		 *   1.11000101 * 2^5
		 * 고정값 변동값
		 * 
		 * float : 127 + 5 = 132 >> 10000100 지수부에 저장
		 * 
		 * 010000100 1100010100000000
		 */		
	}
}
