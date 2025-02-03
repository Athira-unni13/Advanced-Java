/*Output:
Thread 2  is a user thread
Thread 1  is a Daemon thread"Frameword : Structured layout"*/

package threadpack;

public class DaemonThreadDemo extends Thread {
	DaemonThreadDemo(String name){
		super(name);
	}
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(getName()+ "  is a daemon thread");
		}else {
			System.out.println(getName()+ "  is a user thread");
		}
	}

	public static void main(String[] args) {
		DaemonThreadDemo t1 = new DaemonThreadDemo("Thread 1");
		DaemonThreadDemo t2 = new DaemonThreadDemo("Thread 2");
		
		t1.setDaemon(true);//thread 1 become daemon
		
		t1.start();//daemon thread
		t2.start();//User thread
	}

}
