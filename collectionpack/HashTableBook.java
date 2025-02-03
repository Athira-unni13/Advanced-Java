package collectionpack;

import java.util.Hashtable;
import java.util.Map;

public class HashTableBook {

	public static void main(String[] args) {
		Map<Integer,Book> books = new Hashtable<Integer,Book>();
		books.put(101,new Book(1,"ABC","DEF",245.5f));
		books.put(102,new Book(2,"GHI","JKL",250.5f));
		books.put(103,new Book(3,"MNO","PQR",205.5f));
		
		for(Map.Entry<Integer,Book> book :books.entrySet()) {
			int key = book.getKey();
			Book b = book.getValue();
			System.out.println(key+" Details: ");
			System.out.println(b.id+" "+b.bookName+" "+b.authorName+" "+b.Price);
		}

	}

}
