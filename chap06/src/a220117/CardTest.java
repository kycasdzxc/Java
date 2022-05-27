package a220117;

public class CardTest {
	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.printf("c1은 %s, %d이고 크기는 (%d, %d)%n", c1.kind, c1.number, Card.width, c1.height);
		System.out.printf("c2은 %s, %d이고 크기는 (%d, %d)%n", c2.kind, c2.number, c2.width, c2.height);
		
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		c1.width = 50;
		Card.height = 80;
		
		System.out.printf("c1은 %s, %d이고 크기는 (%d, %d)%n", c1.kind, c1.number, c1.width, c1.height);
		System.out.printf("c2은 %s, %d이고 크기는 (%d, %d)%n", c2.kind, c2.number, c2.width, c2.height);
		
		// f(x)
		
		// 1. y = f(x)
		// x : 정의역(입력)     y : 치역(출력)
		// 2. f(x) = y
		
		double y = Math.sqrt(4);	// 입력값, 출력값 다 있는 함수
		System.out.println(y);
//		System.out.println(Math.sqrt(4));
		
		y = f(10);
		System.out.println(y);
	
		
	}
	
	static int f(int i) {
		return i * i;
	}
	
	// 메서드 선언
	// 변수 선언

	int add(int a, int b) {
		return a + b;
	};

}
