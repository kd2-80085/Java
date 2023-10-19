/*1. Store few books (hardcoded values with the Book class in previous assignment) in a HashSet and display them using iterator. If any book with duplicate
isbn is added, what will happen? Books are stored in which order? Solve duplicate ISBN problem.*/

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

import storebook.StoreBook;

public class TestBookHashSet {	
	public static void main(String[] args) {
		
		StoreBook sb1=new StoreBook("12",200.00,"Chaitanya Bhavar",10);//String isbn, Double price, String authorName, int quantity
		StoreBook sb2=new StoreBook("13",202.00,"Akshay Bhavar",12);
		StoreBook sb3=new StoreBook("13",100.00,"Chaitanya Bhavar",10);
		StoreBook sb4=new StoreBook("15",150.00,"Akash",10);
		
		/* 
		 Set<StoreBook> hashset=new HashSet<StoreBook>();
		 
		
		hashset.add(sb1);
		hashset.add(sb2);
		hashset.add(sb3);
		hashset.add(sb4);
		
		Iterator<StoreBook> sbit=hashset.iterator();
		
		while(sbit.hasNext())
		{
			StoreBook sbtemp=sbit.next();
			System.out.println(sbtemp);
		}
		*/
		/*  Equals is overridden and Before hashcode is implemented -duplicates are allowed on isbn
		 * Books are stored as per default hahcode
		 * 	StoreBook : [isbn=13, price=100.0, authorName=Chaitanya Bhavar, quantity=10]
			StoreBook : [isbn=13, price=202.0, authorName=Akshay Bhavar, quantity=12]
			StoreBook : [isbn=12, price=200.0, authorName=Chaitanya Bhavar, quantity=10]
			StoreBook : [isbn=15, price=150.0, authorName=Akash, quantity=10]
		 */
		
		
		Set<StoreBook> hashset=new HashSet<StoreBook>();
		
		hashset.add(sb1);
		hashset.add(sb2);
		System.out.println(hashset.add(sb3));
		hashset.add(sb4);
		
		Iterator<StoreBook> sbit=hashset.iterator();
		
		while(sbit.hasNext())
		{
			StoreBook sbtemp=sbit.next();
			System.out.println(sbtemp);
		}
		
		/* @Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		if(obj instanceof StoreBook) {
			StoreBook other = (StoreBook) obj;
			if(this.isbn.equals(other.isbn))
				return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		int hash=Objects.hash(this.isbn);//it will generate hashcode for each isbn and 
		return hash;
	} 
		
		 * After hashcode is implemented - duplicates are not allowed on isbn
		 * If any duplicated tried to add in set it will return false
		 * Books are Stored as per hashcode 
		StoreBook : [isbn=12, price=200.0, authorName=Chaitanya Bhavar, quantity=10]
		StoreBook : [isbn=13, price=202.0, authorName=Akshay Bhavar, quantity=12]
		StoreBook : [isbn=15, price=150.0, authorName=Akash, quantity=10]
		 */
				
		
		

	}
}
