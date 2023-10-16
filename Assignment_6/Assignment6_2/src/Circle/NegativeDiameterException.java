package Circle;


public class NegativeDiameterException extends RuntimeException
{
//	String message;
	
	public NegativeDiameterException() 
	{
	}
	public NegativeDiameterException(String message) 
	{
		super(message);
	}

	@Override
	public String toString() {
		return "NegativeDiameterException : " + getMessage() ;
	}
	  
	
	
	
	

}
