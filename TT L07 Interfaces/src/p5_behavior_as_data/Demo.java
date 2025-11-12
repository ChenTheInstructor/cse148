package p5_behavior_as_data;

public class Demo {

	// behavior as data!
	public static void main(String[] args) {
		Person p1 = new Person("Alice", (n) -> System.out.println("Hey " + n));
		
		p1.performGreeting();
		
		p1.setGreetingBehavior((n) -> System.out.println("Bye " + n));
		
		GreetingBehavior gp = p1.getGreetingBehavior();
		
		p1.performGreeting();
	}

}
