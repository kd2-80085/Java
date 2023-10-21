import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;


public class TestBufferedRead{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		try(FileReader fr=new FileReader("/home/chaitanya/SUNBEAM_KDAC/OOPS_with_ JAVA/Java_Assignments/Assignment_13/Assignment13_3/lines.txt"))
		{
			try(BufferedReader brd=new BufferedReader(fr))
			{
				String line;
				while((line=brd.readLine())!=null) 
				{
					System.out.println(line);
				}
			}	
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
	}

}
