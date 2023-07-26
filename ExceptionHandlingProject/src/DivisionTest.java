
public class DivisionTest {
	
	public static void main(String[] args) {
		System.out.println("BEGIN of main\n");
		
		try {
			Calculator.divide(100, 0);
		} catch (Exception e1) {
			System.out.println("Exception : "+e1);	
		}
		finally {
			System.out.println("Finally : 1 Runs regardless of the exception");
		}
		
		
		try {
			Calculator.divide(40, 5);
		} catch (Exception e2) {
			System.out.println("Exception : "+e2);	
		}
		finally {
			System.out.println("Finally : 2 Runs regardless of the exception");
		}
		
		try {
			Calculator.divide(60, 5);
		} catch (Exception e3) {
			System.out.println("Exception : "+e3);	
		}
		finally {
			System.out.println("Finally : 3 Runs regardless of the exception");
		}
		
		System.out.println("\nEND   of main");

	}
}

class Calculator
{

	static void divide(int num, int deno) throws Exception {
		System.out.println("\nBEGIN of divide");
		System.out.println("Numerator   : "+num);
		System.out.println("Denominator :"+deno);
		System.out.println("Trying to divide "+num+ " by "+deno);
		 
		int division  = num / deno ;
		System.out.println("Division    : "+division);
		System.out.println("END of divide\n");
	}
}