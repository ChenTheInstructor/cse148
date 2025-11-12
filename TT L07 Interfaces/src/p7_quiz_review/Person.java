package p7_quiz_review;

import java.util.Objects;

public class Person {
	private String name;
	private final String ID;

	private static int idCount = 0;

	public Person(String name) {
		this.name = name;
		ID = String.valueOf(idCount++);
	}
	
	public Person(Person p) { // make a deep copy of an existing object
		this.name = p.name;
		this.ID = p.ID;
	}
	
	public Person ShallowCopy(Person p) { // returns a shallow copy of an object
		return p;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		return ID;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", ID=" + ID + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(ID, other.ID) && Objects.equals(name, other.name);
	}

}
