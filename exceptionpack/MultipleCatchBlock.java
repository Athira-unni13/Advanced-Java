package exceptionpack;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		try {
			int[] arr = new int[5];
			arr[4] = 30/2;
			
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic exception");
			
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("ArrayIndexOutOfBounds Exception");
		}catch(Exception exc) {
			System.out.println("Parent exception occured");
		}
		System.out.println("rest of the code here....");

	}

}
