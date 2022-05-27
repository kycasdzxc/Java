package a220110;

public class YutPlay {
	public static void main(String[] args) {
		
		for (int i = 0 ; i < 20 ; i++) {
			int play = (int)(Math.random() * 16 + 1);
			
			switch (play) {
			case 1:
				System.out.println("\'빽도\'입니다.");
				break;
				
			case 2: case 3: case 4:
				System.out.println("\'도\'입니다.");
				break;
				
			case 5: case 6: case 7: case 8: case 9: case 10:
				System.out.println("\'개\'입니다.");
				break;
				
			case 11: case 12: case 13 : case 14:
				System.out.println("\'걸\'입니다.");
				break;
				
			case 15:
				System.out.println("\'윷\'입니다.");
				break;
				
			case 16:
				System.out.println("\'모\'입니다.");
				break;
				
			default:
				break;
			}
		}
	}
}
