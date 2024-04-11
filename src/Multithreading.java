class MultithreadingDemo implements Runnable {
	public void run() {
		try {
			System.out.println("Thread " + Thread.currentThread().getId() + " is Running.");
		}
		catch (Exception e) {
			System.out.println("Exception.");
		}
	}
}

public class Multithreading {
	public static void main(String[] args) {
		int n = 8;
		for(int i = 0; i < n; i++) {
			Thread obj = new Thread(new MultithreadingDemo());
			obj.start();
		}
	}
}