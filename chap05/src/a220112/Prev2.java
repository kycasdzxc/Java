package a220112;

public class Prev2 {
	public static void main(String[] args) {
		int[] score = new int[5];
		
		// 4 8 12 16 20
				
		for (int i = 0 ; i < score.length ; i++) {
			score[i] = (i + 1) * 4;
		}	
			int[] score2 = score; // score에 담겨있는 '주소'값을 int[] 타입의 score2에 할당

			score2[3] = 100;
			
			for (int i = 0 ; i < score.length ; i++) {
				System.out.println(score[i]);
			}
		System.out.println(score[3]);
		
		System.out.println(Integer.MAX_VALUE + 1);
		System.out.println(1_000_000 * 1_000_000 * 1_000_000 * 1_000_000 * 1_000_000);
	}
}