package a220124;

public class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if (f instanceof Unit) {
			System.out.println("f는 Unit 클래스의 자손입니다.");
		}

		if (f instanceof Fightable) {
			System.out.println("f는 Fightable 인터페이스를 구현했습니다.");
		}

		if (f instanceof Movable) {
			System.out.println("f는 Movable 인터페이스를 구현했습니다.");
		}

		if (f instanceof Attackable) {
			System.out.println("f는 Attackable 인터페이스를 구현했습니다.");
		}

		if (f instanceof Object) {
			System.out.println("f는 Object 클래스의 자손입니다.");
		}
		
		Unit unit = new Fighter(); // currentHP, x, y 변수 사용 가능
		Fightable fightable = new Fighter(); // attack, move 메서드 호출 가능
		fightable.attack(f);
		fightable.move(10,  20);
		Attackable attackable = new Fighter(); // atack 메서드 호출 가능
		attackable.attack(unit);
		Movable movable = new Fighter(); // move 메서드 호출 가능
		movable.move(10, 20);
	}
}


class Fighter extends Unit implements Fightable {
	public void move(int x, int y) {}
	public void attack(Unit u) {}
}

class Unit {
	int currentHP;
	int x;
	int y;
}

interface Fightable extends Movable, Attackable {}
interface Movable { void move (int x, int y); }
interface Attackable { void attack (Unit u); }