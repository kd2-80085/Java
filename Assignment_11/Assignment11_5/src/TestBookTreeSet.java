/*3. In above assignment use TreeSet instead of LinkedHashSet. Use natural ordering for the Book. If any book with duplicate isbn is added, what will happen?
Books are stored in which order?
 */
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import storebook.StoreBook;

public class TestBookTreeSet {	
	public static void main(String[] args) {
		
		StoreBook sb1=new StoreBook("16",200.00,"Chaitanya Bhavar",10);//String isbn, Double price, String authorName, int quantity
		StoreBook sb2=new StoreBook("13",202.00,"Akshay Bhavar",12);
		StoreBook sb3=new StoreBook("13",100.00,"Chaitanya Bhavar",10);
		StoreBook sb4=new StoreBook("15",150.00,"Akash",10);
		StoreBook sb5=new StoreBook(null,150.00,"Akash",10);
		System.out.println();
		
		Map<String,StoreBook> map = new HashMap<>();
		
		map.put(sb1.getIsbn(),sb1);
		map.put(sb2.getIsbn(), sb2);
		map.put(sb3.getIsbn(), sb3);
		map.put(sb4.getIsbn(), sb4);
		map.put(sb5.getIsbn(), sb5);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter isbn: ");
		String isbn = sc.next();
		System.out.println(map.get(isbn));
		
		Collection<StoreBook> allValues=map.values();
		System.out.println(allValues);
		
		
	}
}