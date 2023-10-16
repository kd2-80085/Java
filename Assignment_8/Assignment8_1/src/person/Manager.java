package person;

import java.util.Scanner;

public class Manager extends Employee implements person {
    private float bonus;

    public Manager(int id, float sal, float bonus) {
		super(id, sal);
		this.bonus = bonus;
	}
    public Manager() {
		// TODO Auto-generated constructor stub
	}
    
	public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public void display() {
    	super.display();
        System.out.println("Bonus is : "+bonus);
    
    }

    @Override
    public void accept() {
        Scanner input = new Scanner(System.in);
        super.accept();

        System.out.print("Enter Bonus : ");
        bonus=input.nextFloat();
       
        
    }

    public float calculateSal() {
    	return this.bonus+super.calculateSal();
    }
}