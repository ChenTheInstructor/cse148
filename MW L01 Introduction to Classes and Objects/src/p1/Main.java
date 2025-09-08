package p1;

public class Main {

	public static void main(String[] args) {
		Pizza p1 = new Pizza(); // the object built based on the blueprint is known as an instance
//		p1.topping = "Cheese";
		
//		System.out.println(p1.getTopping() + ": $" + p1.getPrice());
		System.out.println(p1);
		
		p1.setTopping("Pineapple");
		p1.setPrice(10.99);
		
//		System.out.println(p1.getTopping() + ": $" + p1.getPrice());
		System.out.println(p1);
		
	}

}
