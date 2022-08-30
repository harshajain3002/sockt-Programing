
import java.io.*;  
import java.net.*; 
public class FileClients {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
try {
		Socket sc=new Socket("localhost",7777);
		
		 BufferedReader br = new BufferedReader(new FileReader("c:\\text.txt") ) ;
		 
		 byte []b = new byte[30]; 
         String a = br.readLine(); 
         DataOutputStream dos = new DataOutputStream(sc.getOutputStream()); 
         dos.writeUTF(a); 
         
         System.out.println("Transfer Complete"); 
        } catch (IOException ie) {
           ie.printStackTrace(); 
       }
}
}