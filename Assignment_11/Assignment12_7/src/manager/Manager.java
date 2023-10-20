package manager;

import emp.Emp;

public class Manager implements Emp{
	double basicSalary ;
	double dearanceAllowance;
	@Override
	public double getSal() {
		return basicSalary+dearanceAllowance;
	}
	
	@Override
	public double calcIncentives() {
		return basicSalary*0.2;
	}

	public Manager() {
	}
	public Manager(double basicSalary, double dearanceAllowance) {
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}
	
	

}
