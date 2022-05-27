package a220111;

public class Practice2 {
	public static void main(String[] args) {
		
		for (int i = 2 ; i > 0 ; i--) {
			for (int j = 0 ; j < 5 ; j++) {

				boolean b = i + j < 3;
				boolean c = j - i < 2;
				
				if (b) {
					System.out.printf("     ");
				} else if (c) {
					System.out.printf("[%d,%d]", i, j);
				}
				
			}
			System.out.println();
		}
	} 
}
