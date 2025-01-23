package stringpack;

public class StringMethods {

	public static void main(String[] args) {
		String str = "Luminar Technolab";
		String s = "     Luminar Technolab              ";
		
		System.out.println(str.length());
		
		System.out.println(str.substring(8));
		System.out.println(str.substring(0,7));
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		System.out.println(s.trim());//delete space in right and left
		
		System.out.println(str.startsWith("LU"));//true or false:Output=false
		System.out.println(str.endsWith("b"));//true or false:Output=True
		
		System.out.println(str.charAt(9));
		
		String repaceString = str.replace("ar", "art");
		System.out.println(repaceString);

	}

}
