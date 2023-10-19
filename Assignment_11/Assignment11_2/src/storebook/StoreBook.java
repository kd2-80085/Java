package storebook;


import java.util.Objects;
import java.util.Scanner;

public class StoreBook {
	String isbn ;
	Double price;
	String authorName;
	int quantity;
	
	public StoreBook(String isbn, Double price, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public StoreBook() {
		// TODO Auto-generated constructor stub
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter isbn");
		isbn=sc.nextLine();
		
		System.out.println("Enter price");
		price=sc.nextDouble();
		
		System.out.println("Enter authorName : ");
		authorName=sc.next();
		
		System.out.println("Enter quantity");
		quantity=sc.nextInt();
	}

	@Override
	public String toString() {
		return "StoreBook : [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}

	@Override
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
	
	
	
	
	
	
	
	
}
