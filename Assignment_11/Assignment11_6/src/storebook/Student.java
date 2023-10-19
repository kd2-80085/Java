package storebook;


import java.util.Objects;
import java.util.Scanner;

public class Student 
{
	private int roll;
	private String name;
	private String city;
	private double marks;
	
	public Student(int roll, String name, String city, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}
	

	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll no : ");
		roll=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name=sc.nextLine();
		
		System.out.println("Enter City : ");
		city=sc.next();
		
		System.out.println("Enter marks");
		marks=sc.nextInt();
	}



	

	
	
	
	
	
	
	
	
}
