
public class AbstractTest {
	public static void main(String[] args) {

//      Cannot instantiate the type GeometricalShape
//		GeometricalShape geoShape = new GeometricalShape();
		GeometricalShape geoShape = new Square(25);
		geoShape.calcArea();
		geoShape.calcPeriphery();
		
		geoShape = new Rectangle(15,10);
		geoShape.calcArea();
		geoShape.calcPeriphery();
		
	}

}

abstract class GeometricalShape {
	 abstract void calcArea();
	 abstract void calcPeriphery();
	 
	 void filledColor() {
		 System.out.println("Color is filled...");
	 }
}

class Square extends GeometricalShape{
	int side;
	
	public Square(int side) {
		super();
		this.side = side;
	}

	public int getSide() {
		return side;
	}


	void calcArea() {
		float area = side*side;
		System.out.println("Area of Square :" + area);
	}
	
	void calcPeriphery() {
		float perimeter = 4*side;
		System.out.println("Perimeter of Square :" + perimeter);
	}
}

class Rectangle extends Square{
	int breadth;

	public Rectangle(int side, int breadth) {
		super(side);
		this.breadth = breadth;
	}
	
	void calcArea() {
		float area = getSide() * breadth;
		System.out.println("Area of Rectangle :" + area);
	}


	void calcPeriphery() {
		float perimeter = 2*(getSide() + breadth);
		System.out.println("Perimeter of Rectangle :" + perimeter);
	}
	
}
