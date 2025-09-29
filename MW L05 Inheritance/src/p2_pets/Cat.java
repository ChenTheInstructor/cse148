package p2_pets;

public class Cat extends Pet {

	public Cat(String name) {
		super(name);
	}

	@Override
	public void makeNoise() {
		System.out.println("The cat " + getName() + " says: Meow!");
	}
	
	@Override
	public String dailyCareInstructions() {
		return "Clean litter daily, fresh water, wet/dry high quality food mix, Interactive toys.";
	}

	@Override
	public String toString() {
		return "Cat [" + super.toString() + "]";
	}
	
	
}
