package threadpack;

class Table {
//Synchronised method ensures that only one thread can execute this method at a time on the same object
//----------------------Recourse Method----------------------------------------
	void printTable(int no) {

		synchronized (this) {
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

}
//----------------------------------------------------------------------------

//--------------------------Thread One ---------------------------------------
class MyThreadOne extends Thread {
	Table t;

	MyThreadOne(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(9);
	}
}
//----------------------------------------------------------------------------

//--------------------------Thread Two ---------------------------------------
class MyThreadTwo extends Thread {
	Table t;

	MyThreadTwo(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}
}

//----------------------------------------------------------------------------

//--------------------------Thread Three ---------------------------------------
class MyThreadThree extends Thread {
	Table t;

	MyThreadThree(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(2);
	}
}

//----------------------------------------------------------------------------

public class TestSynchronization {

	public static void main(String[] args) {
		Table t = new Table();
		
		
		MyThreadOne obj1 = new MyThreadOne(t);
		MyThreadTwo obj2 = new MyThreadTwo(t);
		MyThreadThree obj3 = new MyThreadThree(t);

		obj1.start();
		obj2.start();
		obj3.start();

	}

}
