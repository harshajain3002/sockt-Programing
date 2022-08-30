import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	@SuppressWarnings("resource")
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		try {
			Socket Sock = new Socket("localhost",3456);
		String FileName = "mycode.txt" ;
		File MyFile = new File(FileName);
		int FileSize = (int) MyFile.length();
		OutputStream os = Sock.getOutputStream();
		PrintWriter pw = new PrintWriter(Sock.getOutputStream(), true);
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(MyFile));
		Scanner in = new Scanner(Sock.getInputStream());
		
		pw.println(FileName);
		pw.println(FileSize);
		byte[] filebyte = new byte[FileSize];
		bis.read(filebyte,0,filebyte.length);
		os.write(filebyte, 0,filebyte.length);
		System.out.println(in.nextLine());
		os.flush();
		Sock.close();
	
		
		}
		catch(Exception E)
		{
			System.out.println("error");
		};
		
	}
		
		
	}

	
