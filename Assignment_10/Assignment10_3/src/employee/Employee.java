package employee;

import java.util.Scanner;

public class Employee  implements Comparable<Employee> {
    private int id;
    private double sal;
    String name;

    public Employee() {
	}

    public void accept() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter Employee id: ");
        id = input.nextInt();
        System.out.print("Enter Employee salary: ");
        sal = input.nextFloat();
        input.nextLine();
        System.out.print("Enter Employee name: ");
        name = input.nextLine();
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Employee(int id, double sal, String name) {
		this.id = id;
		this.sal = sal;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", sal=" + sal + ", name=" + name + "]";
	}
    
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		if(obj instanceof Employee) {
			Employee other = (Employee) obj;
			if(this.id==other.id)
				return true;
		}
		return false;
	}

	@Override
	public int compareTo(Employee o) {
		
		int diff=Integer.compare(this.id, o.id);
		//this.id-o.id;
		return diff;
		
	}
    
}



