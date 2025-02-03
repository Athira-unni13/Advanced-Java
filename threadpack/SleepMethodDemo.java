package threadpack;

public class SleepMethodDemo extends Thread{
	
	public void run() {
		for(int i =1;i<=5;i++) {
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		SleepMethodDemo obj1 = new SleepMethodDemo();
		
		SleepMethodDemo obj2 = new SleepMethodDemo();		
		obj1.start();
		obj2.start();
	}

}
