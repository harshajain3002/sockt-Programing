
public class Guitar extends MusicInstruments {

	 String GuitarType ;
	 
	 
	 public Guitar(String name, int Price, String GuitarType) {
		 
		super() ;
		
		
			
		
	       // super(name, Price);
	        this.GuitarType = GuitarType ;
	 }
	        
	        
	        @Override
	        void playInstrument(){
	                System.out.println(" Guitar is the best...");
	            }
	        }

