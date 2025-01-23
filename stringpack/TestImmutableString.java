package stringpack;

public class TestImmutableString {

	public static void main(String[] args) {

		String s = "Luminar";//stores in String  constant pool in heap.
		
		s= s.concat(" Technolab");
		System.out.println(s);
	}

}
