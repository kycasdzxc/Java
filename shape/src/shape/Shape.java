package shape;

abstract public class Shape {
	private int i;
	
	public Shape(int i) {
		this.i = i;
	}
	
	protected int getI() {
		return i;
	}
	
	protected void setI(int i) {
		this.i = i;
	}
	
	abstract public double getArea(); // 넓이
}
