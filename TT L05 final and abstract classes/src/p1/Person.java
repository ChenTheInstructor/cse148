package p1;

public abstract class Person {
	private String name;
	private String id;

	private static int idCount = 0;

	public Person(String name) {
		this.name = name;
		id = String.valueOf(idCount++);
	}
	
	public abstract double calculateParkingFees();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}

}
