import Circle.Circle;
import Circle.NegativeDiameterException;
public class CircleTester {

	public static void main(String[] args) {
		
		Circle c1=new Circle();
		System.out.println(c1);
		
		try {
			Circle c2=new Circle(4,4,-2);
			System.out.println(c2);
		}	
		catch(NegativeDiameterException n)
		{
			System.err.println(n);
		}

	}

}
