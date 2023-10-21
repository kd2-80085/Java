import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.concurrent.*;

import storebook.StoreBook;

public class TestLibrary {
	public  static int menu() {
		int choice;
		System.out.println("****************** Menu ******************");
		System.out.println("0. EXIT \n"
				+"1. Check and Add new book in list.\n"
				+ "2. Display all books in forward order.\n"
				+ "3. Search a book with given isbn ;\n"
				+ "4. Delete a book at given index.\n"
				+ "5. Delete a book with given isbn\n"
				+ "6. Reverse the list\n"
				+"7. Save Books into file\n"
				+"8. Load Books from file\n");
		System.out.println("******************************************");

		System.out.println("Enter your choice :");
		choice=new Scanner(System.in).nextInt();
		return choice;
		
	}
	
static boolean saveBook(List <StoreBook> l1) {
		
		try(FileOutputStream fout = new FileOutputStream("books.db")){
			try(ObjectOutputStream oout=new ObjectOutputStream(fout)){
				
					oout.writeObject(l1);
				
			}//dout close
			
		}//fout close
		catch(Exception e) {
			e.printStackTrace();
		}
		return true;
		
	}
	static List<StoreBook> loadBook()
	{
		List<StoreBook> list = new CopyOnWriteArrayList<>();
		
		try(FileInputStream fin=new FileInputStream("books.db"))
		{
			try(ObjectInputStream oin = new ObjectInputStream(fin))
			{
				list = (CopyOnWriteArrayList<StoreBook>) oin.readObject();
			}
		}
		catch(Exception e) {
			e.printStackTrace();	
		}
		return list;	
	}
	

	public static void main(String[] args) {
		int choice;
		StoreBook sb;
		Scanner sc=new Scanner(System.in);

		List<StoreBook> list = new CopyOnWriteArrayList<StoreBook>();
//		list=loadBook();

		System.out.println("Book Loaded Successfully");
		while((choice=menu())!=0) {
			switch(choice) {
			case 1://Check and Add new book in list
				String isbnc;
			    System.out.println("Enter isbn to check if the book is in the list or not : ");
			    isbnc = new Scanner(System.in).next();
			    StoreBook key = new StoreBook();
			    key.setIsbn(isbnc);
			    
			    ListIterator< StoreBook> booklist=list.listIterator();
			   
			    if(list.contains(key))//Override equals method for this(because default it(equals) check for references)
			    {	int qty,newQty;
			        System.out.println("Book is in the list");
			        System.out.println("Enter Quantity to add");
			        qty=sc.nextInt();
			        
			         while(booklist.hasNext()) 
			         {
			        	StoreBook bookObj= booklist.next();
			        	if(bookObj.equals(key))
			        	{
			        		newQty=bookObj.getQuantity()+qty;
			        		bookObj.setQuantity(newQty);
			        	}
			         }
			    } else {
			        System.out.println("Book is not in the list");
			        sb=new StoreBook();
			  		sb.accept();
			  		list.add(sb);
			    }

				break;
			case 2: 

				StoreBook sb2;
				for(int i=0;i<list.size();i++) {
					sb2=list.get(i);
					System.out.println(sb2);
				}
				break;
				
			case 3 ://Search a book with given isbn 
				int index;
				String isbnc3;
			    System.out.println("Enter isbn to check if the book is in the list or not : ");
			    isbnc3 = new Scanner(System.in).next();
			    StoreBook key3 = new StoreBook();
			    key3.setIsbn(isbnc3);
			    
				index=list.indexOf(key3);
				if(index>=0) { 
					System.out.println("Book is in the list");
					System.out.println(list.get(index));
				}
				else
					 System.out.println("Book is not in the list");
				
				break;
				
			case 4://Delete a book at given index.
				int index4;
				System.out.println("Enter index(0 to "+list.size()+") to delete object from list : ");
				index4 = new Scanner(System.in).nextInt();			
				list.remove(index4);
				 break;
				
			case 5://Delete a book with given isbn
				 String isbnc5;
				    System.out.println("Enter isbn to delete a book : ");
				    isbnc5 = new Scanner(System.in).next();
				    StoreBook key5= new StoreBook();
				    key5.setIsbn(isbnc5);
				    ListIterator< StoreBook> booklist5=list.listIterator();
				    if(list.contains(key5))//Override equals method for this(because default it(equals) check for references)
				    {
				    	while(booklist5.hasNext()) 
				         {
				        	StoreBook bookObj= booklist5.next();
				        	if(bookObj.equals(key5))
				        	{
				        		list.remove(bookObj);
						        System.out.println("Book is deleted from the list");
				        	}
				         }
				        
				    } else 
				        System.out.println("Can't delete, Book is not in the list");
				    
				    break;
			case 6:  //Reverse the list (hint - Collections.reverseList()) 
				Collections.reverse(list);
				System.out.println(list);
				
				break;
			case 7:  //Save List In book.txt
				if(saveBook(list))
				{
					System.out.println("Saved Books in books.db successfully");
				}
				break;
			case 8:  //load List In book.txt
						if((list=loadBook())!=null)	{
							System.out.println("Books loaded from file successfully");
						}
				break;
					
				
			}
		}
	}
	
	

}
