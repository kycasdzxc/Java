package a220105;

public class Prev {
	public static void main(String[] args) {
		int x = 5;
		int y;
		// 4 * x + 3
		y = 4 * x + 3;
		
		System.out.println(y);
		System.out.println(4 * x + 3);
		
		// < : lt	a < b	a lesser then b
		// > : gt	a > b	a greater then b
		
		// == 같다. != 다르다.
		
		int i = +5;
		
		System.out.println(5 - 2 > 1 + 1); // - > +
		
		x = y = 10;
		
		float result = 5 / 2f; // float result = 2
		System.out.println(result);
		
		char ch1 = 97;
		char ch2 = (char)(ch1 + 1); // 산술형상승
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		ch2 = (char)(ch2 + 1);
		
		System.out.println(ch2);
		
		ch2++; // 후위형
		System.out.println(ch2);
		
		++ch2; // 전위형
		System.out.println(ch2);
		
		// ================================ e
		System.out.println(ch2++);
		System.out.println(ch2); // f
		// ================================ f
		System.out.println(++ch2);
		
		i = 5;
		i = i++ + ++i;
		// = ++ + ++ 5 + 7
		
		System.out.println(i);
	}
}
