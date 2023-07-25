
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
		
		Cello cello = new Cello();
        cello.use();
        cello.tuneStrings();
        cello.play();
        cello.bow();
        cello.longBowing();

        ElectronicGuitar electronicGuitar = new ElectronicGuitar();
        electronicGuitar.use();
        electronicGuitar.tuneStrings();
        electronicGuitar.play();
        electronicGuitar.pluck();

        Flute flute = new Flute();
        flute.blowAir();

        Harmonium harmonium = new Harmonium();
        harmonium.blowAir();

        Tabla tabla = new Tabla();
        tabla.tuneSurface();

        Dhol dhol = new Dhol();
        dhol.tuneSurface();

        SurgicalCutter surgicalCutter = new SurgicalCutter();
        surgicalCutter.use();
        surgicalCutter.operate();
        surgicalCutter.sterile();

        SurgicalNeedle surgicalNeedle = new SurgicalNeedle();
        surgicalNeedle.use();
        surgicalNeedle.operate();
        surgicalNeedle.sterile();

        Glucometer glucometer = new Glucometer();
        glucometer.use();
        glucometer.reader();
        glucometer.operate();

        ECGMachine ecgMachine = new ECGMachine();
        ecgMachine.use();
        ecgMachine.reader();
        ecgMachine.operate();

		
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

class ElectronicGuitar extends Guitar {
	
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

class Cello extends Violin {
	void longBowing() {
	    System.out.println("Performing long bowing...");
	}
	
}

abstract class AirBasedMusicalInstrument {
	
	abstract void blowAir();
}

class Flute extends AirBasedMusicalInstrument {
    @Override
	void blowAir() {
		System.out.println("Blowing Air through Flute...");
	}
	
}

class Harmonium extends AirBasedMusicalInstrument {
	@Override
	void blowAir() {
		System.out.println("Blowing Air through Harmonium...");
	}
	
}

abstract class DrumBasedMusicalInstrument {
	
	abstract void tuneSurface();
}

class Tabla extends DrumBasedMusicalInstrument {

	@Override
	void tuneSurface() {
		System.out.println("Tuning Surface of Tabla...");
	}
	
}

class Dhol extends DrumBasedMusicalInstrument {

	@Override
	void tuneSurface() {
		System.out.println("Tuning Surface of Dhol...");
	}
	
}

abstract class MedicalInstrument implements Instrument {
	abstract void operate();
}

abstract class SurgicalInstrument extends MedicalInstrument {
	abstract void sterile();
}

class SurgicalCutter extends SurgicalInstrument {

	@Override
	public void use() {
		System.out.println("Using Surgical Cutter...");
	}

	@Override
	void operate() {
		System.out.println("Operating with Surgical Cutter...");
	}

	@Override
	void sterile() {
		System.out.println("Sterilizing Surgical Cutter...");
	}
	
}

class SurgicalNeedle extends SurgicalInstrument {

	@Override
	public void use() {
		System.out.println("Using Surgical Needle...");
	}

	@Override
	void operate() {
		System.out.println("Operating with Surgical Needle...");
	}

	@Override
	void sterile() {
		System.out.println("Sterilizing Surgical Needle...");
	}
	
}

abstract class PathologicalInstrument extends MedicalInstrument {
	abstract void reader();
}

class Glucometer extends PathologicalInstrument {

	@Override
	public void use() {
		System.out.println("Using Glucometer...");
	}

	@Override
	void reader() {
		System.out.println("Reading Glucose Levels with Glucometer...");
	}

	@Override
	void operate() {
		System.out.println("Operating Glucometer...");
	}
	
}

class ECGMachine extends PathologicalInstrument {

	@Override
	public void use() {
		System.out.println("Using ECG Machine...");
	}

	@Override
	void reader() {
		System.out.println("Reading ECG with ECG Machine...");
	}

	@Override
	void operate() {
		System.out.println("Operating ECG Machine...");
	}
	
}
