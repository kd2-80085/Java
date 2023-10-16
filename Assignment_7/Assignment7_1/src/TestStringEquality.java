import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestStringEquality {
    public static void main(String[] args) 
    
    {
        Scanner scanner = new Scanner(System.in);

        // Declare two arrays of custom class type
        CustomString[] array1 = new CustomString[5];
        CustomString[] array2 = new CustomString[5];

        System.out.println("Enter five strings for array1:");
        for (int i = 0; i < 5; i++) {
            array1[i] = new CustomString(scanner.nextLine());
        }

        System.out.println("Enter five strings for array2:");
        for (int i = 0; i < 5; i++) {
            array2[i] = new CustomString(scanner.nextLine());
        }

        
        CustomString arr[]=new CustomString[5];
        int cnt=0;
        for (int i=0;i<5;i++)
        {
        	for (int j=0;j<5;j++) {
        		if(array1[i].equals(array2[j]))
        		{
        			arr[cnt++]=new CustomString(array1[i].getValue());
        		}
        	}
        	
        }
        
        // Print the duplicate values
        System.out.println("Duplicate values:");
        for (CustomString item : arr) {
            if (item != null) {
                System.out.println(item.getValue());
            }
        }  
      
    }
}
