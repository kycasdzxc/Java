package a220121.starcraft;

public abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println(getClass().getSimpleName() + " 멈춤");
	}
}
