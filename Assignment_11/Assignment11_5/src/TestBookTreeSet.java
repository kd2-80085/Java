
import java.util.*;


import storebook.StoreBook;

public class TestBookTreeSet {	
	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		StoreBook sb;
		Map<String,StoreBook> map = new HashMap<>();		
		do
		{
			System.out.println("0. EXIT \n 1.Insert Book into map");
			System.out.println("2.Find Book from map");
			System.out.println("Enter your Choice : ");
			choice=sc.nextInt();
			
		switch(choice) 
		{
		case 0:System.exit(0);
				break;
		case 1:
			sb=new StoreBook();
			sb.accept();
			map.put(sb.getIsbn(), sb);//No need to write equals method as key is string
			break;
		case 2:
			StoreBook sbFind;
			System.out.println("Enter isbn to find Book : ");
			String isbn = sc.next();
			
			if((sbFind=map.get(isbn)) != null) 
			{
				System.out.println("Book found in map");
				System.out.println(sbFind);
			    }
			else
				System.out.println("Book NOT found in map ");
			break;
			default : System.out.println("Please enter correct choice!!");
			}
		}while(choice!=0);
	}
}