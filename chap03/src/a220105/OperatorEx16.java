package a220105;

public class OperatorEx16 {
	public static void main(String[] args) {
		float pi = 3.141592f;
		float shortPi = (int) (pi * 1000) / 1000f;
		// (int) 3141.592f
		// 3141 / 1000f
		// 3.141
		System.out.println(shortPi);

		float shortPi2 = (int) (pi * 1000 + 0.5) / 1000f;
		// (int) 3141.592f
		// 3141 / 1000f
		// 3.141
		System.out.println(shortPi2);
		
		// 올림 ceil	천장
		// 내림 floor	바닥
		
		System.out.println(Math.PI);
		System.out.println(Math.floor(pi));	// 내림(정수 기준)
		System.out.println(Math.ceil(pi));	// 올림(정수 기준)
		System.out.println(Math.round(pi));	// round는 int 타입
	}
}
