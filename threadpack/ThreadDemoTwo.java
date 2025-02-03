package threadpack;

public class ThreadDemoTwo implements Runnable {
	
	@Override
	public void run() {
		System.out.println("This code is running in a thread!");
	}

	public static void main(String[] args) {
		ThreadDemoTwo threads = new ThreadDemoTwo();
		Thread thread = new Thread(threads);
		thread.start();
		System.out.println("This code is running in main thread!");
	}

}
