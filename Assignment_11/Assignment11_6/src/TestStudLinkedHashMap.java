/*6. Store Students in LinkedHashMap<> so that, for given roll, Student can be searched in fastest possible time.
 *  Do we need to write equals() and hashCode() in Student class? */

import java.util.*;
import storebook.Student;

public class TestStudLinkedHashMap {	
	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		Student stud;
		Map<Integer, Student> map = new HashMap<>();		
		do
		{
			System.out.println("0. EXIT \n 1.Insert Student into map");
			System.out.println("2.Find Student from LinkedHashMap");
			System.out.println("Enter your Choice : ");
			choice=sc.nextInt();
			
		switch(choice) 
		{
		case 0:System.exit(0);
				break;
		case 1:
			stud=new Student();
			stud.accept();
			map.put(stud.getRoll(), stud);//No need to write equals method as key is Integer
			break;
		case 2:
			Student studFind;
			System.out.println("Enter Roll no. to find Student : ");
			int roll = sc.nextInt();
			
			if((studFind=map.get(roll)) != null) 
			{
				System.out.println("Student found in map");
				System.out.println(studFind);
			    }
			else
				System.out.println("Student NOT found in map ");
			break;
			default : System.out.println("Please enter correct choice!!");
			}
		}while(choice!=0);
	}
}