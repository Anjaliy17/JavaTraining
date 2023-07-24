package BankApplicationProcess;

public class WashingMachineTest {
	
	public static void main(String[] args) {
		
		WashingTub washTub = new WashingTub(10, "Front Load");
		WashingMachine washingMachine = new WashingMachine(washTub);
		
		
		WashingPowder washPowder = new WashingPowder(100, "Nirma", "Front", true, 10.0f);
		System.out.println("wash Powder : " + washPowder);
		
		Water water = new Water("Regular", 5, "Warm");
		Electricity electricity = new Electricity("AC", 220, 10, 5, "PowerSupplier");
		
		Cloth[] clothes = new Cloth[3];
		clothes[0] = new Cloth("Cotton", "White", 15.0f, "Shirt", false);
        clothes[1] = new Cloth("Denim", "Blue", 25.0f, "Jeans", false);
        clothes[2] = new Cloth("Polyester", "Black", 12.0f, "T-Shirt", false);
		
		Laundry result = washingMachine.wash(washPowder, water, electricity, clothes);
		System.out.println("Laundry details: " + result);

	}

}

class Machine{
	
}

class WashingMachine extends Machine { // isA
	
	private WashingTub washTub;
	
	public WashingMachine(WashingTub washTub) {
		this.washTub = washTub;
	}
	
//	WashingMachine washTub = new WashingMachine();

	Laundry wash(WashingPowder washPowder, Water water, Electricity elect, Cloth cloth[]) {
		int numberOfCloths = cloth.length;
		float timeRequired = calculateTimeRequired(cloth, washPowder, water, elect);
		float totalCost = calculateTotalCost(cloth, washPowder);
        float waterUsed = calculateWaterUsed(cloth, washPowder, water);
        float electricityUsed = calculateElectricityUsed(cloth, washPowder, elect);
        float costOfWashingPowder = washPowder.getPrice() * washPowder.getQuantity();
        
        Laundry laundry = new Laundry(numberOfCloths, timeRequired, totalCost, waterUsed, electricityUsed, costOfWashingPowder);
        return laundry;
	}
	
	private float calculateTimeRequired(Cloth[] cloth, WashingPowder washPowder, Water water, Electricity elect) {
		
		float totalWashPowderQuantity = washPowder.getQuantity() * cloth.length;
		float timeRequired = totalWashPowderQuantity / 100.0f;
		
		return timeRequired;
	}
	
	private float calculateTotalCost(Cloth[] cloth, WashingPowder washPowder) {
		
		float totalCost = 0.0f;
		for(Cloth c : cloth ) {
			totalCost += c.getCost();
		}
		
		return totalCost;
	}
	
	private float calculateWaterUsed(Cloth[] cloth, WashingPowder washPowder, Water water) {
		
		float totalWaterUsed = water.getQuantity() * cloth.length * washPowder.getQuantity();
		
		return totalWaterUsed;
	}
	
	private float calculateElectricityUsed(Cloth[] cloth, WashingPowder washPowder, Electricity elect) {
		
		float totalElectricityUsed = elect.getUnitUsed() * cloth.length * washPowder.getQuantity();

		return totalElectricityUsed;
	}
}

class Laundry {
	private int numberOfCloths;
	private float timeRequired;
	private float totalCost;
	private float waterUsed;
	private float electricityUsed;
	private float costOfWashingPowder;
	
	public Laundry(int numberOfCloths, float timeRequired, float totalCost, float waterUsed, float electricityUsed,
			float costOfWashingPowder) {
		super();
		this.numberOfCloths = numberOfCloths;
		this.timeRequired = timeRequired;
		this.totalCost = totalCost;
		this.waterUsed = waterUsed;
		this.electricityUsed = electricityUsed;
		this.costOfWashingPowder = costOfWashingPowder;
	}

	public int getNumberOfCloths() {
		return numberOfCloths;
	}

	public void setNumberOfCloths(int numberOfCloths) {
		this.numberOfCloths = numberOfCloths;
	}

