package stringpack;

import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Lumniar Technolab Kakkanad Kochi", " ");
		StringTokenizer sto = new StringTokenizer("Lumniar:Technolab:Kakkanad:Kochi");
		
//		System.out.println(st.nextToken()); Luminar
		
//		while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken());
//		}
		while(sto.hasMoreTokens()) {
		System.out.println("Next Token is: "+sto.nextToken(":"));}
		
	}

}
