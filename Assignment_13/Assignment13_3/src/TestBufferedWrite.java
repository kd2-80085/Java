import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;


public class TestBufferedWrite{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		try(FileWriter fw=new FileWriter("lines.txt")){
			try(BufferedWriter bwr=new BufferedWriter(fw))
			{
				for(int i=1; i<=4; i++) 
				{
					System.out.println("Enter A line :");
					String line = sc.nextLine();
					bwr.write(line);
					bwr.newLine();
				}
			}	
			}
		catch(Exception e) {
			e.printStackTrace();
		}	
		System.out.println("Lines written in file successfully");
	}

}
