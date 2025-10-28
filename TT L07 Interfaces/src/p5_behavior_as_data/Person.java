package p5_behavior_as_data;

public class Person {
	private String name;
	private GreetingBehavior greetingBehavior;

	public Person(String name, GreetingBehavior greetingBehavior) {
		super();
		this.name = name;
		this.greetingBehavior = greetingBehavior;
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

	public void performGreeting() {
		greetingBehavior.greet(name);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", greetingBehavior=" + greetingBehavior + "]";
	}

}
