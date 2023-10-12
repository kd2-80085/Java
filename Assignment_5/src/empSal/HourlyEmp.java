package empSal;

import java.util.Scanner;

public class HourlyEmp extends EmpSalCalc {
	
	
	double wage;
	double hours;
	
	
	public HourlyEmp() {
	}


	public HourlyEmp(int sSN, String fname, String lname, double wage, double hours) {
		super(sSN, fname, lname);
		this.wage = wage;
		this.hours = hours;
	}
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter wage:");
		wage=sc.nextDouble();	
		System.out.println("Enter hours:");
		hours=sc.nextDouble();	
	}
	

	@Override
	public String toString() {
		return "hourlyEmp "+" SSN=" + SSN + ", fname=" + fname + ", lname=" + lname+", wage=" + wage + ", hours=" + hours ;
	}


	@Override
	public double salCalc() {
		if(hours<=40) {
			return wage*hours;
		}
		else if(hours>40) {
			return (40*wage)+(hours+40)*wage*1.5;
		}
		
		return 0;
	}

}
