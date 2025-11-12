package p1_functions_treated_as_data;

public class Demo {

	public static void main(String[] args) {
		GreetingBehavior gb1 = (String str) -> System.out.println("Hey, " + str);
		GreetingBehavior gb2 = (String str) -> System.out.println("Bye, " + str);

		Person p1 = new Person("Adam", gb1);
		p1.performGreetings();

		Person p2 = new Person("Bill", gb2);
		p2.performGreetings();

		p2.setGreetingBehavior(gb1);
		p2.performGreetings();

//		Person p3 = new Person("Cathy", (s) -> System.out.println("Greetings! " + s));
		Person p3 = new Person("Cathy", Demo::displayGreetings); // method reference: concise way of using lambda
		System.out.println("Method reference used below: ");
		p3.performGreetings();

		GreetingBehavior gb3 = p3.getGreetingBehavior();
		
		p1.setGreetingBehavior(gb3);
		
		p1.performGreetings();
		
		
	}
	
	public static void displayGreetings(String n) {
		System.out.println("Greetings! " + n);
	}

}
