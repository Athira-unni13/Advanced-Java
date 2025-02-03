//Interview Question

package threadpack;

class ThreadKochi extends Thread{ 
	public void run() {
		while(true) {
			System.out.println("Kochi");
		}
	}
}
class ThreadLuminar extends Thread{
	public void run() {
		while(true) {
			System.out.println("Luminar");
		}
	}
}

public class LuminarKochi {
	public static void main(String[] args) {
		ThreadKochi obj1 = new ThreadKochi();//new state
		ThreadLuminar obj2 = new ThreadLuminar();//new state
		
		obj1.start();//runnable state
		obj2.start();//runnable state
	}

}
