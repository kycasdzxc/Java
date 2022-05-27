package a220117;

import a220117.Tv;

public class TvTest2 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1의 channel 값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel 값은 " + t2.channel + "입니다.");
		
		t1.channel = 7;
		System.out.println("t1의 채널값을 7로 변경하였습니다.");
		t2 = t1; // t1의 주소를 t2에 저장
		t2.channel = 10;
		
		System.out.println("t1의 channel 값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel 값은 " + t2.channel + "입니다.");
		
	}

}