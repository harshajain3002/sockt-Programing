
public class TestFinally {
	public static void main(String args[]){    
		  try{    
		//below code do not throw any exception  
		   int data=30/5;    
		   System.out.println(data);    
		  }    
		//catch won't be executed  
		  catch(NullPointerException E){  
		System.out.println(E);  
		}    
		//executed regardless of exception occurred or not  
		 finally {  
		System.out.println("finally block is always executed");  
		}    
		    
		System.out.println("rest of the code...");    
		  }    
		}    

