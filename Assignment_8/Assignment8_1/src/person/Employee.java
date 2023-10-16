package person;
import java.util.Scanner;

public class Employee implements person {
    private int id;
    private float sal;

    public Employee() {
		// TODO Auto-generated constructor stub
	}
    public Employee(int id, float sal) {
		this.id = id;
		this.sal = sal;
	}

	public int getId() {
        return id;
    }

    public float getSal() {
        return sal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }

    public void display() {
        System.out.println("\nEmployee id : " + id);
        System.out.println("Employee salary : " + sal);
    }

    public void accept() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter Employee id: ");
        id = input.nextInt();
        System.out.print("Enter Employee salary: ");
        sal = input.nextFloat();
    }
    
    
    public float calculateSal() {
    	return this.sal;
    }
}



