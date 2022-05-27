package prizm;

import shape.D3;
import shape.Shape;
import tri.Tri;

public class Prizm extends Shape implements D3 {
	private Tri tri;

	public Prizm(int x, int y, int z) {
		super(z);
		tri = new Tri(x, y);
	}
	@Override
	public double getVolumn() {
		return tri.getArea() * getI();
	}

	@Override
	public double getArea() {
		return tri.getArea() * 2 + tri.getCircum() * getI();
	}
}