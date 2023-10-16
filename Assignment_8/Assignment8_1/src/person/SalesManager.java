package person;

import java.util.Scanner;

public class SalesManager extends Manager  implements person{
	float comm;

	public SalesManager(int id, float sal, float bonus, float comm) {
		super(id, sal, bonus);
		this.comm = comm;
	}

	public SalesManager() {
	}

	public float getComm() {
		return comm;
	}

	public void setComm(float comm) {
		this.comm = comm;
	}
	public void accept() {
		super.accept();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Employee Commision: ");
        comm = input.nextFloat();
    }
	
	@Override
	public float calculateSal() {
		return this.getSal()+comm+getBonus();
	}
	
	
	
	
}
