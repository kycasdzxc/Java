package a220128;

import java.lang.reflect.Method;
		// 간접 호출
public class Test {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Card card = new Card();
		
		Class c1 = card.getClass();
		Class c2 = Card.class;
		Class c3 = Class.forName("a220128.Card");
		
		Card card2 = (Card)c1.newInstance();
		
		System.out.println(card2);
		
		System.out.println(c2);
		System.out.println(c2.getSuperclass());
		
		Method[] methods = c3.getDeclaredMethods();
		for(Method m : methods) {
			System.out.println(m.getName());
		}
		
	}
}
