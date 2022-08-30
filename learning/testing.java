// base class
class Bike {
    public int gear ;
    public int speed ;

    //  constructor
    public Bike(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }
        public void speed(int Increment)
        {
        	speed = ++ Increment ;
        }
        public void Brake(int decrement)
        {
            speed = -- decrement;
        }
        //toString() method to print info of Bike
        public String toString() 
        {
        	return ("No. of gears are " + gear +" speed of Bike is " + speed);
        }
    }
        
        
      public class testing {

	 public static void main(String args[])
	 {
Bike mb = new Bike(4,80) ;
System.out.println(mb.toString());
	    }
	 }

