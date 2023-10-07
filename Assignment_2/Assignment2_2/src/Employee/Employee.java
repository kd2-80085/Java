package Employee;

public class Employee {
	String fname;
	String lname;
	double monthsal;
	
	public Employee(String fname, String lname, double monthsal) {
		this.fname = fname;
		this.lname = lname;
		if(monthsal>=0)
		this.monthsal = monthsal;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public double getMonthsal() {
		return monthsal;
	}

	public void setMonthsal(double monthsal) {
		if(monthsal>=0)
		this.monthsal = monthsal;
	}
	
	public void tenPerRaise() {
		this.monthsal=this.monthsal+this.monthsal*0.10;
	}
	
	public void yearlySal() {
		System.out.println("Yearly salary is : "+this.monthsal*12);
	}
		
	
	
}
