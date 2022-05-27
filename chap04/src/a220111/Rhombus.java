package a220111;

public class Rhombus {
	public static void main(String[] args) {
		
		for (int i = 0 ; i < 3 ; i++) {
			for (int j = 0 ; j < 5 ; j++) {
				boolean b = i + j < 2;
				boolean c = i + 3 > j;
				
				if (b) {
					System.out.printf("     ");
				} else if (c) {
					System.out.printf("[%d,%d]", i, j);
				}
				
			}
			System.out.println();			
		}
		
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
		
//		for(int i = 0 ; i < 3 ; i++) {
//			for(int j = 0 ; j < 5 ; j++) { 
////				boolean b = i <= j;
////				boolean b = j <= i;
//				boolean b = i + j >= 2;
//				boolean c = i - j > 0;
//				if (c) {
//					System.out.printf("[%d,%d]", i, j);
//				} else if (b) {
//					System.out.println("     ");
//			
//				}else
//					System.out.printf("     ");
//		
//			} System.out.println();
//		}
		/* 		for(int i = 0 ; i < 5 ; i++) {
		for(int j = 0 ; j < 5 ; j++) {
			boolean b = i <= j;
//			boolean b = i + j <= 4;
//			System.out.print("* ");
			if (b) {
			System.out.printf("[%d,%d]", i, j);
			}
			else {
				System.out.print("     ");
			}
		}
		System.out.println(); */