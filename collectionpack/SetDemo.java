package collectionpack;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		Set<Integer> setHash = new HashSet<Integer>();
		Set<Integer> setLinked = new LinkedHashSet<Integer>();
		Set<Integer> setTree = new TreeSet<Integer>();
		
		//Any order
		set.add("Java");
		set.add("JSP");
		set.add("Hibernet");
		set.add("Java");//set doesn't allow duplicate
		set.add("JSP");
		
		
		//Any order
		setHash.add(23);
		setHash.add(79);
		setHash.add(6);
		setHash.add(14);
		setHash.add(75);
		setHash.add(2);
		
		//Inserted order
		setLinked.add(23);
		setLinked.add(79);
		setLinked.add(6);
		setLinked.add(14);
		setLinked.add(75);
		setLinked.add(2);
		
		//Sorted Order
		setTree.add(23);
		setTree.add(79);
		setTree.add(6);
		setTree.add(14);
		setTree.add(75);
		setTree.add(2);
		
		System.out.println("==============================");
		System.out.println("    Traversing using enumeration\n============================== ");
		Enumeration e = Collections.enumeration(set);
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		System.out.println("==============================");
		System.out.println("    HashSet Integer Values\n==============================");
		for(Integer value:setHash) {
			System.out.println(value);
		}
		
		
		System.out.println("==============================");
		System.out.println("   LinkedSet Integer Values\n==============================");
		for(Integer value:setLinked) {
			System.out.println(value);
		}
		
		
		System.out.println("==============================");
		System.out.println("    TreeSet Integer Values\n==============================");
		for(Integer value:setTree) {
			System.out.println(value);
		}
	}
 
}
/* Output
 * Java
	JSP
	Hibernet */
