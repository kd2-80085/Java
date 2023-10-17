package storebook;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class TesterStoreBook {
	public  static int menu() {
		int choice;
		System.out.println("****************** Menu ******************");
		System.out.println("0. EXIT \n"
				+"1. Add new book in list.\n"
				+ "2. Display all books in forward order.\n"
				+ "3. Delete at book given index ;\n"
				+ "4. Check if book with given isbn is in list or not\n"
				+ "5. Delete all books in list\n"
				+ "6. Display number of books in list\n"
				+ "7. Sort all books by price in desc order ;");
		System.out.println("******************************************");

		System.out.println("Enter your choice :");
		choice=new Scanner(System.in).nextInt();
		return choice;
		
	}
	
	public static void main(String[] args) {
		int choice;
		StoreBook sb;

		List<StoreBook> list = new ArrayList<>();
		class PriceComp implements Comparator<StoreBook>{
			@Override
				public int compare(StoreBook o1, StoreBook o2) {
				int diff=o1.getPrice().compareTo(o2.getPrice());
				return diff;
				
				}
			}
		PriceComp pc=new PriceComp();
		
		while((choice=menu())!=0) {
			switch(choice) {
			case 1:sb=new StoreBook();
			  		sb.accept();
			  		list.add(sb);
				break;
			case 2:       
				ListIterator<StoreBook> listIterator = list.listIterator();
				while(listIterator.hasNext()) 
				{
					StoreBook sb1=listIterator.next();
					System.out.println(sb1);
			    }
				
				break;
			case 3:
				int index;
				System.out.println("Enter index(0 to "+list.size()+") to delete object from list : ");
				index = new Scanner(System.in).nextInt();
				list.remove(index);
				break;
			case 4:
				 String isbnc;
				    System.out.println("Enter isbn to check if the book is in the list or not : ");
				    isbnc = new Scanner(System.in).next();
				    StoreBook key = new StoreBook();
				    key.setIsbn(isbnc);
				    if(list.contains(key))//Override equals method for this(because default it(equals) check for references)
				    {
				        System.out.println("Book is in the list");
				    } else {
				        System.out.println("Book is not in the list");
				    }
				    break;
			case 5:   list.clear();
					System.out.println("All books are deleted");
				break;
			case 6: 
				System.out.println("Total type of Books are :"+list.size());
					break;
			case 7:				
				list.sort(pc);	
			}
		}
	}
	
	

}
