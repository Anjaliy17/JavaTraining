
public class OverridingTest {
	public static void main(String[] args) {
		Father f = new Father();
		f.farming();
	//	f.javaCoding();
		
		Child c = new Child();
		c.farming();
		c.javaCoding();
	}

}

class GrandFather {
	void farming() {
		System.out.println("GrandFather: Farming in traditional style.. using bull and plough");
	}
}

class Father extends GrandFather {
	void farming() {
		super.farming(); //calling GrandFather's farming
		System.out.println("Father: Farming in new style...");
	}
	
	void banking() {
		System.out.println("Father is doing banking...");
	}
}

class Child extends Father {
	void farming() {
		super.farming(); //calling Father's farming
		System.out.println("Child: Farming in new style... using robotic tractor.");
	}
	void javaCoding() {
		System.out.println("Child doing java coding.");
	}
}
