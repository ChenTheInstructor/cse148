package p1;

import java.util.Objects;

public class Car {
	// static fields
	private static String dealer; // dealer belongs to the class
	
	// instance fields
	private String make; // they belong to each object
	private double price;
	
	// overloaded constructors, a special type of methods
	public Car() { // no-arg constructor
//		make = "Tesla";
//		price = 50000.0;
	}
	
	public Car(String make, double price) {// bring in two pieces of data to the object you are creating
		this.make = make;
		this.price = price;
	}
	
	public Car(double price, String make) {
		this.make = make;
		this.price = price;
	}
	
	public Car(String make) {
		this.make = make;
//		this.price = 2100000000;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getMake() {
		return make;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setAll(String make, double price) {
		this.make = make;
		this.price = price;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(make, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(make, other.make)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

	@Override
	public String toString() {
		return "Make: " + make + ", Price: " + price;
	}
}
