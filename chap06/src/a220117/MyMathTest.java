package a220117;

public class MyMathTest {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		System.out.println("add(5L, 3L) = " + result1);

		if(result1 == 8) {
			return; // 메서드 내에서 return 키워드를 만나면 그 즉시 종료(해당 메서드)
		}
			
		long result2 = mm.subtract(5L, 3L);
		System.out.println("subtract(5L, 3L) = " + result2);

		long result3 = mm.multiply(5L, 3L);
		System.out.println("multiply(5L, 3L) = " + result3);

		double result4 = mm.divide(5L, 3L);
		System.out.println("divide(5L, 3L) = " + result4);		
		
	}
}
