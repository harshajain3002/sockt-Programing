
public class dog {


    String name ;
    String breed ;
    
    //constructor (parametarized const)
  public dog (String name , String breed)
{
    this.name = name ;
    this.breed = breed ;
}
    public String getName () 
    {
        return name ;
    }
    public String getBreed ()
    {
        return breed ;
    }
    public String toString()
    {
        return ("My name is " + this. getName () + " my Breed :" + this. getBreed ()) ;
    }
     public static void main(String[] args)
    {
        dog bunny = new dog("bunny ,", "sniffer");
        System.out.println(bunny.toString());
}
} 