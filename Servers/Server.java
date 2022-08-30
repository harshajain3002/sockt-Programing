import java.io.IOException;
import java.net.ServerSocket;
import java.util.Scanner;
import java.net.Socket;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Server 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException
	{
	ServerSocket servsock = new ServerSocket(3456);
	Socket Sock = servsock.accept();
	
	Scanner in = new Scanner(Sock.getInputStream());
  InputStream is = Sock.getInputStream();
  PrintWriter pw = new PrintWriter(Sock.getOutputStream(), true);
  String FileName = in.nextLine();
  int FileSize = in.nextInt();
 
  FileOutputStream fos = new FileOutputStream(FileName);
  BufferedOutputStream bos = new BufferedOutputStream(fos);
  byte[] filebyte = new byte[FileSize];
  
  int file = is.read(filebyte, 0, filebyte.length);
  bos.write(filebyte,0,file);
  
  if (FileSize == file)
  {
	  System.out.println("Incoming File: " + FileName);
	  System.out.println("Size: " + FileSize + "Byte"); 
	  pw.println("File Recieved Successfully.");
	  
  }
  else
  {
	  System.out.println("file currupted"+file + "byte");
	  bos.close();
	  Sock.close();
  }
  
	}
}
		
