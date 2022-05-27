package a220124;

public class DefaultTest {
	public static void main(String[] args) {
		A a = new Test();
		a.m();
		
		B b = new Test();
		b.m();
		
		System.out.println(A.i);
		System.out.println(B.i);
		
		a.dm();
		
		Test t = new Test();
		t.dm();
		t.m2();
	}
}


interface A {
	int i = 10;
	void m();
	default void dm() {
		System.out.println("A.dm()");
	}
}

interface B {
	int i = 20;
	void m();
	default void dm() {
		System.out.println("B.dm()");
	}
}

interface C extends A, B {

	@Override
	default void dm() {
		// TODO Auto-generated method stub
		B.super.dm();
	}
	void m2();
}

interface D extends C {
	default void m2() {
		System.out.println("D.m2()");
	}
}

class Test implements D {

	@Override
	public void m() {
		System.out.println("Test.m()");
		
	}
}