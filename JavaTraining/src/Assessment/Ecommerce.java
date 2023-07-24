package Assessment;

public class Ecommerce {

	public static void main(String[] args) {
		
//		Product prod1 = new Product(12345, "Smartphone", 10500.00);
//		prod1.displayDetails();
//		
//		System.out.println("--------------------------");
//		
//		Electronic ele1 = new Electronic(67890, "Laptop", 129900, "Intel Core i7", "16GB RAM");
//		ele1.displayDetails();
//		
//		System.out.println("--------------------------");
//		
//		Clothing cloth1 = new Clothing(54321, "T-shirt", 599.99, "Cotton", "M");
//		cloth1.displayDetails();
//		
//		System.out.println("--------------------------");
//		
//		Camera cam1 = new Camera(11223, "DSLR Camera", 899.99, "24MP", "Full HD");
//		cam1.displayDetails();
		
		System.out.println("--------------------------");
		
		Product product1 = new Product("12345", "Smartphone", 799.99);
        Product product2 = new Product("67890", "Laptop", 1299.99);

        Product expensiveProduct = Product.comparePrices(product1, product2);

        System.out.println("The more expensive product is:");
        expensiveProduct.displayDetails();
		
/*		double discountPrice = prod1.calculateDiscountPrice(10);
		System.out.println("Discounted Price: $" + discountPrice);
		
		System.out.println("--------------------------");
		
		if(prod1 instanceof Electronic) {
			System.out.println("It's Book object");
		} else {
			System.out.println("It's not a Book object");
		}

		System.out.println("--------------");
		
		if(prod1 instanceof Product) {
			System.out.println("It's a Book object");
		} else {
			System.out.println("It's not a Book object");
		}
		
        System.out.println("--------------");
		
		if(prod1 instanceof Clothing) {
			System.out.println("It's a Book object");
		} else {
			System.out.println("It's not a Book object");
		}
		*/
	}

}

class Product {
	private int productId;
	String name;
	double price;
		
	Product(int productId, String name, double price) {
		this.productId = productId;
		this.name = name;
		this.price = price;
	}
	
	public Product(String string, String name2, double price2) {
		// TODO Auto-generated constructor stub
	}

	public void displayDetails() {
		System.out.println("Product ID: " + productId);
		System.out.println("Name: " + name);
		System.out.println("Price: $" + price);
	}
	
	//with argument without return value
	public void updatePrice(double newPrice) {
		this.price = newPrice;
		System.out.println("Price: $" + price);
	}
	
	//with argument, with return value
	public double calculateDiscountPrice(double discountPercentage) {
		double discountPrice = price * (1 - (discountPercentage / 100));
		return discountPrice;
	}
	
	//without argument, with return value
	public double getPrice() {
		return price;
	}
	
	void Category() {
		System.out.println("Category");
	}
	
	void Category(double price) {
		System.out.println("Double Price: " + price);
	}
	
	void Category(double price, String name) {
		System.out.println(name + " price is " + price);
	}
	
	void Category(float price) {
		System.out.println("Float Price: " + price);
	}
	
	static Product comparePrices(Product product1, Product product2) {
		if (product1.price > product2.price) {
            return product1;
        } else {
            return product2;
        }
	}
}

class Electronic extends Product {
	String processor;
	String memory;
	
	Electronic(int productId, String name, double price, String processor, String memory) {
		super(productId, name, price);
		this.processor = processor;
		this.memory = memory;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Processor: " + processor);
		System.out.println("Memory: " + memory);
	}
	
}

class Camera extends Electronic {
	String megapixels;
	String videoResolution;
	
	Camera(int productId, String name, double price, String megapixels, String videoResolution) {
		super(productId, name, price, "Quad-core", "8GB RAM");
		this.megapixels = megapixels;
		this.videoResolution = videoResolution;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Megapixels: " + megapixels);
		System.out.println("Video Resolution: " + videoResolution);
	}
}

class Clothing extends Product {
	String material;
	String size; 
	
	Clothing(int productId, String name, double price, String material, String size) {
		super(productId, name, price);
		this.material = material;
		this.size = size;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Material: " + material);
		System.out.println("Size: " + size);
	}
}