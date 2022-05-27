package chap12;

import java.util.ArrayList;

class Box<T> {
	ArrayList<T> list = new ArrayList<>();
	void add(T item) { list.add(item); };
	T get(int i) { return list.get(i); };
	int size() { return list.size(); };
	public String toString() { return list.toString(); };
}

interface Eatable {}

class Fruit implements Eatable {
	public String toString() {
		return this.getClass().getSimpleName();
	}
}

class Apple extends Fruit {}
class Grape extends Fruit {}

class Toy {
	public String toString() {
		return this.getClass().getSimpleName();
	}
}

public class FruitBoxEx1 {
	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<Fruit>();
//		Box<Fruit> grapeBox = new Box<Apple>(); >> error. 제네릭 타입 간에는 상속이 되지 않는다.
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> toyBox = new Box<Toy>();
//		Box<Grape> grapeBox = new Box<Apple>();

		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());

		appleBox.add(new Apple());
		appleBox.add(new Apple());
//		appleBox.add(new Toy());
		
		toyBox.add(new Toy());
//		toyBox.add(new Apple());
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
	}
}
