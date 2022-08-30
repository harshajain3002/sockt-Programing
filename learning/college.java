class profeser {
	//private variables declared
  private String Name;
   private int collegeid;
   private int Age;
   
   // get method for Name to access
   public String getName()
   { 
	   return Name; 
	   }
   public int getcollegeid()
   { return collegeid; 
   }
   //get method for age  to access
   public int getAge() 
   { 
	   return Age; 
	   }
   // set method for Name to access
   public void setName(String Name)
   {
	 this.Name = Name ; 
	   
   }

   public void setCollegeid(int collegeid) {
	this.collegeid = collegeid;
}
// set method for age to access
   public void setAge(int age) {
	Age = age;
}
}

public class college 
{
	public static void main(String[] args) {
profeser obj = new profeser() ;
obj.setName("jivan") ; // Set the value of the name variable to "jivan"
obj.setCollegeid(34) ;
obj.setAge(35) ;

System.out.println(" name: " + obj.getName());
System.out.println(" age: " + obj.getAge());
System.out.println("colegeid: " + obj.getcollegeid());

}
}
