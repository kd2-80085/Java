/*Q2. Copy the Point2D class , along with the package from previous assignment.

e) Supply Menu to user with various Options like following
1. Display details of a specific point
User i/p : index
O/p : x & y co-ordinates should be displayed. or error message(eg : Invalid index , pls retry!!!!)
2) Display x, y co-ordinates of all points
Hint : for-each
3) User i/p : 2 indices for the points , validate the indices
Display distance between specified points (iff they are not located at the same position)
eg : sop("Enter index of strt point n end point");
validation : boundary condition (0<=index<length-1)
isEqual -- false --compute distance --display it.
4. Exit
*/

package Tester;
import java.util.Scanner;
import com.app.geometry.Point2D;

public class TestPointArray1 {
	public static int menu() {
		int choice,index;
		Scanner sc=new Scanner(System.in);
		System.out.println("******************* MENU *******************");
		System.out.println("0. EXIT \n 1.Display Point at index \n 2.Display all points \n 3.Display distance between 2 points ");
		System.out.println("Enter your choice : ");
		choice=sc.nextInt();
		System.out.println("********************************************");
		return choice;
	}
	
	public static void main(String[] args)
	{
		int choice,index,index1,index2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many no of points to plot:");
		
		Point2D[] points=new Point2D[sc.nextInt()];   //create array of point2D objects
		
		for (int i=0;i<points.length;i++) {
			points[i]=new Point2D();       //Allocate memory for each object in array
		}
		
		for (int i=0;i<points.length;i++) {
			System.out.println("Enter coordinates for point P"+i);
			points[i].acceptCoordinates();       //Allocate memory for each object in array
		}
		
		while((choice=menu())!=0) 
		{
			switch(choice) 
			{
			case 1:System.out.println("Enter index to display point (between 0 to "+(points.length-1)+"): ");
			index=sc.nextInt();
			System.out.println(points[index].displayPoint());
			break;
			
			case 2:System.out.println("All points are : ");
			for(Point2D point:points)
				System.out.println(point.displayPoint());
			break;
			
			case 3:
				System.out.println("Enter index of start point and end point(between 0 to "+(points.length-1)+"): ");
			index1=sc.nextInt();
			index2=sc.nextInt();
			
			if(index1>= 0 && index1<points.length-1)
			{
				if(index1>= 0 && index1<points.length-1)
				{
					if(!(points[index1].isEqual(points[index2])))
					{
						System.out.println("Distance is : "+points[index1].calculateDistance(points[index2]));
					}
					else 
						System.out.println("Both Points are located at the same position");
				}
			}
			else
				System.out.println("Indexes are not valid");

			break;
		
			}
			
		}	
	}
}
