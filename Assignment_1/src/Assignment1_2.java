
import java.util.*;
public class Assignment1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       double num1,num2;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter numbers");
       
       if( sc.hasNextDouble() && !sc.hasNextInt())
       {
    	   num1=sc.nextDouble();
    	   if( sc.hasNextDouble() && !sc.hasNextInt())
           {
        	   num2=sc.nextDouble();
        	   System.out.println("Average is : "+((num1+num2)/2));
           }
       }
       else {
    	   System.out.println("Invalid Number");
       }    	   
	}

}
