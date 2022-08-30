
	// base class
	class BikeDemo {
	    private final int gear ;
	    private int speed ;

	    //  constructor
	   public BikeDemo(int gear, int speed)
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
	        
	        
	      public class testing2 {

		 public static void main(String args[])
		 {
			 BikeDemo mb = new BikeDemo(4,90);
	System.out.println(mb.toString());
	
		    }
	      }

	      
	  