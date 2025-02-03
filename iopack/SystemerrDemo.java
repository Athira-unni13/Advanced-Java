package iopack;

public class SystemerrDemo {

	public static void main(String[] args) {
		try {
		int d =10/0;
		}catch(ArithmeticException e) {
			System.out.println("error");
			System.err.print("error");
		}

	}

}
