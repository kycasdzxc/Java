package a220111;

public class Rhombus2 {
	public static void main(String[] args) {
		int cnt = 5;
		for (int i = - cnt / 2 ; i < cnt - cnt / 2 ; i++) {
			for (int j = - cnt / 2 ; j < cnt - cnt / 2 ; j++) {
				if (Math.abs(i) + Math.abs(j) <= cnt / 2) {
//				if (i + j > 1 && i + j < 7 && i - j < 3 && j - i < 3) {
					System.out.printf("[%2d,%2d]", i, j);
				}
				else {
					System.out.printf("%7c", ' ');
				
				}
			}
			System.out.println();
		}
	}
}
