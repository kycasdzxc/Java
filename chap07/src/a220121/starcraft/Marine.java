package a220121.starcraft;

public class Marine extends Unit{

	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + "이 " + x + ", " + y + "좌표로 이동합니다.");
		
	}
	void stimPack() {
		System.out.println("스팀팩 사용");
	}
}