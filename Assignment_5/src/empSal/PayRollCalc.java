package empSal;
import java.util.Scanner;

import empSal.*;

public class PayRollCalc {
		
		public static void main(String[] args) {
			
			
			EmpSalCalc Emp=null;
			
			Emp=new SalariedEmp();	
			Emp.accept(new Scanner(System.in));//it will call to overridden method of derived class no need to downcasting to access inherited overridden method of derived class
			System.out.println(Emp.toString());//we do downcasting only to access non inherited fields/methods of derived class not for methods
			System.out.println("Employee salary is: "+Emp.salCalc());
			
			
			Emp=new HourlyEmp();
			Emp.accept(new Scanner(System.in));
			System.out.println(Emp.toString());
			System.out.println("Employee salary is: "+Emp.salCalc());

			
			Emp=new CommisionEmp();
			Emp.accept(new Scanner(System.in));
			System.out.println(Emp.toString());
			System.out.println("Employee salary is: "+Emp.salCalc());

		
			Emp=new BasePlusCommisionEmp();
			Emp.accept(new Scanner(System.in));
			System.out.println(Emp.toString());
			System.out.println("Employee salary is: "+Emp.salCalc());
			System.out.println("Reward to salaried-commission employees by adding 10% to their base salaries");
			BasePlusCommisionEmp BPE=(BasePlusCommisionEmp) Emp;
			BPE.addRewardSal();
			System.out.println("After Reward 10% .Employee salary is: "+Emp.salCalc());


		}

	}


