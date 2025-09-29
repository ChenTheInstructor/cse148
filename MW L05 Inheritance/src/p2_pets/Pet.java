package p2_pets;

public class Pet {
	private String name;
	
	public Pet(String name) {
		super();
		this.name = name;
	}
	
	public void makeNoise() {
		System.out.println("The pet is making sound.");
	}
	
	public String dailyCareInstructions() {
		return "Provide water, food, and gentle play.";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + "]";
	}
	
	
}
