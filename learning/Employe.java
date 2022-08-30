class off {
	 // data members of the class.
    String name;
    int id;
    off(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
}
public class Employe {
	 public static void main(String[] args)
	    {
	off off = new off ("harsha", 3020) ;
	
	 System.out.println(" offName :" + off.name + " and offId :" + off.id);
}
}

