package chap13;

public class ThreadJoin {
	public static void main(String[] args) throws InterruptedException {
		Calc calc1 = new Calc(1, 500000);
		calc1.start();
		calc1.join();
		System.out.println(calc1.result);
		
		Calc calc2 = new Calc(500001, 1000000);
		calc2.start();
		calc2.join();
		System.out.println(calc2.result);
		System.out.println(calc1.result + calc2.result);
	}
}

class Calc extends Thread {
	int start;
	int end;
	long result;
	
	public Calc(int start, int end) {
		this.start = start;
		this.end = end;
	}
	@Override
	public void run() {
		for(int i = start ; i <= end ; i++) {
			result += i;
		}
	}
}