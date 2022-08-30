
import java.io.*;  
import java.net.*;  
public class FileServer {

	public static void main(String[] args)  { 
		
	     try {
		ServerSocket s=new ServerSocket(7777);  
		Socket sc=s.accept() ;//establishes connection
		
		DataInputStream dis = new DataInputStream(sc.getInputStream()); 
        int a = dis.read(); 
        System.out.println("File is Transferred"); 
        FileOutputStream fos = new FileOutputStream("c:\\testing.txt"); 
         
        fos.write(a); 
       
       } catch (IOException e) { 
    	   
         e.printStackTrace(); 
       }
}
}