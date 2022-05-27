package a220117;

public class TvTest4 {
	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3];	// Tv타입의 배열 >> Tv인스턴스가 들어갈 수 있는 3개의 공간
		
		for (int i = 0 ; i < tvArr.length ; i++) {
			tvArr[i] = new Tv(); // 각 Tv배열 내의 공간에 인스턴스 생성 후 대입
			tvArr[i].channel = i + 10;
		}
		
		// NullPointerException : null 객체의 멤버를 접근할 때 발생 >> 인스턴스 초기화 여부를 확인
		
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp(); // 메서드 호출. 자기 인스턴스의 channel 1 증가
			System.out.printf("tvArr[%d].channel : %d%n", i, tvArr[i].channel);
		}
		
		for (Tv t : tvArr) {
			System.out.printf("tvArr.channel : %d%n", t.channel);
		}
		
		String str = "abcde";
		System.out.println(str.substring(2));
	}
}
