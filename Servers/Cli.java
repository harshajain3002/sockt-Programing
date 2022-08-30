
import java.io.*;
import java.net.*;

public class Cli {

	public static void main(String[] args) throws Exception {
		
		byte [] b =new byte[3002];
		Socket sr=new Socket("localhost",8888);
		InputStream IS =sr.getInputStream();
		FileInputStream fs = new FileInputStream("c:\\HJtext.txt");
		IS.read(b,1,b.length);
		fs.read(b,1,b.length);
		
		
		
		
		
		
	}
	
}
