package a220118;

public class ParamEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : d.x = " + d.x);
		
	}

	static void change(int x) {
		x = 100;
		System.out.println("change() : x = " + x);
	}
	
	static void change(Data d) {
		d.x = 1000;
		System.out.println("change() : d.x = " + d.x);
	
	}
}
