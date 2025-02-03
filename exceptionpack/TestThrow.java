package exceptionpack;

public class TestThrow {
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("person is not eligible to vote");
		}else {
			System.out.println("You are eligible");
		}
	}

	public static void main(String[] args) {
		try {
			validate(16);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}

}
