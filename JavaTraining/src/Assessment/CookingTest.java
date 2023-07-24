package Assessment;

import java.util.Arrays;

public class CookingTest {
	
	public static void main(String[] args) {
		Ingredient ingredient1 = new Ingredient("Pizza Dough", "Dough", 10.0f, true);
		Ingredient ingredient2 = new Ingredient("Tomato", "Vegetable", 15.0f, true);
		Ingredient ingredient3 = new Ingredient("Mozzarella Chesse", "Cheese", 15.0f, true);
		
		Recipe recipe = new Recipe("Pizza", new Ingredient[] {ingredient1, ingredient2, ingredient3}, "Spicy and delicious!");
		System.out.println("Recipe : " + recipe);
	}
}

class Food{
	
}

class Ingredient extends Food {
	private String name;
	private String type;
	private float price;
	private boolean organic;
	
	public Ingredient(String name, String type, float price, boolean organic) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.organic = organic;
	}

	@Override
	public String toString() {
		return "Ingredient [name=" + name + ", type=" + type + ", price=" + price + ", organic=" + organic + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isOrganic() {
		return organic;
	}

	public void setOrganic(boolean organic) {
		this.organic = organic;
	}
	
}

class Recipe {
	private String name;
	private Ingredient[] ingredients;
	private String description;
	
	public Recipe(String name, Ingredient[] ingredients, String description) {
		super();
		this.name = name;
		this.ingredients = ingredients;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Recipe [name=" + name + ", ingredients=" + Arrays.toString(ingredients) + ", description=" + description
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Ingredient[] getIngredients() {
		return ingredients;
	}

	public void setIngredients(Ingredient[] ingredients) {
		this.ingredients = ingredients;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
