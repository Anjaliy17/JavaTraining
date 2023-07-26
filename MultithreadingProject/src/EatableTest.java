
public class EatableTest {
	public static void main(String[] args) {
		
		
		Pizza pizza = new Pizza();
		pizza.start();
		System.out.println("--------");
		
		Chalk chalk = new Chalk();
		//chalk.eat();
		FoodItem food = new FoodItem(chalk);
		food.start();
		
		System.out.println("--------");

        Lead pencil = new Lead();
        FoodItem pencilFood = new FoodItem(pencil);
        pencilFood.start();
	}
}
interface Eatable
{
	void eat();
}
class FoodItem implements Eatable {

	Eatable eatable;
	
	FoodItem() {
		eatable = this;
	}
	FoodItem(Eatable e) {
		eatable = e;
	}
	
	public void eat() {
		System.out.println("Eating food Item...");
	}
    void start() {
		System.out.println("Started eating...food Item...take plate..take fork...take water..take napkin...");
		eatable.eat();
	}
}
class Pizza extends FoodItem
{
	public void eat() {
		System.out.println("Eating...Pizza...cut into 6 pies....");
	}
}


class Stone {
	
}
class Chalk extends Stone implements Eatable {
	public void eat() {
		System.out.println("Eating the chalk.........");
	}
}

class Graphite {
	
}

class Lead extends Graphite implements Eatable {

	@Override
	public void eat() {
		System.out.println("Eating the Pencil lead...");		
	}
	
}