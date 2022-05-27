package a220413;

import java.util.ArrayList;

public class FruitBoxEx3 {
	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		FruitBox<Apple> appleBox = new FruitBox<>();
		
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());

		appleBox.add(new Apple());
		appleBox.add(new Apple());
		
		System.out.println(JuiceFactory.makeJuice(fruitBox));
		System.out.println(JuiceFactory.makeJuice(appleBox));
	}
}

class Box<T> {
	ArrayList<T> list = new ArrayList<>();
	
	void add(T item) { list.add(item); }
	T get(int i) { return list.get(i); }
	int size() { return list.size(); }
	public String toString() { return list.toString(); }
}

class Fruit {
	public String toString() {
		return this.getClass().getSimpleName();
	}
}

class Apple extends Fruit {}
class Grape extends Fruit {}

class FruitBox<T extends Fruit> extends Box<T> {}

class Juice {
	String name;
	
	public Juice(String name) {
		this.name = name + "Juice";
	}
	public String toString() {
		return name;
	}
}

class JuiceFactory {
	static <T extends Fruit> Juice makeJuice(FruitBox<T> box) {
//	static Juice makeJuice(FruitBox<? extends Fruit> box) {
		String tmp = "";
		for(Fruit f : box.list) {
			tmp += f + " ";
		}
		return new Juice(tmp);
	}
		
}