	public float getTimeRequired() {
		return timeRequired;
	}

	public void setTimeRequired(float timeRequired) {
		this.timeRequired = timeRequired;
	}

	public float getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}

	public float getWaterUsed() {
		return waterUsed;
	}

	public void setWaterUsed(float waterUsed) {
		this.waterUsed = waterUsed;
	}

	public float getElectricityUsed() {
		return electricityUsed;
	}

	public void setElectricityUsed(float electricityUsed) {
		this.electricityUsed = electricityUsed;
	}

	public float getCostOfWashingPowder() {
		return costOfWashingPowder;
	}

	public void setCostOfWashingPowder(float costOfWashingPowder) {
		this.costOfWashingPowder = costOfWashingPowder;
	}

	@Override
	public String toString() {
		return "Lundary [numberOfCloths=" + numberOfCloths + ", timeRequired=" + timeRequired + ", totalCost="
				+ totalCost + ", waterUsed=" + waterUsed + ", electricityUsed=" + electricityUsed
				+ ", costOfWashingPowder=" + costOfWashingPowder + "]";
	}
	
}

class Tub{
	
}

class WashingTub extends Tub {
	private int capacity;
	private String type;
	
	public WashingTub(int capacity, String type) {
		super();
		this.capacity = capacity;
		this.type = type;
	}

	@Override
	public String toString() {
		return "WashingTub [capacity=" + capacity + ", type=" + type + "]";
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
		
}

class Powder {
	
}

class WashingPowder extends Powder { // isA
	private int quantity;
	private String brand;
	private String type;
	private boolean scented;
	private float price;
	
	public WashingPowder(int quantity, String brand, String type, boolean scented, float price) {
		super();
		this.quantity = quantity;
		this.brand = brand;
		this.type = type;
		this.scented = scented;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "WashingPowder [quantity=" + quantity + ", brand=" + brand + ", type=" + type + ", scented=" + scented
				+ ", price=" + price + "]";
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isScented() {
		return scented;
	}

	public void setScented(boolean scented) {
		this.scented = scented;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
}

class Water {
	private String type;
	private int quantity;
	private String temperature;
	
	public Water(String type, int quantity, String temperature) {
		super();
		this.type = type;
		this.quantity = quantity;
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "Water [type=" + type + ", quantity=" + quantity + ", temperature=" + temperature + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

}

class Electricity {
	private String type;
	private float voltage;
	private int costPerUnit;
	private int unitUsed;
	private String supplier;
	
	public Electricity(String type, float voltage, int costPerUnit, int unitUsed, String supplier) {
		super();
		this.type = type;
		this.voltage = voltage;
		this.costPerUnit = costPerUnit;
		this.unitUsed = unitUsed;
		this.supplier = supplier;
	}

	@Override
	public String toString() {
		return "Electricity [type=" + type + ", voltage=" + voltage + ", costPerUnit=" + costPerUnit + ", unitUsed="
				+ unitUsed + ", supplier=" + supplier + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getVoltage() {
		return voltage;
	}

	public void setVoltage(float voltage) {
		this.voltage = voltage;
	}

	public int getCostPerUnit() {
		return costPerUnit;
	}

	public void setCostPerUnit(int costPerUnit) {
		this.costPerUnit = costPerUnit;
	}

	public int getUnitUsed() {
		return unitUsed;
	}

	public void setUnitUsed(int unitUsed) {
		this.unitUsed = unitUsed;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}	
	
}

class Cloth {
	
	private String material;
	private String color;
	private float cost;
	private String type;
	private boolean clean;
	
	public Cloth(String material, String color, float cost, String type, boolean clean) {
		super();
		this.material = material;
		this.color = color;
		this.cost = cost;
		this.type = type;
		this.clean = clean;
	}

	@Override
	public String toString() {
		return "Cloth [material=" + material + ", color=" + color + ", cost=" + cost + ", type=" + type + ", clean="
				+ clean + "]";
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isClean() {
		return clean;
	}

	public void setClean(boolean clean) {
		this.clean = clean;
	}
	
}