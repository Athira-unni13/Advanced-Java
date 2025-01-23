package stringpack;

public class StringConstantPool {

	public static void main(String[] args) {
		String str1 = "Luminar";// constant pool
		String str2 = "Luminar";// constant pool

		String str = new String("Luminar");// heap
		
		System.out.println("str1==str2:  " + (str1 == str2));// True

		System.out.println("str2==str:  " + (str2 == str));// False

		System.out.println("str1==str:  " + (str1 == str));// False

	}

}
