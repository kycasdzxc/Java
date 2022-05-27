package a220121.starcraft;

public class Test {
	public static void main(String[] args) {
		Unit u1 = new Marine();
		Unit u2 = new Tank();
			
		Unit[] units = new Unit[5];
		units[0] = u1;
		units[1] = new Tank();
		units[2] = new Tank();
		units[3] = new Tank();
		units[4] = new Tank();
		
		for(Unit u : units) {
//			if (u instanceof Tank) {
//				((Tank)u).move(10,  20);
//			} else if (u instanceof Marine) {
//				((Marine)u).move(10,  20);
//			}
			u.move(10, 20);
		}
	}
}
