package threadpack;
class customer{
	int Balance =10000;
	synchronized void withdrow(int amount) {
		if(amount>Balance) {
				System.out.println("Less Balance waiting for deposit");
				try {
					wait();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Going to deposit");
			}
			Balance =  Balance+amount;
			
		
	}
	synchronized void Deposit(int amount) {
		
		System.out.println("Going to deposit ");
		Balance += amount;
        System.out.println("Deposit completed!");
        notify();
	}
	
}

public class Bank  {

	public static void main(String[] args) {
		customer obj = new customer();
		new Thread() {
			public void run() {
				obj.withdrow(5000);
			}
		}.start();
		new Thread() {
			public void run() {
				obj.Deposit(20000);
			}
		}.start();
	}

}
