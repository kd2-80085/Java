package Invoice;

import java.util.Scanner;

public class Invoice {
	String partNo;
	String partDesc;
	int qty;
	double price;
	
	public Invoice() {
	}
	
	public Invoice(String partNo, String partDesc, int qty, double price)
	{
		if(qty<0) 
			this.qty = 0;
		else 
			this.qty = qty;
			
		if(price<0)
			this.price = 0.0;	
		else 
			this.price = price;	

		this.partNo = partNo;
		this.partDesc = partDesc;
				}
	

	public String getPartNo() {
		return partNo;
	}

	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}

	public String getPartDesc() {
		return partDesc;
	}

	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		
		this.price = price;	
	}
	
	public double calcAmount() {
		
		return getPrice()*getQty();
	}
	
	public void acceptItem() {
		int qty;
		double price;
		System.out.println("Enter Item details ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Part No : ");
		this.partNo=sc.nextLine();
		System.out.println("Enter Part Description : ");
		this.partDesc=sc.nextLine();
		System.out.println("Enter No. of Item(Quantity) : ");
		qty=sc.nextInt();
		System.out.println("Enter Price : ");
		price=sc.nextInt();	
		if(qty<0) 
			this.qty = 0;
		else 
			this.qty = qty;
			
		if(price<0)
			this.price = 0.0;	
		else 
			this.price = price;	

	}
	
	public void displayInvoice() {
		System.out.println("************ INVOICE ************");
		System.out.println("Part No : "+this.partNo);
		System.out.println("Part Description : "+this.partDesc);
		System.out.println("No. of Item(Quantity) : "+this.qty);
		System.out.println("Price : "+this.price);
		System.out.println("Total Amount : "+calcAmount());
		System.out.println("*********************************");		
	}

}

