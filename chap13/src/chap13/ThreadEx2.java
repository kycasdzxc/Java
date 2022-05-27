package chap13;

public class ThreadEx2 {
	public static void main(String[] args) {
		new ThreadEx2_1().start();
	}
}

class ThreadEx2_1 extends Thread {

	@Override
	public void run() {
		throwException();
	}
	
	public void throwException() {
		try {
			throw new Exception();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}