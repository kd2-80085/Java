package person;

import java.util.Scanner;

public class Salesman extends Employee implements person  {
    private float comm;


    public Salesman(int id, float sal, float comm) {
		super(id, sal);
		this.comm = comm;
	}

	public Salesman() {
	}

	public float getComm() {
        return comm;
    }

    public void setComm(float comm) {
        this.comm = comm;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("\nCommission is: " + comm);
        
    }

    @Override
    public void accept() {
        super.accept();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Commission: ");
        comm = input.nextFloat();
    }
    
    
    public float calculateSal() {
    	return this.comm+super.calculateSal();
    }
}
