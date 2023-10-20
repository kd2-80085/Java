package clerk;

import emp.Emp;

public class Clerk implements Emp{
	double salary;
	@Override
	public double getSal() {
		return salary;
	}
	
	public Clerk() {
	}

	public Clerk(double salary) {
		this.salary = salary;
	}
	
	
	
	

}
