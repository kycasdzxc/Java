package a220117;

public class Tv {
	String color;
	boolean power;
	int channel;
	
	void power()		{power = !power;}
	void channelUp()	{	  ++channel;}
	void channelDown()	{	  --channel;}
	
	// 스타크래프트
	// 테란, 저그, 프로토스
	// 배럭 >> 마린
	
	// 마린을 프로그래밍화
	// 속성 ---------
	// 체력 : 40/40
	// 현재체력 >> 인스턴스변수
	// 최대체력 >> 클래스변수
	// 데미지 : 6 + 1 + 1 + 1 >> 클래스변수
	// 킬수 >> 인스턴스변수
	// 마린생성을 위한 자원 : 미네랄 50
	
	// 기능
	// 스팀팩 사용
	
	// 상속 ---------
	// 소형유닛
	// 종족
	
	// 인터페이스 ---
	// 뚜벅이
	// 원거리 딜링을 할 수 있다.
	// 벙커로 들어갈 수 있다.
	
}