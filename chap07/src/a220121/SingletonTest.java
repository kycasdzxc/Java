package a220121;

public class SingletonTest {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton);
		System.out.println(singleton2);
		singleton = null;
		Singleton singleton3 = Singleton.getInstance();
		System.out.println(singleton3);
		System.out.println(singleton);
		
		Prototype prototype = Prototype.getInstance();
		Prototype prototype2 = Prototype.getInstance();
		Prototype prototype3 = Prototype.getInstance();
		System.out.println(prototype);
		System.out.println(prototype2);
		System.out.println(prototype3);
		
		System.out.println(singleton == singleton2);
		System.out.println(singleton3 == singleton2);
		System.out.println(prototype == prototype2);
	}
}

class Singleton { // 동일한 주소 언급
	private static Singleton singleton = new Singleton();
	private Singleton() {}
	
	public static Singleton getInstance() {
		return singleton;
	}
}

class Prototype { // 각기 다른 주소 언급
	private Prototype() {}
	public static Prototype getInstance() {
		return new Prototype();
	}
}