package Person;
import java.util.Scanner;

import Acceptable.Acceptable;
import Displayable.Displayable;
import Date.Date;

public class Employee implements Acceptable,Displayable{
	int empid;
	String name;
	double salary; 
	Date DOJ;

	
	public Employee(int empid, String name, double salary,int day ,int month ,int year) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		DOJ = new Date(day,month,year);
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void acceptData() {
		DOJ=new Date();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee Id :");
		empid=sc.nextInt();
		System.out.print("Enter name :");
		name=sc.next();
		System.out.println("Enter salary :");
		salary=sc.nextDouble();
		DOJ.acceptData();
		
	}
	@Override
	public void show() {
		System.out.println("Employee id  : "+empid);
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Salary : "+salary);
		DOJ.show();

	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", DOJ=" + DOJ + "]";
	}
	
}
