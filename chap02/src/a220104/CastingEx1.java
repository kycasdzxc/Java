package a220104;

public class CastingEx1 {
	public static void main(String[] args) {
		double d = 85.4;
		int score = (int)d;
		String str = d + ""; //"85.4"
		// str > double
		double d2 = Double.parseDouble(str); // 중요
		
		System.out.println("score="+score);
		System.out.println("d="+d);
		
		System.out.println(300);
		System.out.println((byte)300);
		
		byte b = -2;
		int i = b;
		
		// 명시적 형변환 / 묵시적 형변환 : 문제가 없으면 생략이 가능
		
		int i2 = 10;
		// 1010 = 1.01 * 2^3
		float f = i2; // 10.0f
		float f2 = 3.14f;
				
		int i3 = (int)f2;
		
		// long(8byte) > float(4byte) : 묵시 가능 [정수스타일보다 실수스타일이 더 크기 때문]
		// float(4byte) > long(8byte)
		
		long l = (long)f;
		
		float f3 = l;
		
		// char <> short - 표현값의 범위가 서로 다름 p.82
		
	}
}
