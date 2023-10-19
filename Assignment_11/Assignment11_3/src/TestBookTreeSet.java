/*3. In above assignment use TreeSet instead of LinkedHashSet. Use natural ordering for the Book. If any book with duplicate isbn is added, what will happen?
Books are stored in which order?
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

import storebook.StoreBook;
class qtycomp implements Comparator<StoreBook>{

	@Override
	public int compare(StoreBook o1, StoreBook o2) {
		int diff=o1.getQuantity()-(o2.getQuantity());
		int diff1=Integer.compare(o1.getQuantity(),o2.getQuantity());
		return diff;
	}
	
}
public class TestBookTreeSet {	
	public static void main(String[] args) {
		
		StoreBook sb1=new StoreBook("16",200.00,"Chaitanya Bhavar",10);//String isbn, Double price, String authorName, int quantity
		StoreBook sb2=new StoreBook("13",202.00,"Akshay Bhavar",12);
		StoreBook sb3=new StoreBook("13",100.00,"Chaitanya Bhavar",10);
		StoreBook sb4=new StoreBook("15",150.00,"Akash",10);
		StoreBook sb5=new StoreBook(null,150.00,"Akash",10);

		
		Set<StoreBook> treeset=new TreeSet<StoreBook>();//no arg in ctor so natural ordering based on Comparable i.e compareTo() on isbn
		treeset.add(sb1);
		treeset.add(sb2);
		treeset.add(sb3);
		treeset.add(sb4);
		
		Iterator<StoreBook> sbit=treeset.iterator();
		
		while(sbit.hasNext())
		{
			StoreBook sbtemp=sbit.next();
			System.out.println(sbtemp);
		}
		//Before  implemented natural ordering
		/*
			`It gives ClassCastException
		 */
		//After implemented natural ordering
		
	/*@Override
			public int compareTo(StoreBook o)
		{
			int diff=this.isbn.compareTo(o.isbn);//it will return difference 
			return diff;
		}
				
				Elements are added in sorted order based on natural ordering
				StoreBook : [isbn=13, price=202.0, authorName=Akshay Bhavar, quantity=12]
 				StoreBook : [isbn=15, price=150.0, authorName=Akash, quantity=10]
				StoreBook : [isbn=16, price=200.0, authorName=Chaitanya Bhavar, quantity=10]
				*/

	

		Set<StoreBook> treeset2=new TreeSet<StoreBook>(new qtycomp());
		treeset2.add(sb1);
		treeset2.add(sb2);
		treeset2.add(sb3);
		treeset2.add(sb4);
		
		Iterator<StoreBook> sbit2=treeset.iterator();
		System.out.println("Using comparator on quantity");
		while(sbit2.hasNext())
		{
			StoreBook sbtemp2=sbit2.next();
			System.out.println(sbtemp2);
		}
		/*it will sort based on comparator compare and stored elemets.
		 * StoreBook : [isbn=13, price=202.0, authorName=Akshay Bhavar, quantity=12]
		StoreBook : [isbn=15, price=150.0, authorName=Akash, quantity=10]
		StoreBook : [isbn=16, price=200.0, authorName=Chaitanya Bhavar, quantity=10]

		 * */
		
		}
}