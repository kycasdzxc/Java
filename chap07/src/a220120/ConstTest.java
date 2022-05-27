package a220120;

public class ConstTest {
	public static void main(String[] args) {
		Object o = new String();
		Object o2 = new int[5];
		B b = new B();
		A a = new B();
		System.out.println(b.x);
		System.out.println(b.y);
		System.out.println(a.x);
		System.out.println(a.y);
//		System.out.println(a.z);
		System.out.println(((B)a).z);
//		System.out.println((String)a);
		
//		B bbb = (B)new A();
//		Exception in thread "main" java.lang.ClassCastException: a220120.A cannot be cast to a220120.B
//		at a220120.ConstTest.main(ConstTest.java:15)
		B bbb = (B)a;
		System.out.println(bbb.z);
	}
}

class A {
	int x;
	int y;
	
	A() {
		this (1,1);
	}
	
//	A () { super(); }
	A (int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(x + ", " + y + "로 초기화됨");
	}
}

class B extends A {
	int z = 10;
	B() {
		this(1);
	}
	B(int x) {
		super(x, 3);
	}
}