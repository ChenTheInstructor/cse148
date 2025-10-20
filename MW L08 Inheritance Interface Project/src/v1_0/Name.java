package v1_0;

public class Name {
	private String firstName;
	private String lastName;
	private char midInitial;
	
	public Name(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Name(String firstName, String lastName, char midInitial) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.midInitial = midInitial;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getMidInitial() {
		return midInitial;
	}

	public void setMidInitial(char midInitial) {
		this.midInitial = midInitial;
	}

	@Override
	public String toString() {
		return "[firstName=" + firstName + ", lastName=" + lastName + ", midInitial=" + midInitial + "]";
	}
	
	
}
