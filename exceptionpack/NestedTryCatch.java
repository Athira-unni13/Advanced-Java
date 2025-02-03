package exceptionpack;

public class NestedTryCatch {

	public static void main(String[] args) {
		try {
//-------------------------------------------------------------------
			try {
				System.out.println("going to divide by 0");
				int b = 39/0;
				System.out.println(b);//it will work
			}catch(ArithmeticException e) {
				System.out.println(e);
			}
//-------------------------------------------------------------------
			try {
				int[] arr = new int[5];
				arr[5] = 56;
			}catch(ArrayIndexOutOfBoundsException ex) {
				System.out.println(ex);
			}
//-------------------------------------------------------------------
		}catch(Exception ex) {
			System.out.println("Handled the exception(Outer catch)");
		}

	}

}
