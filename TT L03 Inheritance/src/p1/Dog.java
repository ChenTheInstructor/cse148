package p1;

public class Dog extends Pet {
	private String breed;

	public Dog(String name, String breed) {
		super(name);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public void bark() {
		System.out.println("Bark...");
	}

	@Override
	public String toString() {
		return "Dog [" + getName() + ", breed=" + breed + "]";
	}

	@Override
	public void move() {
		System.out.println("The dog is jumping...");
	}
//	@Override
//	public String toString() {
//		return "Dog [breed=" + breed + ", " + super.toString() + "]";
//	}
	
	

//	public String toString() {
//		return getName() +": " + breed;
//	}
	
}
