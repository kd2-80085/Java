
public class Assignment1_4b {

	public static void main(String[] args) {
		//FULL TRIANGLE PATTERN
	int row=5,col=5;
	
		for(int i=1;i<=row-1;i++)       //i<=4  
		{
			for(int s=1;s<=row-i;s++)	
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)	
			{
				System.out.print("*");
			}
			for(int s=1;s<=row-i;s++)	
			{
				System.out.print(" ");
			}
			System.out.println();
		}
//	     *    
//	    ***   
//	   *****  
//	  ******* 
//	 *********
		for(int i=row;i>=1;i--) 
		{
			for(int s=1;s<=row-i;s++)	
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)	
			{
				System.out.print("*");
			}
			System.out.println();
		}
//		*********
//		 *******
//		  *****
//		   ***
//		    *



	}

}
