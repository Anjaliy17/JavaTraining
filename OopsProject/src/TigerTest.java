
public class TigerTest {
	public static void main(String[] args) {
		
		Tiger tiger = new Tiger();
		tiger.jump();
		tiger.jump(10);
		tiger.jump(12,6);
	}

}

class Tiger {
	void jump() {
		System.out.println("Tiger is Jumping...");
	}
	void jump(int length) {
		System.out.println("Tiger is Jumping..." + length + " feet long");
	}
	void jump(int length, int heigth) {
		System.out.println("Tiger is Jumping..." + length + " feet length and " + heigth + " feet heigth");
	}
	void jump(float length) {
		System.out.println("Tiger is Jumping..." + length + " feet long");
	}
	void jump(int length, float heigth) {
		System.out.println("Tiger is Jumping..." + length + " feet length and " + heigth + " feet heigth");
	}
	void jump(float length, int heigth) {
		System.out.println("Tiger is Jumping..." + length + " feet length and " + heigth + " feet heigth");
	}
	void jump(float length, float heigth) {
		System.out.println("Tiger is Jumping..." + length + " feet length and " + heigth + " feet heigth");
	}
	
}
