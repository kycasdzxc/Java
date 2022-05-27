package a220110;

public class YutPlay2 {
	public static void main(String[] args) {
		
		int r1 =(int)(Math.random() * 2); // 0, 1
		int r2 =(int)(Math.random() * 2) * 3; // 0, 3
		int r3 =(int)(Math.random() * 2) * 5; // 0, 5
		int r4 =(int)(Math.random() * 2) * 7; // 0, 7
		
		// 0 1 2 3 4
		switch (r1 + r2 + r3 + r4) {
		case 0:
			System.out.println("모");
			break;
			
		case 1:
			System.out.println("도");
			break;

		case 2:
			System.out.println("개");
			break;

		case 3:
			System.out.println("걸");
			break;

		case 4:
			System.out.println("윷");
			break;
			
		default:
			break;
		}
	}
}
