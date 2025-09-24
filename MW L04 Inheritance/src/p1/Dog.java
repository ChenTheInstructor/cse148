package p1;

public class Dog extends Animal {

	public Dog(String name, String species) {
		super(name, species);
	}

	@Override
	public String toString() {
		return "Dog [name=" + getName() + ", Dog Breed:" + getSpecies() + "]";
	}

	
}
