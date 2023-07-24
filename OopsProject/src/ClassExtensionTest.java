
public class ClassExtensionTest {

	public static void main(String[] args) {
//		Doctor doc = new Doctor();
//		doc.diagnose();
		
		Doctor doc = new Surgeon();
	    doc.diagnose(); //compile time binding is of Doctor:: diagnose()
	                    //but at runtime it finds the HeartSurgon's object
	                    // hence runtime binding is of HeartSurgeon::
		
//		Surgeon doc = new Surgeon();
//		doc.diagnose();
		
//		HeartSurgeon doc = new HeartSurgeon();
//		doc.diagnose();
		
		
//		if(doc instanceof Doctor) {
//			System.out.println("It's a Doctor's object");
//		} else {
//			System.out.println("It's not a Doctor's object");
//		}
//
//		System.out.println("--------------");
//		
//		if(doc instanceof Doctor) {
//			System.out.println("It's a Doctor's object");
//		} else {
//			System.out.println("It's not a Doctor's object");
//		}
//		
//        System.out.println("--------------");
//		
//		if(doc instanceof Doctor) {
//			System.out.println("It's a Doctor's object");
//		} else {
//			System.out.println("It's not a Doctor's object");
//		}
	}

}

class Doctor {
	void diagnose() {
		//1. 
		System.out.println("Doctor: is Diagnosing... ENT ckeckup");
	}
	
	void presscribe() {
		System.out.println("Doctor: is prescribing... RGB pills....");
	}
	
	void charge() {
		System.out.println("Doctor: is charging... 300/-....");
	}
	
}

class Surgeon extends Doctor {
	// 2. 
	
	void diagnose() {
		//1. 
		System.out.println("Surgeon: is Diagnosing...CT Scan/MRIScan... ");
	}
	
	void presscribe() {
		System.out.println("Surgeon: is prescribing... expensive pills....");
	}
	
	void charge() {
		System.out.println("Surgeon: is charging... 1000/-....");
	}
	
	void  generalSurgeon() {
		System.out.println("Doctor is General Surgeon");
	}
	
	void cut() {
		System.out.println("Surgeon:  is cutting");
	}
	
	void stitch() {
		System.out.println("Surgeon:  is Stitching");
	}
	
}
class HeartSurgeon extends Surgeon {
	void diagnose() {
		//1. 
		System.out.println("HeartSurgeon: is Diagnosing... ECG Report");
	}
	
	void presscribe() {
		System.out.println("HeartSurgeon: is prescribing... expensive pills.... yoga.. exercises...");
	}
	
	void charge() {
		System.out.println("HeartSurgeon: is charging... 3000/-....");
	}
}

