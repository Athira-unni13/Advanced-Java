package exceptionpack;

public class FinallyBlockDemo {

	public static void main(String[] args) {
		try {
			int data = 25 / 0;
			// if an exception come across then the rest of the code after exception will
			// not work
			// only include the code that will cause exception
			System.out.println(data);
			System.out.println("try block completed");
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			// if an exception come across then the rest of the code will not work
			System.out.println("Finally block will always execute.");
		}
		
		System.out.println("rest of the code");// if exception is handled
	}

}
