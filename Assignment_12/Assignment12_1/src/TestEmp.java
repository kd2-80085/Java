import java.util.Scanner;
import clerk.Clerk;
import emp.Emp;
import labor.Labor;
import manager.Manager;

public class TestEmp 
{
	
	public static void main(String[] args) 
	{
		int choice;
		Scanner sc=new Scanner(System.in);
		
		
		Emp [] arr=new Emp[3];
		arr[0]=new Manager(20000,100);
		arr[1]=new Clerk(8000);
		arr[2]=new Labor(5,200);
		
		double totalIncome=Emp.calcTotalIncome(arr);
		System.out.println(totalIncome);
	}
}
	
//static int menu(Scanner sc) 
//{
//	//System.out.println("0.EXIT \n  \n4.Display Manager 5.");
//	int choice;
//	System.out.println("0.EXIT \n 1.Add Employee \n 2.Display Employee \nEnter your choice : ");
//	choice=sc.nextInt();
//	return choice;
//}
//
//static int addEmpMenu(Scanner sc) 
//{
//	int choice;
//	System.out.println("0.EXIT \n1.Add Manager \n 2.Add Clerk \n3.Add labor \nEnter your choice : ");
//	choice=sc.nextInt();
//	return choice;
//}
//static int displayEmpMenu(Scanner sc) 
//{
//	int choice;
//	System.out.println("0.EXIT \n 1.Display Manager \n 2.Display Clerk \n3.Display labor \nEnter your choice : ");
//	choice=sc.nextInt();
//	return choice;
//}
//while((choice=menu(sc))!=0) 
//{
//	switch(choice) 
//	{
//	case 1: 
//		while((choice=addEmpMenu(sc))!=0)
//		{
//			switch(choice) {
//				case 1:System.out.println("Add Manager");
//						break;
//				case 2:System.out.println("Add Clerk");
//						break;
//				case 3:System.out.println("Add Clerk");
//						break;
//			}//switch add 		
//		}	//while add
//		break;
//	case 2:
//		break;
//	}//switch main 		
//}	//while main
		

