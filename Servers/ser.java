
import java.io.*;
import java.net.*;

public class ser {
	public static void main(String[] args) throws Exception {
		ServerSocket s= new ServerSocket(8888);
		Socket sr= s.accept();
		FileOutputStream fs = new FileOutputStream("c:\\file.txt");
	byte b[] = new byte[3002];
	
	OutputStream O=sr.getOutputStream();
	O.write(b,1,b.length);
	
	
	}
}
