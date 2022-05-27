package chap13;

public class ThreadSync {
	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		
		Worker worker1 = new Worker(counter);
		Worker worker2 = new Worker(counter);
		worker1.start();
		worker2.start();
		worker1.join();
		worker2.join();
		
		System.out.println(counter.count);
	}
}

class Worker extends Thread {
	Counter counter;

	public Worker(Counter counter) {
		this.counter = counter;
	}
	@Override
	public void run() {
		for(int i = 0 ; i < 100000 ; i++) {
			counter.increase();
		}
	}
}

class Counter {
	int count;

	/* synchronized */ void increase() {
		synchronized (this) {
			count++;
		}
	}
}