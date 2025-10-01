package p1;
// superclass
public class Pet {
	private String name;

	public Pet(String name) {
		super(); // calling superclass (Object)'s constructor. It must be the first line
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void move() {
		System.out.println("The pet is moving...");
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + "]";
	}

}
