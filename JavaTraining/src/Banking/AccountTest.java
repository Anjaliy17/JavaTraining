package Banking;

public class AccountTest {
	public static void main(String[] args) {
		Book bookObj1 = new Book();
		bookObj1.setBook(101, "JPL", "James Gosling", 890, 1200, 1);
		
		Book bookObj2 = new Book();
		bookObj2.setBook(101, "Unix", "Richard", 890, 1200, 1);
		
		bookObj1.bookName = bookObj1.bookName;
	}
}

class Book {
	int bookNumber;
	String bookName;
	String author;
	float price;
	int numberOfPages;
	int edition;
	
	public void setBook(int bookNumber, String bookName, String author, float price, int numberOfPages, int edition ) {
		this.bookNumber = bookNumber;
	}
}
