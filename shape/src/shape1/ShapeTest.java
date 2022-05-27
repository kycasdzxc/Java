package shape1;

import circle.Circle;
import cylinder.Cylinder;
import prizm.Prizm;
import shape.D2;
import shape.D3;
import shape.Shape;
import tri.Tri;

// shape : 도형
// 하위 클래스 제작(2차원 도형, 3차원 도형)
// 2차원 도형 : 원, 사각형, 직각삼각형 >> 둘레, 넓이값 계산
// 원 : r
// 사각형 : x, y
// 직각삼각형 : x, y

// 3차원 도형 : 원기둥, 육면체, 삼각기둥 >> 겉넓이, 부피 계산
// 

// Shape[] shapes = new Shape[6];
// shapes[0] = new Circle(5);

// 추상클래스, 인터페이스 적절히 활용하여 제작

// 반지름 값을 확인?
// 반지름 값을 변경?

public class ShapeTest {
	public static void main(String[] args) {
		Circle circle = new Circle(3);
		System.out.println(circle.getArea());
		System.out.println(circle.getCircum());
		
//		Square square = new Square(2, 2);
//		System.out.println(square.getArea());
//		System.out.println(square.getCircum());
		
		Tri tri = new Tri(3, 4);
		System.out.println(tri.getArea());
		System.out.println(tri.getCircum());
		
		Cylinder cylinder = new Cylinder(3, 4);
		System.out.println(cylinder.getArea());
		System.out.println(cylinder.getVolumn());
		
		Prizm prizm = new Prizm(3, 4, 5);
		System.out.println(prizm.getArea());
		System.out.println(prizm.getVolumn());
		
		Shape[] shapes = new Shape[4];
		shapes[0] = new Circle(3);
		shapes[1] = new Tri(3, 4);
		shapes[2] = new Cylinder(3, 4);
		shapes[3] = new Prizm(3, 4, 5);
		
		for(Shape s : shapes) {
			System.out.println(s.getClass().getSimpleName() + "의 넓이는" + s.getArea());
			if(s instanceof D2) {
				System.out.println(s.getClass().getSimpleName() + "의 둘레는" + ((D2)s).getCircum());
			}
			if(s instanceof D3) {
				System.out.println(s.getClass().getSimpleName() + "의 부피는 " + ((D3)s).getVolumn());
			}
		}
	}
}