package a220120;

public class SuperTest2 {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}

class GrandParent {
	int x = 5;
}

class Parent extends GrandParent {
	int x = 10;
}

class Child extends Parent {
	int x = 20;
	
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}