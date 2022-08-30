

import java.io.File ;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filereading 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		
			File file = new File("/Users/Harsha Jain/Desktop/HJtext.txt");
			Scanner Scan = new Scanner(file);
			
		//String fileContent = "New content " ;
			String fileContent = new String();
			while(Scan.hasNextLine())
			{
				System.out.println(Scan.nextLine());
				 fileContent.concat(Scan.nextLine());//returns the line that was skipped  
				//fileContent = fileContent.concat(Scan.nextLine()+ "\n");
			}
			FileWriter Writer = new FileWriter("/Users/Harsha Jain/Desktop/rohit.txt");

		Writer.write(fileContent);
				 
		//	Writer.close();		
		
	}	
}
