package chap04;

public class Ex4_04 {
	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0;
		for (i = 1 ; sum < 100 ; i++) {
			sum += i % 2 == 0 ? -i : i;
			System.out.println(i + " :: " + sum);
		}
		System.out.printf("i값이 %d 이상이 되었을 때 100을 넘어감", i-1);
	}
}