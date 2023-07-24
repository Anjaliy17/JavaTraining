package Assessment;

public class ShapeTest {
	public static void main(String[] args) {
		
   //   creating object and passing value.
//		Circle circleObj = new Circle(3.5, "red", true);
//		circleObj.setSize(5, 6, 3.5);
//		circleObj.print();
//		circleObj.cirColor();
//		circleObj.cirColor(5.2f);
//		circleObj.cirColor(3);
//		circleObj.cirColor(2.4f, "Yellow");
//		circleObj.cirColor("Green", true);
		

//		Circle shape2 = new Circle();
//		shape2.setSize(2, 3, 2.0);	
//		shape2.print();
		
//		Rectangle rect1 = new Rectangle(5);
//		rect1.setSize(7, 9);
//		rect1.print();
		
//		Rectangle rect2 = new Rectangle(7, 3, "blue", false);
//		rect2.print();
//		rect2.displayColor();
//		
//		System.out.println("Function with argument without return value");
//		rect2.reSize(4, 6);
//		
//		int area = rect2.areaOfRect(5, 3);
//		System.out.println("Function with argument, with return value");
//		System.out.println("Area of Rectangle: " + area + "\n");
//		
//		rect2.getLength();
		
		Square sq = new Square(5);
		sq.print();
		
		Rhombus rh = new Rhombus(8);
		rh.print();
		
	}

}

  class Circle {
	double radius;
	String color;
	boolean filled;
	
	// Parameterized constructor
	Circle(double r, String color, boolean filled) {
		this.radius = r;
		this.color = color;
		this.filled = filled;
	}
	
	//method to display
	public void print() {
		System.out.println("Circle radius: " + radius + "\n");
	}
	
	void cirColor() {
		System.out.println(" Color of circle: blue");
	}
	void cirColor(int radius) {
		System.out.println("Radius of circle: " + radius);
	}
	void cirColor(float radius, String color) {
		System.out.println("Radius of circle:" + radius + "Color of circle: " + color);
	}
	void cirColor(String color, boolean filled) {
		System.out.println("Color of circle: " + color + " Circle is filled: " + filled);
	}
	void cirColor(float radius) {
		System.out.println("Radius of circle: " + radius);
	}
}

class Rectangle{
	int length;
	int breadth;
	String color;
	boolean filled;
	
	Rectangle(int length) {
		this.length = length;
	}
	
	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	Rectangle(int length, int breadth, String color, boolean filled) {
		this.length = length;
		this.breadth = breadth;
		this.color = color;
		this.filled = filled;
	}
	
	public void setSize(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	//without argument without return value
	public void print() {
		System.out.println("Rectange length: " + length + " breadth: " + breadth + "\n");
	}
	
	public void displayColor() {
		System.out.println("Function without argument without return value");
		System.out.println("Color of the Rectangle: " + color + "\n");
	}
	
	//with argument without return value
	public void reSize(int newlength, int newbreadth) {
		length = newlength;
		breadth = newbreadth;
		System.out.println("New Size of Rectangle: " + length + ", " + breadth + "\n");
	}
	
	//with argument, with return value
	int areaOfRect(int width, int length) {
		return width*length;
	}
	
	//without argument, with return value
	int getLength() {
		System.out.println("Function without argument, with return value");
		System.out.println("Length of Rectangle: " + length);
		return length;
	}
}

class Square extends Rectangle {

	Square(int side)
    {
        super(side, side);

    }

    public void print()
    {
        System.out.println("I am a square of side " + length);
    }
	
}

class Rhombus extends Square{
	Rhombus(int side) {
		super(side);
	}
	
	public void print()
    {
        System.out.println("I am a rhombus of side " + length);
    }
	
	
}