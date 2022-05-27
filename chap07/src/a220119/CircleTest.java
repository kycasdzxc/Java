package a220119;

public class CircleTest {
	public static void main(String[] args) {
		// Circle 타입의 인스턴스 객체 생성 (opt : 생성자를 사용하여 세 개의 int 타입을 받게 적용)
		// 이 원의 x좌표는 ?? y좌표는 ?? 반지름 ?? 입니다.
		
		Circle circle = new Circle(10, 11, 12);
		System.out.printf("이 원의 x좌표는 %d, y좌표는 %d, 반지름은 %d입니다.", circle.c.x, circle.c.y, circle.r);
		
	}
}

class Point {
	int x; // x좌표
	int y; // y좌표
	
//	Point (int x, int y) {
//		this.x = x;
//		this.y =y;
//	}
}

class Circle {
//	int x; // x좌표
//	int y; // y좌표
//	Point c;
	Point c = new Point();
	int r; // 반지름
	
//	Circle (int x, int y, int r) {
//		c = new Point (x, y);
//		this.r = r;
	Circle (int x, int y, int r) {
		c.x = x;
		c.y = y;
		this.r = r;
//		System.out.printf("이 원의 x좌표는 %d, y좌표는 %d, 반지름은 %d입니다.", x, y, r);
	}
	
}