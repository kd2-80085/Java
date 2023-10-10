package Customers;

import java.util.Scanner;

public class CreditLimit {
	int acNo;
	int startBal;
	int totalItemsCharge;
	int toatalMonthCredit;
	int allowedCredit;
	int newBal;
	
	public int getAcNo() {
		return acNo;
	}
	public void setAcNo(int acNo) {
		this.acNo = acNo;
	}
	public int getStartBal() {
		return startBal;
	}
	public void setStartBal(int startBal) {
		this.startBal = startBal;
	}
	public int getTotalItemsCharge() {
		return totalItemsCharge;
	}
	public void setTotalItemsCharge(int totalItemsCharge) {
		this.totalItemsCharge = totalItemsCharge;
	}
	public int getToatalMonthCredit() {
		return toatalMonthCredit;
	}
	public void setToatalMonthCredit(int toatalMonthCredit) {
		this.toatalMonthCredit = toatalMonthCredit;
	}
	public int getAllowedCredit() {
		return allowedCredit;
	}
	public void setAllowedCredit(int allowedCredit) {
		this.allowedCredit = allowedCredit;
	}
	public CreditLimit() {
		// TODO Auto-generated constructor stub
	}
	public CreditLimit(int acNo, int startBal, int totalItemsCharge, int toatalMonthCredit, int allowedCredit) {
		this.acNo = acNo;
		this.startBal = startBal;
		this.totalItemsCharge = totalItemsCharge;
		this.toatalMonthCredit = toatalMonthCredit;
		this.allowedCredit = allowedCredit;
	}
	
	public void acceptCustDetails() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter account no : ");
	acNo=sc.nextInt();
	System.out.println("Enter starting balance : ");
	startBal=sc.nextInt();
	System.out.println("Enter total of all items charged by the customer : ");
	totalItemsCharge=sc.nextInt();
	System.out.println("Enter total of all credits applied to the customer’s account : ");
	toatalMonthCredit=sc.nextInt();
	System.out.println("Enter allowed credit limit customer’s account : ");
	toatalMonthCredit=sc.nextInt();	
	
	newBal=startBal+totalItemsCharge-toatalMonthCredit;
	if(newBal>allowedCredit)
	{
		System.out.println("Credit limit exceeded");
	}
	
	}
	public void displayDetails(){
		System.out.println("Account no : "+acNo);
		System.out.println("Starting balance : "+startBal);
		System.out.println("New  balance is : "+newBal);
		System.out.println("Total of all items charged by the customer : "+totalItemsCharge);
		System.out.println("Total of all credits applied to the customer’s account : "+toatalMonthCredit);
		System.out.println("Allowed credit limit customer’s account : "+allowedCredit);
	}
	
	
}

