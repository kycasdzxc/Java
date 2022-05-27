package a220111;

public class Serial {
	public static void main(String[] args) {	
		// 20자리의 영대문자, 영소문자, 숫자의 조합을 하고 있는 문자열 제작
		String str = "";
		for (int i = 0 ; i < 20 ; i++) {
			// 26 영대문자 범위, 26 영소문자 범위, 10 숫자 범위
			int Serial = (int)(Math.random() * (26 + 26 + 10));
			
			// 숫자 조건
			if (Serial < 10) {
				str += Serial;
			}
			
			// 소문자 조건
			else if (Serial > 35) {
				str += (char)(Serial + 61);
			}
			
			// 대문자 조건
			else {
				str+= (char)(Serial + 55);
			}
			
			// 부호 조건
			if (i % 5 == 4 && i != 19) {
				str += "-";
			}
		}
			System.out.println(str);
	}
}
		
/*		for (int r = 0 ; r < 3 ; r++) {
			
			for (int i = 0 ; i < 5 ; i++) {
				int Serial = (int)(Math.random() * 74) + 48;
				if (Serial < 58 || Serial > 64 && Serial < 91 || Serial > 96) {
					System.out.print((char)Serial);
				} else i--;
			} System.out.print("-");
		} 
		
		for (int i = 0 ; i < 5 ; i++) {
			int Serial = (int)(Math.random() * 74) + 48;
			if(Serial < 58 || Serial > 64 && Serial < 91 || Serial > 96) {
				System.out.print((char)Serial);
			} else i--;
		 	
			
/*			for (int i = 0 ; i < 5 ; i++) {
				int Serial = (int)(Math.random() * 62);
					
				if (Serial / 10 == 0) {
					System.out.print(Serial);
						
				} else if ((Serial + 4) / 10 <= 3) {
					System.out.print((char)(Serial+55));
						
					} else System.out.print((char)(Serial+61));
			} System.out.print("-"); */
			
/*			for (int i = 0 ; i < 5 ; i++) {
				int Serial = (int)(Math.random() * 62);
					
				if (Serial > 9 && Serial <= 35) {
					System.out.print((char)(Serial+55));
						
				} else if (Serial > 35 && Serial <= 61) {
					System.out.print((char)(Serial+61));
						
					} else System.out.print(Serial);
			} System.out.print("-");
				
		}	for (int i = 0 ; i < 5 ; i++) {
				int Serial = (int)(Math.random() * 62);
				
				if (Serial > 9 && Serial <= 35) {
					System.out.print((char)(Serial+55));
					
				} else if (Serial > 35 && Serial <= 61) {					
					System.out.print((char)(Serial+61));
					
			} else System.out.print(Serial); */
