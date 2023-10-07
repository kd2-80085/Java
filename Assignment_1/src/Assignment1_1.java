/* 
 Q1. Accept a integer number and when the program is executed print the binary, octal and
hexadecimal equivalent of the given number.
Sample Output:
java Test
Enter Number : 20
Given Number :20
Binary equivalent :10100
Octal equivalent :24
Hexadecimal equivalent :14
Hint : Use Wrapper Class (toBinaryString() , toOctalString(), toHexString())*/

import java.util.*;
public class Assignment1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A number : ");
		number=sc.nextInt();
		System.out.println("Given number is : "+number);
		System.out.println("Binary equivalent : "+Integer.toBinaryString(number));
		System.out.println("Octal equivalent : "+Integer.toOctalString(number));
		System.out.println("Hexadecimal Equivalent : "+Integer.toHexString(number));

	}

}
