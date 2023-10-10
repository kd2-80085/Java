package costPerDay;

import java.util.Scanner;

public class cost_Per_Day {
	
	int Totalmiles; //per Day
	float gasolineCost ;//per gallon of gasoline.
	float AverageMiles;// per gallon.
	float ParkingFees;// per day.
	float Tolls;// per day.
	float CostPerDay;//user’s cost per day of driving to work
	
	public cost_Per_Day() {
		// TODO Auto-generated constructor stub
	}
	
	public void  displayDetails() { 
		System.out.println("Total miles driven per day : "+Totalmiles);
		System.out.println("Cost per gallon of gasoline. : "+gasolineCost);
		System.out.println("Average miles per gallon. : "+AverageMiles);
		System.out.println("Parking fees per day. : "+ParkingFees);
		System.out.println("Tolls per day : "+Tolls);
		System.out.println("User’s cost per day of driving to work: "+CostPerDay);
		}
	
	public void  acceptCostDetails() { 
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Total miles driven per day : ");
		this.Totalmiles=sc.nextInt();
		System.out.println(" Enter Cost per gallon of gasoline. : ");
		this.gasolineCost=sc.nextFloat();
		System.out.println(" Enter Average miles per gallon. : ");
		this.AverageMiles=sc.nextFloat();
		System.out.println(" Enter Parking fees per day. : ");
		this.ParkingFees=sc.nextFloat();
		System.out.println(" Enter Tolls per day : ");
		this.Tolls=sc.nextFloat();
		CostPerDay=(Totalmiles/AverageMiles)*gasolineCost+ParkingFees+Tolls;
		}


}
