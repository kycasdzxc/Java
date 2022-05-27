package a220112;

public class FlowEx31 {
	public static void main(String[] args) {
		for (int i = 0 ; i <= 10 ; i++) { // 0 1 2 3 ... 8 9
			if ( i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
