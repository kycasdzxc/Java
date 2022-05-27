package a220121;

public class CastingTest1 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		fe.water();
		car = fe;
		((FireEngine)car).water();
		fe2 = (FireEngine)car;
		fe2.water();
		
		Car car2 = new Car();
		
		System.out.println(fe instanceof Car);
		System.out.println(fe instanceof FireEngine);

		System.out.println(car2 instanceof Car);
		System.out.println(car2 instanceof FireEngine);
		
		System.out.println(car.getClass().getName());
		System.out.println(car.getClass().getSimpleName());
		System.out.println(car2.getClass().getName());
	}
}

class Car {
	String color;
	int door;

	void drive() {
		System.out.println("drive, Brrrr~");
	}

	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!!!");
	}
}