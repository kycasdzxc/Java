package a220126;

public class ExceptionEx12 {
	public static void main(String[] args) {
		try {
			m1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void m1() throws Exception {
		m2();
	}

	static void m2() throws Exception {
		throw new Exception();
	}
}
