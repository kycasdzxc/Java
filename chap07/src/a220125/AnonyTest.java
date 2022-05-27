package a220125;

// 지역변수
public class AnonyTest {
	public static void main(String[] args) {
		Runnable runnable1 = getRunnable();
		runnable1.run();
		runnable.run();
		Runnable runnable2 = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("runnable2.run()");
			}
		};
		runnable2.run();
		
		// lambda expression
		Runnable runnable3 = () -> { System.out.println("lambda.run()"); };
		runnable3.run();
	}
	static Runnable getRunnable() {
		int i = 10;
		class RunnableImpl implements Runnable {
			@Override
			public void run() {
				System.out.println("getRunnable().run()");	
			}
		}
		return new RunnableImpl();
	}
	
	static Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("runnable.run()");
		}
	};
}

interface Runnable {
	void run();
}