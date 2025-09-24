package p1;

public class Cat extends Pet {

	private double weight;
	
	public Cat(String name, double weight) {
		super(name);
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public void move() {
		System.out.println("The cat is climbimg...");
	}
	public void meow() {
		System.out.println("Meow...");
	}

	public String toString() {
		return getName() + ": " + weight;
	}
	
}
