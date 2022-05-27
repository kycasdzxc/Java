package a220107;

public class ShortEval {
	public static void main(String[] args) {
		
		System.out.println(true && true);
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(true && false);
		
		int i = 0;
		System.out.println(i != 0 && 10 / i > 10); // false

//		System.out.println(i != 0 & 10 / i > 10); // false

		// & 는 모든 항을 다 검토함. && 는 앞에 항부터 come on!
		
	}
}
