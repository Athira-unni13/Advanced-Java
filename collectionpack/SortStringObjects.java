package collectionpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStringObjects {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		Collections.addAll(list,"Java","C++","C","AI");
		
		System.out.println("Before Sorting:\n====================");
		for(String str:list) {
			System.out.println(str);
		}
		
		Collections.sort(list);
		
		System.out.println("After Sorting:\n====================");
		for(String str:list) {
			System.out.println(str);
		}
	}

}
