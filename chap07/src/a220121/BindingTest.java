package a220121;

public class BindingTest {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		System.out.println(A.si);
		System.out.println(B.si);
		A.sm();
		B.sm();
		
		// 다형성 적용
		a = b;
		
		System.out.println(a.i);
		System.out.println(b.i);
		System.out.println(a);
		System.out.println(b);
		a.m();
		b.m();
		
		// 동적 바인딩
		// 인스턴스 메서드는 중복선언한 경우(오버라이딩) 실제 인스턴스의 메서드를 호출한다.
		
	}
}

class A {
	int i = 10;
	static int si = 20;
	
	void m() {
		System.out.println("A.m()");
	}
	static void sm() {
		System.out.println("A.sm()");
	}
}

class B extends A {
	int i = 30;
	static int si = 40;
	
	void m() {
		System.out.println("B.m()");
	}
	static void sm() {
		System.out.println("B.sm()");
	}
}