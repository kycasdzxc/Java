package chap04;

public class Ex4_02 {
	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1 ; i <= 20 ; i++) {
			if(i % 2 != 0 && i % 3 != 0) { // !(i % 2 == 0 || i % 3 == 0)
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
