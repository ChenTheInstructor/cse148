package p1;
// class is a blueprint, meant to be used to create objects
public class Pizza {
	// private instance fields, belong to each object (instance)
	private String topping; // access modifiers: public, private, default (package)
	private double price;
	
	// private static fields, belong to the class not any instance
	private static int pieCount = 0;
	
	// public Methods: constructor
	public Pizza() {
//		topping = "Cheese"; null: default value for String
//		price = 9.99; 0.0: default value for double
	}
	
	// setters (mutators)
	// variable block visibility
	public void setTopping(String topping) { // newTopping is a local variable
		this.topping = topping;
	}
	
	public void setPrice(double price) { // newPrice is a local variable
		this.price = price;
	}
	
	// getters (accessors)
	public String getTopping() {
		return topping;
	}
	
	public double getPrice() {
		return price;
	}
	
	//toString method
	@Override
	public String toString() {
		return topping + ": $" + price;
	}
}
