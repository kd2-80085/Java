/*4. Use TreeSet to store all books in descending order of price.
 Natural ordering for the Book should be isbn (do not change it).
  Display them using iterator() and descendingIterator().*/
import java.util.*;

import storebook.StoreBook;
class qtycomp implements Comparator<StoreBook>{

	@Override
	public int compare(StoreBook o1, StoreBook o2) {
		int diff1=-Double.compare(o1.getPrice(),o2.getPrice());
		return diff1;
	}
	
}
public class TestBookTreeSet {	
	public static void main(String[] args) {
		
		StoreBook sb1=new StoreBook("16",200.00,"Chaitanya Bhavar",10);//String isbn, Double price, String authorName, int quantity
		StoreBook sb2=new StoreBook("13",202.00,"Akshay Bhavar",12);
		StoreBook sb3=new StoreBook("13",100.00,"Chaitanya Bhavar",10);
		StoreBook sb4=new StoreBook("15",150.00,"Akash",10);
		StoreBook sb5=new StoreBook(null,150.00,"Akash",10);
		System.out.println();

		System.out.println("Natural ordering based on isbn ");

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
		System.out.println();

		System.out.println("Ordering based on comparator on price in descending order ");


		Set<StoreBook> treeset2=new TreeSet<StoreBook>(new qtycomp());
		treeset2.add(sb1);
		treeset2.add(sb2);
		treeset2.add(sb3);
		treeset2.add(sb4);
		
		Iterator<StoreBook> sbit2=treeset2.iterator();
		
		while(sbit2.hasNext())
		{
			StoreBook sbtemp2=sbit2.next();
			System.out.println(sbtemp2);
		}
		
		System.out.println();

		System.out.println("Ordering based on comparator on price in descending order Using Descending Iterator");

		NavigableSet<StoreBook> treeset3=new TreeSet<StoreBook>(new qtycomp());
		treeset3.add(sb1);
		treeset3.add(sb2);
		treeset3.add(sb3);
		treeset3.add(sb4);
		
		Iterator<StoreBook> sbit3=treeset3.descendingIterator();
		
		while(sbit3.hasNext())
		{
			StoreBook sbtemp3=sbit3.next();
			System.out.println(sbtemp3);
		}
		
		/*Natural ordering based on isbn 
StoreBook : [isbn=13, price=202.0, authorName=Akshay Bhavar, quantity=12]
StoreBook : [isbn=15, price=150.0, authorName=Akash, quantity=10]
StoreBook : [isbn=16, price=200.0, authorName=Chaitanya Bhavar, quantity=10]

Ordering based on comparator on price in descending order 
StoreBook : [isbn=13, price=202.0, authorName=Akshay Bhavar, quantity=12]
StoreBook : [isbn=16, price=200.0, authorName=Chaitanya Bhavar, quantity=10]
StoreBook : [isbn=15, price=150.0, authorName=Akash, quantity=10]
StoreBook : [isbn=13, price=100.0, authorName=Chaitanya Bhavar, quantity=10]

Ordering based on comparator on price in descending order Using Descending Iterator
StoreBook : [isbn=13, price=100.0, authorName=Chaitanya Bhavar, quantity=10]
StoreBook : [isbn=15, price=150.0, authorName=Akash, quantity=10]
StoreBook : [isbn=16, price=200.0, authorName=Chaitanya Bhavar, quantity=10]
StoreBook : [isbn=13, price=202.0, authorName=Akshay Bhavar, quantity=12]
*/
	}
}