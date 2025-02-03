package threadpack;


public class ThreadDemo extends Thread {
	
	public void run() {
		System.out.println("This code is running in a tread!");
	}

	public static void main(String[] args) {
		ThreadDemo thread = new ThreadDemo();
		thread.start();
		System.out.println("This code is running in main thread!");
	}

}
