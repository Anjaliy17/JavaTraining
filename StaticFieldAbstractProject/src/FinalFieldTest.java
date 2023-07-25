
public class FinalFieldTest {
	public static void main(String[] args) {
		
		final float PI = 3.14f;   // local variable of main
		System.out.println("PI " + PI);
		
//		PI = 3.18f;
//		System.out.println("PI " + PI);
		
		Circle cir1 = new Circle(2);
		Circle cir2 = new Circle(2);
		Circle cir3 = new Circle(2);
		
		cir1.calcArea();
		cir2.calcArea();
		cir3.calcArea();
		
		Car car1 = new Car("Black", "MH-12-7584");
		Car car2 = new Car("White", "MH-14-8542");
		Car car3 = new Car("Red", "MH-15-4842");
		
		car1.showCar();
		car2.showCar();
		car3.showCar();
	}

}

class Car {
	private String color;
	private final String numberPlate;
	
	public Car(String color, String numberPlate) {
		super();
		this.color = color;
		this.numberPlate = numberPlate;
	}
	
	void showCar() {
		System.out.println("Car : " + color);
		System.out.println("Number Plate : " + numberPlate);
	}
	
	
}

class Circle {
	private float radius;
	private final static float PI = 3.14f; //UNIVERSAL CONSTANT
	
	public Circle(float radius) {
		super();
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	void calcArea() {
		float area = PI * radius * radius;
		System.out.println("Area : " + area);
	}
	
}
