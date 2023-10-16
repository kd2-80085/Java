package Circle;
import com.app.geometry.*;

public class Circle {
	Point2D p;
	double myDiameter;
	
	public Circle()
	{
		this.myDiameter = 100;
		this.p =new Point2D();
	}
	
public Circle( double x,double y,double myDiameter) {
	if(myDiameter<0)
		throw new NegativeDiameterException("Diameter is Negative");
		this.myDiameter = myDiameter;
		this.p =new Point2D(x,y);
	}
	
	public String getCircle() {
		return p.getDetails()+"\nDiameter is : "+myDiameter; 
	}

	@Override
	public String toString() {
		return "Circle [p=" + p.getDetails() + ", myDiameter=" + myDiameter + "]";
	}
	
	
	
	

}
