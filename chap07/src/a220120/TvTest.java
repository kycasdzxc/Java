package a220120;

public class TvTest {
	public static void main(String[] args) {
		Tv t;					// Tv인스턴스를 참조하기 위한 변수
		t = new Tv();			// Tv인스턴스를 생성한다.
//		t.channel = 7;			// Tv인스턴스의 멤버변수 channel의 값을 7로 한다.
		t.setChannel(7);
		t.channelDown();		// Tv인스턴스의 메서드 channelDown()을 호출한다.
		System.out.println("현재 채널은 " + t.getChannel() + " 입니다.");
		
		// 클래스의 설계 >> 사용자 정의 자료형
		
		// 자료를 저장하기 위해 사용한느 방법 >> 자료구조
		// 변수 > 배열(인덱스) > 구조체(이름) - 창고 느낌 > 클래스 : 구조체 + 기능
		
		// 자바 배열을 사용한 선택 정렬, 삽입 정렬 구현
	}

}

class Tv {
	// Tv의 속성(멤버변수)
	private String color;
	private boolean power;
	private int channel;
	
	// getter / setter
	public void setColor (String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	//
	
	public void setChannel (int channel) {
		this.channel = channel;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void setPower(boolean power) {
		this.power = power;
	}
	
	public boolean isPower() {
		return power;
	}
	
	// Tv의 기능(메서드)
	void power()		{power = !power;}	// TV를 켜거나 끄는 기능을 하는 메서드
	void channelUp()	{	  ++channel;}	// TV의 채널을 높이는 기능을 하는 메서드
	void channelDown()	{	  --channel;}	// TV의 채널을 낮추는 기능을 하는 메서드
}
