package p1;

public class Main {

	public static void main(String[] args) {
		Car c1 = new Car(); // first car object
		Car c2 = new Car();
		c1.setAll("GMC", 19000);
		c2.setAll("GMC", 19000);
		Car c3 = new Car("Honda", 45000.0);
		Car c4 = new Car(25000, "BMW");
		Car c5 = new Car("Mercedes Benz");
		
		System.out.println(c1.equals(c2));
		
//		c1.setAll("GMC", 19000);
//		c2.setAll("Ford", 50000);
//		
//		System.out.println(c1.toString());
//		System.out.println(c2);
//		System.out.println(c3);
//		System.out.println(c4);
//		System.out.println(c5);
//		
//		c5.setPrice(70000.99);
//		c5.setMake("BMW");
//		System.out.println(c5);
	}

}
