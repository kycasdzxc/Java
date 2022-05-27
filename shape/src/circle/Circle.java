package circle;

import shape.D2;
import shape.Shape;

public class Circle extends Shape implements D2 {
	public Circle(int r) {
		super(r);
	}
	@Override
	public double getCircum() {
		return 2 * Math.PI * getI();
	}
	@Override
	public double getArea() {
		return getI() * getI() * Math.PI;
	}
	
	public void setR(int r) {
		setI(r);
	}
	
	public int getR() {
		return getI();
	}
}