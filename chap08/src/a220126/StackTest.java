package a220126;

public class StackTest {
	public static void main(String[] args) {
		m1();
		System.out.println("정상종료");
		
		// runtime unchecked / 비 runtime checked
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("예외처리됨");
		}
	}
	
	static void m1() {
		try {
			m2();
		}
		catch (Exception e) {
			System.out.println("m1()예외처리");
			System.out.println(e.getClass().getName());
			System.out.println(e.getMessage());
			System.out.println(e);
		}
	}
	
	static void m2() {
		try {
			throw new NullPointerException();
//			System.out.println(0/0);
		}
		catch (NullPointerException e) {
			System.out.println("m2()예외처리");
		}
	}
}
