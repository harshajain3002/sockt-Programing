
class Student{  
	     int rollno;  
	     String name;  
	     static String college = "ipu";  
	     //static method to change the value of static variable  
	     static void change(){  
	     college = "ggsu";  
	     }  
	     //constructor to initialize the variable  
	     Student(int r, String n){  
	     rollno = r;  
	     name = n;  
	     }  
	     //method to display values  
	     void display(){System.out.println(rollno+" "+name+" "+college);}  
	} 

	//Test class to create and display the values of object  
class TestStatic{  
	    public static void main(String args[]){  
	    Student.change();//calling change method  
	    
	    Student s1 = new Student(11,"Jayant");  
	    Student s2 = new Student(22,"Aryan");  
	    Student s3 = new Student(33,"Piyush");  
	    //calling display method  
	    s1.display();  
	    s2.display();  
	    s3.display();  
	    }  
	}  
