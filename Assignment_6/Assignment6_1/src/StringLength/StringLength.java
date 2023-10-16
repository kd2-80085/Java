package StringLength;
import StringLength.ExceptionLineTooLong;
public class StringLength {
	String s1;

	
	public StringLength() {
		
	}
	
	public StringLength(String s1) throws ExceptionLineTooLong  //We used Checked exception thats why we 
	{															//have to route this exception towwards calling object
		if(s1.length()>80)
			throw new ExceptionLineTooLong("The strings is too long");
		this.s1 = s1;
	}
	
	@Override
	public String toString() {
		return "StringLength [s1=" + s1 + "]";
	}
	
	

}
