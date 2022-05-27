package chap05;

import java.lang.reflect.Array;

public class Ex5_08 {
	public static void main(String[] args) {
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];

		for (int i = 0; i < answer.length; i++) {
			// (1) 알맞은 코드를 넣어 완성하시오
			// counter[answer[i] - 1]++;
			
			switch (answer[i] - 1) {
				case 0:
					counter[0]++;
//					break;
					
				case 1:
					counter[1]++;
//					break;

				case 2:
					counter[2]++;
//					break;
				
				case 3:
					counter[3]++;
					break;
			}
			
			
		}
		for (int i = 0; i < counter.length; i++) {
			System.out.print(counter[i]);

			for (int j = 0; j < counter[i]; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}
}
