package employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.concurrent.*;

import employee.Employee;

public class TestEmployee {
	public  static int menu() {
		int choice;
		//elete, ﬁnd, sort, edit
		System.out.println("****************** Menu ******************");
		System.out.println("0. EXIT \n"
				+"1. Add Employee.\n"
				+ "2. Delete Employee with empid \n"
				+ "3. Find Employee with empid ;\n"
				+ "4. Sort Employee \n"
				+ "5. Update Employee of empid \n"
				);
		System.out.println("******************************************");

		System.out.println("Enter your choice :");
		choice=new Scanner(System.in).nextInt();
		return choice;
		
	}
	
	public static void main(String[] args) {
		int choice;
		Employee emp;
		Scanner sc=new Scanner(System.in);

		List<Employee> list = new CopyOnWriteArrayList<>();
		
		while((choice=menu())!=0) {
			switch(choice) {
			case 1://Check and Add new Employee in list
			       emp=new Employee();
			  		emp.accept();
			  		list.add(emp);
				break;
			case 2:
				int empid;
			    System.out.println("Enter empid to delete  : ");
			    empid = new Scanner(System.in).nextInt();
			    Employee newEmp= new Employee();
			    newEmp.setId(empid);
			    
			    ListIterator<Employee> empListIt=list.listIterator();
			    if(list.contains(newEmp))//Override equals method for this(because default it(equals) check for references)
			    {
			    	while(empListIt.hasNext()) 
			         {
			    		Employee empObj= empListIt.next();
			        	if(empObj.equals(newEmp))
			        	{
			        		list.remove(empObj);
					        System.out.println("Employee is deleted from the list");
			        	}
			         }
			        
			    } else 
			        System.out.println("Can't delete, Employee is not in the list");
			    
			    break;
		
			 
				
			case 3 ://Find a Employee with given empid 
				int index;
				int empid3;
			    System.out.println("Enter Employee id to check if the Employee is in the list or not : ");
			    empid3 = new Scanner(System.in).nextInt();
			    Employee tempObj = new Employee();
			    tempObj.setId(empid3);
			    
				index=list.indexOf(tempObj);//getindex of employee obj
				if(index>=0) { 
					System.out.println("Employee is in the list");
					System.out.println(list.get(index));
				}
				else
					 System.out.println("Employee is not in the list");
				break;
				
			case 4://Sort.
				Collections.sort(list);
				System.out.println("Employees Sorted by empid are : ");
				for(Employee empo:list) 
				{
					System.out.println(empo);
				}
				 break;
				
			case 5:
				System.out.println("Enter emp id to be modified: ");
			int id = sc.nextInt();
			Employee key = new Employee();
			key.setId(id);
			
			int index5 = list.indexOf(key);
			
			if(index5 == -1)
				System.out.println("Employee not found.");
			else 
			{
				Employee oldEmp = list.get(index5);
				System.out.println("Employee Found: " + oldEmp);
				
				System.out.println("Enter new information for the Employee");
				Employee newEmp5 = new Employee();
				newEmp5.accept();
				list.set(index5, newEmp5);//it will replace newemp5 object it at index
			}
			
			}
		}
	}
	
	

}
