package a220126;

public class ExceptionEx5 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
//			throw new ArithmeticException();
			System.out.println(4);
		} catch (ArithmeticException e) {
			System.out.println(5);
		}
		System.out.println(6);
	}
}
