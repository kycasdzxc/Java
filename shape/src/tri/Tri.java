package tri;

import shape.D2;
import shape.Shape;

public class Tri extends Shape implements D2 {
	private int x;
	public Tri(int x, int y) {
		super(y);
		this.x = x;
	}
	@Override
	public double getCircum() {
		return Math.sqrt(getI()*getI() + x*x) + x + getI();
	}
	@Override
	public double getArea() {
		return getI() * x / 2d;
	}
}