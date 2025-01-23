package stringpack;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;//reverseString;
		//reverseString="\0";
		
		System.out.print("Enter a String:  ");
		str = sc.nextLine();
		
		System.out.print("String after reverse: ");
		for(int i =str.length()-1 ;i>=0;i--) {
			//reverseString =reverseString+str.charAt(i);
			System.out.print(str.charAt(i));
			
		}
		//System.out.println("String after reverse: "+reverseString);
		sc.close();
	}

}
