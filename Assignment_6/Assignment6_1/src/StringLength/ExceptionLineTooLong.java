package StringLength;

import java.util.Arrays;

public class ExceptionLineTooLong extends Exception
{
	String fieldvalue;

	public ExceptionLineTooLong() {
	}

	
	public ExceptionLineTooLong(String message, String fieldvalue) {
		super(message);
		fieldvalue=fieldvalue;
	}

	public ExceptionLineTooLong(String message) {
		super(message);
	}


	@Override
	public String toString() {
		return "ExceptionLineTooLong fieldvalue=" + fieldvalue + ", getMessage()=" + getMessage();
	}
 
	
	
	
	
	


}
