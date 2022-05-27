package a220111;

public class FlowEx16 {
	public static void main(String[] args) {
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
//				boolean b = i <= j;
//				boolean b = i + j <= 4;
//				System.out.print("* ");
//				if (b) {
				System.out.printf("[%d,%d]", i, j);
//				}
//				else {
//					System.out.print("     ");
//				}
			}
			System.out.println();
		}
	}
}

