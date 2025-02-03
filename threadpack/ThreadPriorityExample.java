package threadpack;
class ThreadWelcome extends Thread{
	
	ThreadWelcome(String name){
		super(name);
	}
	public void run() {
		System.out.println("Welcome...");
	}
}

class ThreadWelcomeToLuminar extends Thread{
	
	ThreadWelcomeToLuminar(String name){
		super(name);
	}
	
	public void run() {
		System.out.println("To Luminar");
	}
}

class ThreadWelcomeToKochi extends Thread{
	
	ThreadWelcomeToKochi(String name){
		super(name);
	}
	
	public void run() {
		System.out.println("Kochi");
	}
}
public class ThreadPriorityExample {

	public static void main(String[] args) {
		ThreadWelcome obj1 = new ThreadWelcome("Obj1-Welcome-to-Thread");
		ThreadWelcome obj2 = new ThreadWelcome("Obj2-Welcome-to-Thread");
		
		ThreadWelcomeToLuminar obj3 = new ThreadWelcomeToLuminar("Obj3-Welcome-to-Lumniar-Thread");
		ThreadWelcomeToLuminar obj4 = new ThreadWelcomeToLuminar("Obj4-Welcome-to-Lumniar-Thread");

		ThreadWelcomeToKochi obj5 = new ThreadWelcomeToKochi("Obj5-Welcome-to-Kochi-Thread");
		ThreadWelcomeToKochi obj6 = new ThreadWelcomeToKochi("Obj6-Welcome-to-Kochi-Thread");
		
		obj1.start();
		obj2.start();
		obj3.start();
		obj4.start();
		obj5.start();
		obj6.start();
		

		obj1.setPriority(1);
		obj2.setPriority(10);
		obj3.setPriority(5);
		
		obj4.setPriority(Thread.MAX_PRIORITY);
		obj5.setPriority(Thread.MIN_PRIORITY);
		obj6.setPriority(Thread.NORM_PRIORITY);
		
		System.out.println(obj1.getName()+" : "+obj1.getPriority());
		System.out.println(obj2.getName()+" : "+obj2.getPriority());
		System.out.println(obj3.getName()+" : "+obj3.getPriority());
		System.out.println(obj4.getName()+" : "+obj4.getPriority());
		System.out.println(obj5.getName()+" : "+obj5.getPriority());
		System.out.println(obj6.getName()+" : "+obj6.getPriority());
	}

}
