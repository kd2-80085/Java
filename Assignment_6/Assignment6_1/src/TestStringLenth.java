/*
Q1. Define a new exception, called ExceptionLineTooLong, that prints out the error message "The
strings is too long". Write a program that reads a String from user and calculates its length. and
throws an exception of type ExceptionLineTooLong in the case where a string of length is more
than 80 characters.
(Hint- Use String class length() method)
 */

import StringLength.ExceptionLineTooLong;
import StringLength.StringLength;

public class TestStringLenth {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		//try will check for the exception
		try {
		StringLength  s1=new StringLength("ggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg");
		}
		catch(ExceptionLineTooLong e) //we catch exception thrown by StringLength class ctor
		{
			System.out.println(e);
		}
	}

}
