
public class InstrumentTest {

	public static void main(String[] args) {
		
		Guitar guitar = new Guitar();
		guitar.use();
		guitar.tuneStrings();
		guitar.play();
		guitar.pluck();
		
		Violin violin = new Violin();
		violin.use();
		violin.tuneStrings();
		violin.play();
		violin.bow();
		
		
		Instrument instr = new Violin();
		instr.use();
//		instr.play();
//		instr.tuneStrings();
//		instr.bow();
		
	}
}

interface Instrument {
	void use();     //by default method is public and abstract
}

abstract class MusicalInstrument implements Instrument {
	abstract void play();
}

abstract class StringBasedMusicalInstrument extends MusicalInstrument {
	abstract void tuneStrings();
}

class Guitar extends StringBasedMusicalInstrument {

	public void use() {
		System.out.println("Using Guitar...");
	}

	void play() {
		System.out.println("Playing Guitar...");
	}

	void tuneStrings() {
		System.out.println("Tuning Strings of Guitar...");
	}

	void pluck() {
		System.out.println("Plucking Strings of Guitar...");
	}
}

class Violin extends StringBasedMusicalInstrument {

	public void use() {
		System.out.println("Using Violin...");
	}

	void tuneStrings() {
		System.out.println("Tuning Strings of Violin...");
	}

	void play() {	
		System.out.println("Playing Violin...");
	}
	
	void bow() {
		System.out.println("Bowing Strings of Violin...");
	}
	
}