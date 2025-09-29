package p2_pets;

public class Dog extends Pet {

	public Dog(String name) {
		super(name);
	}

	@Override
	public void makeNoise() {
		System.out.println("The dog " + getName() + " says: Woof!");
	}
	
	@Override
	public String dailyCareInstructions() {
		return "Walk 2x per day, fresh water, high quality kibble, play fetch.";
	}

	@Override
	public String toString() {
		return "Dog [" + super.toString() + "]";
	}
	
	
}
