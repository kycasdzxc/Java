package chap12;

public class FruitBoxEx2 {
	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<>();
//		FruitBox<Toy> toyBox = new FruitBox<>();
	}
}

class FruitBox<T extends Fruit> extends Box<T> {
	
}