package p1;

import java.util.Objects;

public class Car {
	// package (default), private, public access modifiers
	private static String dealer;

	// instance fields
	private String make;
	private double price;

	// constructors
	public Car() {
		make = "Tesla";
		price = 50000.0;
	}

	public Car(String make, double price) { // local variables
		this.make = make;
		this.price = price;
	}

	public static String getDealer() {
		return dealer;
	}

	public static void setDealer(String dealer) {
		Car.dealer = dealer;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
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
		return "Car [make=" + make + ", price=" + price + "]";
	}

}
