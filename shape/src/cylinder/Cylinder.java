package cylinder;

import circle.Circle;
import shape.D3;
import shape.Shape;

public class Cylinder extends Shape implements D3 {
	private Circle circle;

	public Cylinder(int r, int z) {
		super(z);
		circle = new Circle(r);
	}
	
	@Override
	public double getVolumn() {
		return circle.getArea() * getI();
	}

	@Override
	public double getArea() {
		return circle.getArea() * 2 + circle.getCircum() * getI();
	}
}