package stringpack;

public class StringMethds {

	public static void main(String[] args) {
		String str1 = "Luminar";// constant pool
		String str2 = "Luminar";// constant pool
		String str3 = new String("Luminar");//heap
		String str4 ="LUMINAR";
		String str5 = new String("Oracle");
		String str6 = new String("Technolab");

		
		
//==============compare memory reference using == operator===========================
		System.out.println("str1==str2:  " + (str1 == str2));// True

		System.out.println("str2==str:  " + (str2 == str3));// False

		System.out.println("str1==str:  " + (str1 == str3));// False
//=================compare values using equals()=====================================
		System.out.println("str1.equals(str2):  "+str1.equals(str2));
		
		System.out.println("str2.equals(str3):  "+str2.equals(str3));
		
		System.out.println("str1.equals(str3):  "+str1.equals(str3));
//=================compare values using equalsIgnoreCase() used to compare without considering the case================
		
		System.out.println("str1.equalsIgnoreCase(str4):  "+str1.equalsIgnoreCase(str4));
		
//=================compare values using compareTo()=====================================
		System.out.println("str1.compareTo(str2): "+str1.compareTo(str2));//0
		
		System.out.println("str5.compareTo(str3): "+str5.compareTo(str3));//positive value = Oracle > Luminar
		
		System.out.println("str3.compareTo(str5): "+str3.compareTo(str5));//negative value = Luminar < Oracle
//==================concat string============================		
		System.out.println(str1+str6);
		System.out.println(str1.concat(str6));
	}

}
