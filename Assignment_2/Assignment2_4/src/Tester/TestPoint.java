package Tester;
import com.app.geometry.Point2D;
public class TestPoint {
	public static void main(String[] args) {
//		Point2D p1=new Point2D(5.5, 5.5);
//		Point2D p2=new Point2D(5.5, 6.5);
		Point2D p1=new Point2D(4, 3);
		Point2D p2=new Point2D(0, 0);
		System.out.println("Points are : ");
		System.out.println("p1"+p1.getDetails());
		System.out.println("p2"+p2.getDetails());
		
		if(p1.isEqual(p2)) {
			System.out.println("p1 & p2 are located at the same location");
			System.out.println("p1"+p1.getDetails());
			System.out.println("p2"+p2.getDetails());
		}else
		{			
		System.out.println("p1 & p2 are not located at the same location");
		System.out.println("Distance between p1 and p2 is : "+p1.calculateDistance(p2));
		}
	}
}
