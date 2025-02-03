package exceptionpack;

public class TestExceptionPropogation {
	void m() {
		int data = 10 / 0;
		/*
		 * here the exception is happened. a object with informations like the type of
		 * exception, where the exception is happened etc, are sent to jvm, and the jvm
		 * search of the method that have exception handler. it search from the top to
		 * bottom, if the handler is get then it will sent the object to the handler and
		 * print the details about the exception.
		 */
	}

	void n() {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			e.printStackTrace();
			// System.out.println(e);
		}
	}

	public static void main(String[] args) {
		TestExceptionPropogation test = new TestExceptionPropogation();
		test.p();
		System.out.println("Example for exception propagation");
	}

}
