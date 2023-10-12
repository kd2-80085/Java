package empSal;

import java.util.Scanner;

public class BasePlusCommisionEmp extends CommisionEmp {

	double baseSal;

	
	public BasePlusCommisionEmp() {
	}

	public BasePlusCommisionEmp(int sSN, String fname, String lname, double commissionRate,
		double grossSales, double baseSal) {
		super(sSN, fname, lname, commissionRate, grossSales);
		this.baseSal = baseSal;
	}
	
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter baseSal:");
		baseSal=sc.nextDouble();	
		
	}

	@Override
	public String toString() {
		return "BasePlusCommisionEmp baseSal=" + baseSal + ", commissionRate=" + commissionRate + ", grossSales="
				+ grossSales + ", SSN=" + SSN + ", fname=" + fname + ", lname=" + lname
				;
	}

	@Override
	public double salCalc() {
		return super.salCalc()+baseSal;
	}
	
	public void addRewardSal() {
		this.baseSal=this.baseSal+(this.baseSal*0.1);			
	}

}
