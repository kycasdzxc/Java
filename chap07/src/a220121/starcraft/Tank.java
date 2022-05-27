package a220121.starcraft;

public class Tank extends Unit{

	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + "이 " + x + ", " + y + "좌표로 이동합니다.");
		
	}
	void changeMode() {
		System.out.println("시즈모드 변경");
	}
	
}
