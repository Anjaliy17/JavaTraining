package Assessment;

public class FashionTest {
    public static void main(String[] args) {
        
        Login user = new User("user123", "pass456");
//      Login user = new User("user1", "pass123");

        boolean isLoggedIn = user.login("user123", "pass456");

        if (isLoggedIn) {

        	// Accessing static fields and methods
        	System.out.println("Static Brand: " + Apparel.brand);
        	Apparel.displayBrand();

        	System.out.println("-------------------------------------");
            
        	CropTop cropTop = new CropTop("Black", "S", 999.99);
            cropTop.display();
            cropTop.specificDisplay();

            System.out.println("-------------------------------------");

            TShirt tShirt = new TShirt("White", "M", 899.99);
            tShirt.display();
            tShirt.specificDisplay();

            System.out.println("-------------------------------------");

            Jeans jeans = new Jeans("Blue", "L", 1500);
            jeans.display();
            jeans.specificDisplay();



            System.out.println("\n" + "-------------------------------------");
            System.out.println("-------------------------------------" + "\n");
            
            System.out.println("Static Brand : " + NonApparel.brand);
            NonApparel.displayBrand();

            System.out.println("-------------------------------------");

            Sneakers sneaker = new Sneakers("White", "US 9", 3000);
            sneaker.display();
            sneaker.specificDisplay();

            System.out.println("-------------------------------------");

            Heels heel = new Heels("Black", "US 7", 1500);
            heel.display();
            heel.specificDisplay();

            System.out.println("-------------------------------------");

            Sunglasses sunglass = new Sunglasses("Brown", "One Size", 999);
            sunglass.display();
            sunglass.specificDisplay();


            System.out.println("-------------------------------------");
            System.out.println("-------------------------------------");
        } else {
            System.out.println("Login failed. Please try again.");
        }
    }
}

interface Fashion {
    void display();
}

abstract class Apparel implements Fashion {
    String type;
    String color;
    String size;
    double price;
    static final String brand = "FashionBrand";

    public Apparel(String type, String color, String size, double price) {
        this.type = type;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public void display() {
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Price: Rs" + price);
    }

    abstract void specificDisplay();

    final static void displayBrand() { // final method
        System.out.println("Brand: " + brand);
    }
}

abstract class TopWear extends Apparel {

    public TopWear(String type, String color, String size, double price) {
        super(type, color, size, price);
    }
}

class CropTop extends TopWear {

    public CropTop(String color, String size, double price) {
        super("Crop Top", color, size, price);
    }

    @Override
    void specificDisplay() {
        System.out.println("Top Wear :: This is a Crop Top.");
    }
}

class TShirt extends TopWear {
    public TShirt(String color, String size, double price) {
        super("T-Shirt", color, size, price);
    }

    @Override
    void specificDisplay() {
        System.out.println("Top Wear :: This is a T-Shirt.");
    }
}

abstract class BottomWear extends Apparel {
    public BottomWear(String type, String color, String size, double price) {
        super(type, color, size, price);
    }
}

class Jeans extends BottomWear {

    public Jeans(String color, String size, double price) {
        super("Jeans", color, size, price);
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
        System.out.println("Type: " + type);
    }

    abstract void specificDisplay();

    static void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

abstract class FootWear extends NonApparel {
    public FootWear(String type) {
        super(type);
    }

    public FootWear(String type, String color, String size, double price) {
        super(type);
    }
}

abstract class Accessories extends NonApparel {

    public Accessories(String type) {
        super(type);
    }
}

class Sneakers extends FootWear {

    public Sneakers(String color, String size, double price) {
        super("Sneakers", color, size, price);
    }

    @Override
    void specificDisplay() {
        System.out.println("FootWear :: This is a pair of Sneakers");
    }
}

class Heels extends FootWear {

    public Heels(String color, String size, double price) {
        super("Heels", color, size, price);
    }

    @Override
    void specificDisplay() {
        System.out.println("FootWear :: This is a pair of Heels");
    }
}

class Sunglasses extends Accessories {

    public Sunglasses(String color, String size, double price) {
        super("Sunglasses");
    }

    @Override
    void specificDisplay() {
        System.out.println("Accessories :: These are Sunglasses");
    }
}

class Jwelery extends Accessories {

    public Jwelery() {
        super("Jewelry");
    }

    @Override
    void specificDisplay() {
        System.out.println("Accessories :: This is Jewelry");
    }
}

interface Login {
    boolean login(String username, String password);
}

class User implements Login {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            System.out.println("Login successful.");
            return true;
        } else {
            System.out.println("Login failed. Please try again.");
            return false;
        }
    }
}
