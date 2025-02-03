package collectionpack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPreTest {

	public static void main(String[] args) {
		List al = new ArrayList(); //best practice(super interface reference point to subclass)
		al.add("Athira");
		al.add("Lumniar");
		al.add("Kochi");
		al.add("Kerala");
		al.add(45);
		
		System.out.println(al);
		//How iteration or traversal or print items
		
		Iterator iter = al.iterator();//interface
		
		System.out.println("After iteration");
		
		while(iter.hasNext()) {
			String str = (String) iter.next();
			System.out.println(str);
		}
		
		
	}

}
