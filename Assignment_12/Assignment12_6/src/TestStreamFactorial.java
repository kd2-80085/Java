import java.util.Scanner;
import java.util.stream.Stream;

public class TestStreamFactorial {

	public static void main(String[] args) {

		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number  to calculate factorial :");
		number=sc.nextInt();
		
		Stream<Integer> strm1=Stream.iterate(1,x->x+1).limit(number);
		int result=strm1.reduce(1,(a,e)->a*e);
		System.out.println("Factorial of 6 is :"+result);
	}

}
