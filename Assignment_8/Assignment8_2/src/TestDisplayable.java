import Date.Date;
import Displayable.Displayable;
import Person.Employee;

public class TestDisplayable {
	public static void printDisplayableBox(Box<? extends Displayable> b) //Upper bounded references
	{   //It will accept only Displayable sub classes 
		b.get().show();
		}
	public static void printAnyBox(Box<? > b)   //Unbounded references
	{
		System.out.println(b.get().toString());
		}

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.acceptData();
		Box<Employee> b1=new Box<>();
		b1.set(emp);
		printDisplayableBox(b1);
		System.out.println();
		
		Date d=new Date();
		d.acceptData();
		Box<Date> b2=new Box<>();
		b2.set(d);
		printDisplayableBox(b2);
		System.out.println();
		
		System.out.println("printAnyBox METHOD WITH unbounded references arguments");
		printAnyBox(b1);
		printAnyBox(b2);
		
		Box<String> b3=new Box<>();
		b3.set("Hello World");
		/* printDisplayableBox(b3); //Compile Time Error As this method acn only accept 
		Displayable and its subclasses (It is Upper Bounded Method)*/
		printAnyBox(b3);//As is unbounded method it can accept object of any generic type

		
		
	}

}
