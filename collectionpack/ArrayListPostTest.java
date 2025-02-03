package collectionpack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPostTest {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>(); //best practice(super interface reference point to subclass)
		al.add("Athira");
		al.add("Lumniar");
		al.add("Kochi");
		al.add("Kerala");
		//al.add(23); here integer value can't add becouse we already specified that its a String type
		
		System.out.println(al);
		//How iteration or traversal or print items
		
		System.out.println("=======================================");
		System.out.println("After iteration using iterator by while loop\n====================================");
		Iterator<String> iter = al.iterator();//interface "If we don't specify the type then it will convert the the value to object"
		
		
		
		while(iter.hasNext()) {
			String str = (String) iter.next();
			System.out.println(str);
		}
		System.out.println("=======================================");
		
		System.out.println("After for each loop\n=======================================");
		
		for(String str : al) {
			System.out.println(str);
		}
		
	}

}
