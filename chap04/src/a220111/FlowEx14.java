package a220111;

public class FlowEx14 {
	public static void main(String[] args) {
		for(int i = 1, j = 10 ; i <= 10 ; i++, j--)
			System.out.printf("%d \t %d%n", i, j);
		
		for(int i = 1 ; i <= 10 ; i++)
			System.out.printf("%d \t %d%n", i, 11-i);
		
	}
}
