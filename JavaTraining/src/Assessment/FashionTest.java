package Assessment;

public class FashionTest {
	public static void main(String[] args) {
		 CropTop cropTop = new CropTop();
	        cropTop.display();
	        cropTop.specificDisplay();
	        
	        System.out.println("-------------------------------------");

	        TShirt tShirt = new TShirt();
	        tShirt.display();
	        tShirt.specificDisplay();
	        
	        System.out.println("-------------------------------------");

	        Jeans jeans = new Jeans();
	        jeans.display();
	        jeans.specificDisplay();
	        
	        System.out.println("-------------------------------------");

	        // Accessing static fields and methods
	        System.out.println("Static Brand: " + Apparel.brand);
	        Apparel.displayBrand();
	        
	        System.out.println("-------------------------------------");
	        System.out.println("-------------------------------------");
	        
	        Sneakers sneaker = new Sneakers();
	        sneaker.display();
	        sneaker.specificDisplay();
	        
	        System.out.println("-------------------------------------");
	        
	        Heels heel = new Heels();
	        heel.display();
	        heel.specificDisplay();
	        
	        System.out.println("-------------------------------------");
	        
	        Sunglasses sunglass = new Sunglasses();
	        sunglass.display();
	        sunglass.specificDisplay();
	        
	        System.out.println("-------------------------------------");
	        
	        System.out.println("Static Brand : " + NonApparel.brand);
	        NonApparel.displayBrand();
	        
	        System.out.println("-------------------------------------");
	        System.out.println("-------------------------------------");
	}
}

interface Fashion {
	abstract void display();
}

abstract class Apparel implements Fashion {
	String type;
	static final String brand = "FashionBrand";
	
	public Apparel(String type) {
		this.type = type;
	}
	
	public void display() {
		System.out.println("Type :" + type);
	}
	
	abstract void specificDisplay();
	
	final static void displayBrand() {  // final method
		System.out.println("Brand : " + brand);
	}
}

abstract class TopWear extends Apparel {

	public TopWear(String type) {
		super(type);
	}	
}

class CropTop extends TopWear {

	public CropTop() {
		super("Crop Top");
	}

	@Override
	void specificDisplay() {
		System.out.println("Top Wear :: This is a Crop Top.");
	}
}

class TShirt extends TopWear {
	public TShirt() {
		super("T-Shirt");
	}

	@Override
	void specificDisplay() {
		System.out.println("Top Wear :: This is a T-Shirt.");	
	}
}

abstract class BottomWear extends Apparel {
    public BottomWear(String type) {
        super(type);
    }
}

class Jeans extends BottomWear {

	public Jeans() {
		super("Jeans");
	}

	@Override
	void specificDisplay() {
		System.out.println("Bottom Wear :: This is a Jeans");	
	}	
}

abstract class NonApparel implements Fashion {
	String type;
	static final String brand = "FashionBrand";
	
	public NonApparel(String type) {
		super();
		this.type = type;
	}
	
	public void display() {
		System.out.println("Type : " + type);
	}
	
	abstract void specificDisplay();
	
	static void displayBrand() {
		System.out.println("Brand : " + brand);
	}	
}

abstract class FootWear extends NonApparel {

	public FootWear(String type) {
		super(type);
	}
}

abstract class Accessories extends NonApparel {

	public Accessories(String type) {
		super(type);
	}	
}

class Sneakers extends FootWear {

	public Sneakers() {
		super("Sneakers");
	}

	@Override
	void specificDisplay() {
		System.out.println("FootWear :: This is a pair of Sneakers");		
	}
}

class Heels extends FootWear {

	public Heels() {
		super("Heels");
	}

	@Override
	void specificDisplay() {
		System.out.println("FootWear :: This is a pair of Heels");
	}
}

class Sunglasses extends Accessories {

	public Sunglasses() {
		super("Sunglasses");
	}

	@Override
	void specificDisplay() {
		System.out.println("Accessories :: These are Sunglasses");		
	}	
}

class Jwelery extends Accessories {

	public Jwelery() {
		super("Jwelery");
	}

	@Override
	void specificDisplay() {
		System.out.println("Accessories :: This is Jwelery");	
	}
}














