/*2. In above assignment use LinkedHashSet instead of HashSet.
 *  If any book with duplicate isbn is added, what will happen? Books are stored in which order?
 */
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

import storebook.StoreBook;

public class TestBookLinkedHashSet {	
	public static void main(String[] args) {
		
		StoreBook sb1=new StoreBook("16",200.00,"Chaitanya Bhavar",10);//String isbn, Double price, String authorName, int quantity
		StoreBook sb2=new StoreBook("13",202.00,"Akshay Bhavar",12);
		StoreBook sb3=new StoreBook("13",100.00,"Chaitanya Bhavar",10);
		StoreBook sb4=new StoreBook("15",150.00,"Akash",10);
		
	
		Set<StoreBook> linkedhashset=new LinkedHashSet<StoreBook>();
		
		linkedhashset.add(sb1);
		linkedhashset.add(sb2);
		linkedhashset.add(sb3);
		linkedhashset.add(sb4);
		
		Iterator<StoreBook> sbit=linkedhashset.iterator();
		
		while(sbit.hasNext())
		{
			StoreBook sbtemp=sbit.next();
			System.out.println(sbtemp);
		}
		//Before hashcode override on isbn 
		/*
		Duplicates with isbn are getting added & all in In order of insertion
		StoreBook : [isbn=16, price=200.0, authorName=Chaitanya Bhavar, quantity=10]
		StoreBook : [isbn=13, price=202.0, authorName=Akshay Bhavar, quantity=12]
		StoreBook : [isbn=16, price=100.0, authorName=Chaitanya Bhavar, quantity=10]
		StoreBook : [isbn=15, price=150.0, authorName=Akash, quantity=10]
		 */
		//After hashcode override on isbn 
		
				/*
				 * Duplicates with isbn are not added  
				Duplicates with isbn are getting added
				StoreBook : [isbn=16, price=200.0, authorName=Chaitanya Bhavar, quantity=10]
				StoreBook : [isbn=13, price=202.0, authorName=Akshay Bhavar, quantity=12]
				StoreBook : [isbn=15, price=150.0, authorName=Akash, quantity=10]
				 */

	}
}
