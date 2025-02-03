package collectionpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortWrapperClass {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		Collections.addAll(list, 1,3,5,6);
		
		System.out.println("Before Sorting\n======================");
		for(int i:list) {
			System.out.println(i);
		}
		
		Collections.sort(list);
		
		System.out.println("After Sorting\n======================");
		for(int i:list) {
			System.out.println(i);
		}
	}

}
