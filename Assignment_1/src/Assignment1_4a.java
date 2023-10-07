
public class Assignment1_4a {

	public static void main(String[] args) 
	{		
		int col=5,row=5;
		 for(int i=1;i<=row;i++) 
		 {
			 for(int space=1;space<=row-i;space++)
			 {
				 System.out.print(" ");
			 }
			 for (int j=1;j<=i;j++)
			 {
				 System.out.print("* ");//attach space to * of LEFT triangle pattern
				 						//  			     *
				 						//				    **
				 						//				   ***
				 						//				  ****
				 						//				 *****
			 }
			 System.out.println();
		 }
		 
//OUTPUT   - Pyramid Star Pattern
//		     * 
//		    * * 
//		   * * * 
//		  * * * * 
//		 * * * * * 
	}
}

//	RIGHT TRIANGLE PATTERN
//		int col=5,row=5;		
//		for(int i=1;i<=row;i++) 
//		{
//			for(int j=1;j<=i;j++)	
//			{
//				System.out.print("*");
//			}
//		 System.out.println();
//		}

//	*
//	**
//	***
//	****
//	*****


//LEFT TRIANGLE PATTERN
//		int col=5,row=5;
//		int col=5,row=5;
//		for(int i=1;i<=row;i++) 
//		{
//			for(int space=1;space<=row-i;space++)
//			{
//				 System.out.print(" ");
//		 	}
//		   for (int j=1;j<=i;j++) 
//		   {
//		 	System.out.print("*");
//			}
//	       System.out.println();
//      }

//		*
//	   **
//	  ***
//   ****
//  *****

