package empSal;
import java.util.*;
public abstract class EmpSalCalc {
	int SSN;
	String fname;
	String lname;

	
	
	public EmpSalCalc() {
	}


	public EmpSalCalc(int sSN, String fname, String lname) {
		super();
		SSN = sSN;
		this.fname = fname;
		this.lname = lname;
	}


	public int getSSN() {
		return SSN;
	}


	public void setSSN(int sSN) {
		SSN = sSN;
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

	public void accept(Scanner sc) {
		System.out.println("Enter First name");
		fname=sc.nextLine();
		System.out.println("Enter Last name");
		lname=sc.nextLine();
		System.out.println("Enter employee SSN");
		SSN=sc.nextInt();
		}

	

	abstract public double salCalc();


	@Override
	public String toString() {
		return "Employee SSN=" + SSN + ", fname=" + fname + ", lname=" + lname;
	}

}
