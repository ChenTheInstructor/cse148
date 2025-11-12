package p1_functions_treated_as_data;

public class Person {
	// fields
	private String name;
	private GreetingBehavior greetingBehavior;

	public Person(String name, GreetingBehavior greetingBehavior) {
		super();
		this.name = name;
		this.greetingBehavior = greetingBehavior;
	}

	public void performGreetings() {
		greetingBehavior.greet(name);
	}
	
	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GreetingBehavior getGreetingBehavior() {
		return greetingBehavior;
	}

	public void setGreetingBehavior(GreetingBehavior greetingBehavior) {
		this.greetingBehavior = greetingBehavior;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", greetingBehavior=" + greetingBehavior + "]";
	}

}
