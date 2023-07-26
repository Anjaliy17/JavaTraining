
public class CustomExceptionTest {
	public static void main(String[] args) 
	{
		System.out.println("\nMAIN STARTED...\n");
		try {
            Person driver = new Person("John Doe", false);
            Car myCar = new Car(driver);
            myCar.longDrive();
        } catch (CarKeyNotFoundException ex1) {
            System.out.println("Key Issue : " + ex1);
        } catch (DrivingLicenseExpiredException ex2) {
            System.out.println("License Issue : " + ex2);
        } catch (RedSignalDishnouredException ex3) {
            System.out.println("Signal Issue : " + ex3);
        } catch (FuelEmptyException ex4) {
            System.out.println("Fuel Issue : " + ex4);
        } catch (TireBurstException ex6) {
            System.out.println("Tire Issue : " + ex6);
        } catch (OverheatedEngineException ex7) {
            System.out.println("Overheated Engine Issue : " + ex7);
        }
		
		System.out.println("\nMAIN finished...\n");
		
	}
}

class CarKeyNotFoundException extends Exception
{
	CarKeyNotFoundException(String msg) {
		super(msg);
	}
}
class RedSignalDishnouredException extends RuntimeException
{
	RedSignalDishnouredException(String msg) {
		super(msg);
	}
}

class FuelEmptyException extends Exception
{
    FuelEmptyException(String msg) {
        super(msg);
    }
}

class DrivingLicenseExpiredException extends Exception
{
    DrivingLicenseExpiredException(String msg) {
        super(msg);
    }
}

class TireBurstException extends RuntimeException
{
    TireBurstException(String msg) {
        super(msg);
    }
}

class OverheatedEngineException extends RuntimeException
{
    OverheatedEngineException(String msg) {
        super(msg);
    }
}

class Person {
	private String name;
	private boolean licenseExpired;
	
	public Person(String name, boolean licenseExpired) {
		this.name = name;
		this.licenseExpired = licenseExpired;
	}
	
	public boolean isLicenseExpired() {
		return licenseExpired;
	}
}

class Car
{
	boolean keyFound=false;
	
	Car(Person driver) throws CarKeyNotFoundException, DrivingLicenseExpiredException {
		double value = Math.random()%10;
		
		if(value>=0.40) {
			keyFound=true;
		}
		
		if(keyFound==true) {
			System.out.println("Car is started....");
			
			if(driver.isLicenseExpired()) {
				throw new DrivingLicenseExpiredException("Your driving license is expired...");
			}
		}
		else {
			//System.out.println("Car Key Not Found....");
			throw new CarKeyNotFoundException("Hey...Where is the Car Key? im not getting it...");
			
		}
	}
	public void longDrive() throws FuelEmptyException {
		for (int i = 1; i <=30; i++) {
			System.out.println(i+" kms driven....");
			double value = Math.random()%10;
			if(value>0.95) {
				RedSignalDishnouredException ex1 = new RedSignalDishnouredException("Oh No!!! Red signal is dishonoured....");
				throw ex1;
			}
			
			if(i == 10) {
				throw new FuelEmptyException("Out of Fuel...");
			} else if(i == 20) {
				throw new TireBurstException("Tire Burst");
			} else if(i == 25) {
				throw new OverheatedEngineException("Engine overheated...");
			}
		}
	}
}