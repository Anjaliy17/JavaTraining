
public class KiteTest {

	public static void main(String[] args) {
		
		Kite.showKiteCount();
		
		Kite kite1 = new Kite("ABHI", "GREEN", 50, true);
		//kite1.showKite();
		
		Kite kite2 = new Kite("ANUBHAV", "RED", 80, true);
	//	kite2.showKite();
		
		Kite kite3 = new Kite("SWATI", "YELLOW", 70, true);
	//	kite3.showKite();
		
		Kite.showKiteCount();
		
		Kite kite4 = new Kite("NISHANT", "BLUE", 60, true);
	//	kite4.showKite();
		
		Kite kite5 = new Kite("PEARL", "GREY", 40, true);
	//	kite5.showKite();
		
		Kite.showKiteCount();
		
		kite4.kiteFight(kite5);
		
		Kite.showKiteCount();
	}

}

class Kite {
	private String owner;
	private String color;
	private int length;
	private boolean flying;
	
	private static int kiteCount;   //shared data across all Kite's objects
	
	public static void showKiteCount() {
		System.out.println("Total kites in the sky : " + kiteCount);
	}

	public Kite(String owner, String color, int length, boolean flying) {
		super();
		System.out.println("Kite is created");
		this.owner = owner;
		this.color = color;
		this.length = length;
		this.flying = flying;
		kiteCount++;
		
	}
	
	void showKite() {  // non-static can refer static
		System.out.println("Kite Owner : " + owner);
		System.out.println("Kite Color : " + color);
		System.out.println("Kite Lenght : " + length);
		System.out.println("Kite Flying : " + flying);
		showKiteCount();
		System.out.println("----------------------------------------------");
	}
	
	void kiteFight(Kite ref) {
		System.out.println(this.color + " kite initiated fight by : " + ref.color + " kite");
		for(int i = 1; i <= 20; i++) {
			double value = Math.random() % 10;
			System.out.println("Kites are fighting...." + value);
			
			if(value > 0.85) {
				kiteCount--;
				this.flying = false;
				System.out.println(owner + " lost the fight...");
				break;
			}
			
			if(value < 0.10) {
				kiteCount--;
				ref.flying = false;
				System.out.println(ref.owner + " lost the fight...");
				break;
			}
			
     		if(value >= 0.30 && value <= 0.40) {
     			kiteCount--;
     			kiteCount--;
     			this.flying = false;
     			ref.flying = false;
     			System.out.println("Both " + owner + " and " + ref.owner + " lost the fight...");
     			break;
     		}
		}
	}

	@Override
	public String toString() {
		return "Kite [owner=" + owner + ", color=" + color + ", length=" + length + "]";
	}
	
	
}
