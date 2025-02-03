package collectionpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class RemveSpecialCharachters {

	public static void main(String[] args) {
		String words = new String("The String, class is immutable;The String! IS? a final class");
		StringTokenizer st = new StringTokenizer(words,",? ;!") ;
		
		List<String> wordList = new ArrayList<String>();
		String temp="";
		
		while(st.hasMoreTokens()) {
			temp = st.nextToken().toLowerCase();
			if(!wordList.contains(temp)) {
				wordList.add(temp);
			}
		}
		
		Collections.sort(wordList);
		
		for(String str:wordList) {
			System.out.println(str);
		}
		
		

	}
 
}
