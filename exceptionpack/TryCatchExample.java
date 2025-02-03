package exceptionpack;

public class TryCatchExample {

	public static void main(String[] args) {
		try {
		int data=5/0;//ArithmeticException
		}catch(ArithmeticException e) {
			//System.out.println(e); don't use this
//			System.out.println(e.getMessage());don't use this
//			System.out.println("error");don't use this
			e.printStackTrace();//Use this
		}
		System.out.println("Rest of code");
	}

}
