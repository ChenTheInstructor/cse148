package p1;

public class Cat extends Animal {

	public Cat(String name, String species) {
		super(name, species);
	}
	
	@Override
	public String getName() {
		return "The cat name is: " + super.getName();
	}

	@Override
	public String toString() {
		setAll("A", "B");
		return "Cat [name=" + getName() + ", Cat Breed: " + getSpecies() + "]";
	}
	
	
}
