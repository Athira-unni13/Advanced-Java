//Length of a character array without using any methods

//IMPORTANT
package iopack;

public class CharArrayCount {

	public static void main(String[] args) {
		int count = 0;
		char[] str = new char[26];
		
		str[0]='A';
		str[1]='T';
		str[2]='H';
		str[3]='I';
		str[4]='R';
		str[5]='A';
		
		while(str[count]!='\u0000') {
			count++;
		}
		System.out.println("length of the character array is: "+count);
		
	}

}
