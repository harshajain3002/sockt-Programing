
public class Androidios extends Phones {

	String AndroidVersion;
	String iosVersion ;
	int ScreenSize ;
	 boolean FingerPrint ;
	 
	 public Androidios(int Price , double Weight , String AndroidVersion , String iosVersion ,int ScreenSize , boolean FingerPrint, String Quality, String Name ) {
		 
		// Android inherits Phones’s fields
		  super(Price,Weight,Quality,Name) ;

		//this - reference to the current object
		 
		  this.AndroidVersion = AndroidVersion;
	        this.ScreenSize = ScreenSize;
	        this.FingerPrint = FingerPrint ;
	        this.iosVersion = iosVersion ;
	        
	 }
	 void NewAndroidiosVersion () {
		 System.out.println("NewAndroidVersion appers ...");
		 
	 }
}

