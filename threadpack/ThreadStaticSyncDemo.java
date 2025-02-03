package threadpack;

class Tables {
	// ----------------------Recourse Method----------------------------------------
	synchronized static void printTable(int no) {

		for (int i = 1; i <= 5; i++) {
			System.out.println(i * no);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class MyFirstThread extends Thread {
	public void run() {
		Tables.printTable(2);
	}
}

class MySecondThread extends Thread {
	public void run() {
		Tables.printTable(1);
	}
}

class MyThirdThread extends Thread {
	public void run() {
		Tables.printTable(3);
	}
}

public class ThreadStaticSyncDemo {

	public static void main(String[] args) {
		MyFirstThread obj1 = new MyFirstThread();
		MySecondThread obj2 = new MySecondThread();
		MyThirdThread obj3 = new MyThirdThread();
		
		
		obj1.start();
		obj2.start();
		obj3.start();

		
	}

}
