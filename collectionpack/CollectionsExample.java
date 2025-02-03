package collectionpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		String[] arrStr = new String[] {"c++","c","Java"};
		
		list.add("Athira");
		list.add("Akhila");
		list.add("Sneha");
		
		
		Collections.addAll(list, "Aswani","Sreya","Surya");
		Collections.addAll(list, arrStr);
		
		for(String str : list) {
			System.out.println(str);
		}
		
	}

}
/* 
OutPut: 
Athira
Akhila
Sneha
Aswani
Sreya
Surya
c++
c
Java*/