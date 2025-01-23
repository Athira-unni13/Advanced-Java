package stringpack;

public class JavaInternMethod {

	public static void main(String[] args) {
	String s1 = new String("Luminar");
	String s2 = "Luminar";
	System.out.println("s1==s2: "+(s1==s2));
	s1=s1.intern();
	System.out.println("s1==s2: "+(s1==s2));
	}

}
