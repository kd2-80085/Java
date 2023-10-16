package Date;
import Displayable.*;

import java.util.Scanner;

import Acceptable.Acceptable;

	
	public class Date implements Displayable {
		int day;
		int month;
		int year;
			
		
		public Date(int day, int month, int year) {
			super();
			this.day = day;
			this.month = month;
			this.year = year;
		}
		 
		public Date() {
			// TODO Auto-generated constructor stub
		}
		

		@Override
		public String toString() {
			return "Date : " + day + "/" + month + "/" + year ;
		}


		@Override
		public void show() {
			System.out.println("Date is : "+ day + "/" + month + "/" + year);
		}
		
		public void acceptData() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Date ");
			System.out.print("Enter Day : ");
			day=sc.nextInt();
			System.out.print("Enter Month : ");
			month=sc.nextInt();
			System.out.print("Enter Year : ");
			year=sc.nextInt();
		}
	}



