
import java.io.File ;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Fileread 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub

		File file = new File("/Users/Harsha Jain/Desktop/text.txt");
		Scanner Scan = new Scanner(file);
		
		String fileContent = "New content here";

		while(Scan.hasNextLine())
		{
			System.out.println(Scan.nextLine());  //returns the line that was skipped  
			
			fileContent = fileContent.concat(Scan.nextLine());
		}
		FileWriter Writer = new FileWriter("/Users/Harsha Jain/Desktop/rahul.txt");

		Writer.write(fileContent);
			
		Writer.close();
			}	
	}



		
	


