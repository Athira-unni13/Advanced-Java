package collectionpack;
//->List allow duplicate values

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListCollectionDemo {

	public static void main(String[] args) {
		List<Integer> listArray = new ArrayList<Integer>();
		List<Integer> listLinked = new LinkedList<Integer>();
		List<Integer> listVector = new Vector<Integer>();
		List<Integer> listStack = new Stack<Integer>();
		

		listArray.add(1);
		listArray.add(2);
		listArray.add(3);
		listArray.add(4);
		listArray.add(4);

		listLinked.add(11);
		listLinked.add(12);
		listLinked.add(13);
		listLinked.add(14);
		listLinked.add(14);

		listVector.add(22);
		listVector.add(23);
		listVector.add(24);
		listVector.add(25);
		listVector.add(25);

		listStack.add(33);
		listStack.add(34);
		listStack.add(35);
		listStack.add(36);
		listStack.add(36);

		System.out.println("==============================");
		System.out.println("       ArrayList Values      ");
		System.out.println("==============================");

		for (Integer value : listArray) {
			System.out.println(value);
		}

		System.out.println("==============================");
		System.out.println("     LinkedList Values        ");
		System.out.println("==============================");

		for (Integer value : listLinked) {
			System.out.println(value);
		}

		System.out.println("==============================");
		System.out.println("        Vector Values          ");
		System.out.println("==============================");

		for (Integer value : listVector) {
			System.out.println(value);
		}

		System.out.println("==============================");
		System.out.println("        Stack Values          ");
		System.out.println("==============================");

		for (Integer value : listStack) {
			System.out.println(value);
		}

	}

}
