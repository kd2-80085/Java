import java.util.Scanner;

public class TestArithmeticInterface {
	
	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: "+result);
		}

	public static void main(String[] args) {
		
	int choice;
	Scanner sc=new Scanner(System.in);
	double x,y;
	
	System.out.println("Enter two numbers to perform operations ");
	System.out.println("Enter x : ");
	x=sc.nextDouble();
	System.out.println("Enter y : ");
	y=sc.nextDouble();
	
	do
	{
		System.out.println("0. EXIT \n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division");
		System.out.println("Enter your Choice : ");
		choice=sc.nextInt();
		
	switch(choice) 
	{
	case 0:System.exit(0);
			break;
	case 1:
		calculate(x, y, (a,b)->a+b);
		break;
	case 2:
		calculate(x, y, (a,b)->a-b);
				break;
	case 3:
		calculate(x, y, (a,b)->a*b);
				break;
	case 4:
		calculate(x, y, (a,b)->a/b);
				break;
		default : System.out.println("Please enter correct choice!!");
		}
	}while(choice!=0);
	
	
	}
}
