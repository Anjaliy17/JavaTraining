package Assessment;

public class Books {
	public static void main(String[] args) {
//	    TextBook book = new TextBook();
//		Science book = new Science();
//		Biology book = new Biology();
//		TextBook book = new Science();
//   	TextBook book = new Biology();
		Science book = new Biology();
		
		book.noOfPages();
		book.priceOfBook();
		
		
//		if(book instanceof TextBook) {
//			System.out.println("It's Book object");
//		} else {
//			System.out.println("It's not a Book object");
//		}
//
//		System.out.println("--------------");
//		
//		if(book instanceof Science) {
//			System.out.println("It's a Book object");
//		} else {
//			System.out.println("It's not a Book object");
//		}
//		
//        System.out.println("--------------");
//		
//		if(book instanceof Biology) {
//			System.out.println("It's a Book object");
//		} else {
//			System.out.println("It's not a Book object");
//		}
	}
		
}
	

class TextBook {
	void priceOfBook() {
		System.out.println("TextBook: Price of Book... 300/-");
	}
	
	void noOfPages() {
		System.out.println("TextBook: No. of Pages... 840 pages");
	}
	
}

class Science extends TextBook {
	void priceOfBook() {
		System.out.println("Science: Price of Book... 300/-");
	}
	
	void noOfPages() {
		System.out.println("Science: No. of Pages... 840 pages");
	}
	
}
class Biology extends Science {
	void priceOfBook() {
		System.out.println("Biology: Price of Book... 300/-");
	}
	
	void noOfPages() {
		System.out.println("Biology: No. of Pages... 840 pages");
	}
	
}

