/*3. Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa
2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
When user enters 'Generate Bill' option , display total bill & exit.*/

import java.util.*;
public class Assignment1_3 {
	static int  menu(){
		int choice;
		Scanner sc=new Scanner(System.in);
		 System.out.println("***************MENU******************");
		System.out.println("0.EXIT");
		System.out.println("1.Dosa 30 Rs");
		System.out.println("2.Samosa 20 Rs");
		System.out.println("3.Idli 20 Rs");
		System.out.println("4.Dahiwada 40 Rs");
		System.out.println("5.Panipuri 25 Rs");
		System.out.println("6.Sandwich 20 Rs");
		System.out.println("7.Vadapav 20 Rs");
		System.out.println("8.Tea 10 Rs");
		System.out.println("9.Bhaji 20 Rs");
		System.out.println("10.Generate Bill");
		System.out.println("*************************************");

		System.out.println("Enter your Choice : ");
		choice=sc.nextInt();
		 

		return choice;
	}
	
	public static void main(String args[]){
		int choice,totalAmt=0,qty,price;
		Scanner sc=new Scanner(System.in);

		while((choice=menu())!=0) 
		{
			switch(choice) 
			{
			case 1:	price=30;
				System.out.println("Enter quantity : ");
				qty=sc.nextInt();
				totalAmt+=qty*price;
				break;
				
			case 2:	price=20;
				System.out.println("Enter quantity : ");
				qty=sc.nextInt();
				totalAmt+=qty*price;
				break;
			
			case 3:	price=20;
				System.out.println("Enter quantity : ");
				qty=sc.nextInt();
				totalAmt+=qty*price;
				break;
			
			case 4:	price=40;
				System.out.println("Enter quantity : ");
				qty=sc.nextInt();
				totalAmt+=qty*price;
				break;
			
			case 5:	price=25;
				System.out.println("Enter quantity : ");
				qty=sc.nextInt();
				totalAmt+=qty*price;
				break;
			
			case 6:	price=20;
				System.out.println("Enter quantity : ");
				qty=sc.nextInt();
				totalAmt+=qty*price;
				break;
				
			case 7:	price=20;
				System.out.println("Enter quantity : ");
				qty=sc.nextInt();
				totalAmt+=qty*price;
				break;
				
			case 8:	price=10;
				System.out.println("Enter quantity : ");
				qty=sc.nextInt();
				totalAmt+=qty*price;
			break;
			
			case 9: price=20;
				System.out.println("Enter quantity : ");
				qty=sc.nextInt();
				totalAmt+=qty*price;
				break;
				
			case 10: System.out.println("*************** BILL ***************");
				System.out.println("Total Amount is : "+totalAmt);
					 System.out.println("*************************************");
				
				break;
			}
		}
		
	}
}
