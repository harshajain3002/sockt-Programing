
public class Demo {
	

	public static void main(String[] args) {
		
		MusicInstruments MusicInstruments = new MusicInstruments();
		
	Guitar Guitar = new Guitar("Harp Guitar", 500000, "lush sound type");
	
	System.out.println("iam:");
		MusicInstruments.playInstrument();
	
		System.out.println("awesome because:");
		Guitar.playInstrument();
	
	}
}
