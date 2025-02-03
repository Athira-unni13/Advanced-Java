package collectionpack;

import java.util.ArrayList;
import java.util.List;

public class FoeEachMutableTes {

	public static void main(String[] args) {
		List<StringBuilder> lst = new ArrayList<StringBuilder>();

		/*
		 * ""This is not a best practice, In this code s1,s2,s3,s4 are stored in heap,
		 * for save memory there is another way""
		 *  StringBuilder s1 = new
		 * StringBuilder("Java"); StringBuilder s2 = new StringBuilder("Athira");
		 * StringBuilder s3 = new StringBuilder("Luminar"); StringBuilder s4 = new
		 * StringBuilder("Kochi");
		 * 
		 * lst.add(s1); lst.add(s2); lst.add(s3); lst.add(s4);
		 */

		// Another way is:

		lst.add(new StringBuilder("Java"));
		lst.add(new StringBuilder("Athira"));
		lst.add(new StringBuilder("Luminar"));
		lst.add(new StringBuilder("Kochi"));

		for (StringBuilder str : lst) {
			str.append(" Kerala");
			System.out.println(str);
		}

	}

}
