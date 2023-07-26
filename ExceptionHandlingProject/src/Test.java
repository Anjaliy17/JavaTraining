
public class Test {

	public static void main(String[] args) {

		System.out.println("Start");
		try {
			
			System.out.println("Line 1");
			System.out.println("Line 2");
			System.out.println("Line 3");
			
			if(500>55)
				throw new RuntimeException("Some Problem 1.....");
			
			System.out.println("Line 4");
			System.out.println("Line 5");
			
			if(50>557)
				throw new RuntimeException("Some Problem 2.....");
			
			System.out.println("Line 6");
			System.out.println("Line 7");
			System.out.println("Line 8");
			
			if(50>552)
				throw new RuntimeException("Some Problem 3.....");
			
			System.out.println("Line 9");
			System.out.println("Line 10");
			
		} catch(RuntimeException ex) {
			System.out.println("Exception caught : " +ex);
		}
		System.out.println("END");
	}

}
