package a220112;

public class FlowEx33 {
	public static void main(String[] args) {

		outer :
		for (int i = 2 ; i <= 9 ; i++) {
			for (int j = 1 ; j <= 9 ; j++) {
				if (j == 5) {
//					break;
//					continue;
//					break outer;
					continue outer;
				}
				System.out.printf("%d * %d = %d%n", i, j, i * j);
			}
		}
	}
}
