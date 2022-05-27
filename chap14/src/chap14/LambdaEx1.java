package chap14;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface MyFunction { void run(); }
public class LambdaEx1 {
	static void execute(MyFunction f) {
		f.run();
	}
	
	static MyFunction getMyFunction() {
		return () -> System.out.println("f3.run()");
	}
	
	public static void main(String[] args) {
		MyFunction f1 = () -> System.out.println("f1.run()");
		MyFunction f2 = new MyFunction() {
			
			@Override
			public void run() {
				System.out.println("f2.run()");
			}
		};
		MyFunction f3 = getMyFunction();
		
		f1.run();
		f2.run();
		f3.run();
		
		execute(f1);
		execute(()->System.out.println("run()"));
		
		List<String> list = Arrays.asList("가", "다", "하", "라", "마","하", "라", "마","하", "라", "마","하", "라", "마", "바", "라", "마", "바", "나", "가", "다", "하", "라", "마", "바", "나");
		list.stream().distinct().limit(5).sorted().forEach(System.out::println);
		list.stream().distinct().limit(5).sorted().map(a -> a + a).forEach(System.out::println);
		
	}
}
