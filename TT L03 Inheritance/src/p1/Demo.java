package p1;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		Cat c1 = new Cat("C1", 10.5);
		System.out.println(c1);
		c1.meow();
		c1.move();
		
		System.out.println(c1.getClass());

		System.out.println("\n-------------------------");

		Dog d1 = new Dog("D1", "Golden");
		System.out.println(d1);
		d1.bark();
		d1.move();

		System.out.println("\n-------------------------");

		Pet p1 = new Pet("P1");
		System.out.println(p1);
		p1.move();
		
		System.out.println("\n-------------------------");

		Pet o1 = new Pet("P2");
		System.out.println(o1);
		o1.move();
		
		Pet o2 = new Dog("D3", "Golden");
		System.out.println(o2);
		((Dog)o2).bark();
		((Dog)o2).move();
		
		Pet o3 = new Cat("C4", 5.5);
		System.out.println(o3);
		((Cat)o3).meow();
		((Cat)o3).move();
		
		// polymorphism
		// Distinguish Two Types:
		// 1: object type, determined by the constrcutor()
		// 2: reference type: determined by the reference type when variable is declared
	
		// The same object can be referenced by many types
		
		// Pet Zoo
		Pet[] arr = new Pet[6];
		arr[0] = c1;
		arr[1] = d1;
		arr[2] = p1;
		arr[3] = o1;
		arr[4] = o2;
		arr[5] = o3;
		System.out.println("\n\n\nArray content:");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("\n\nSearch for a pet by name: ");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].getName().equals("D1")) {
				System.out.println(arr[i]);
			}
		}
		System.out.println("\n\nSearch for pets by type: ");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] instanceof Pet) {
				System.out.println(arr[i]);
			}
		}
		
		System.out.println("\n\nSearch for pet type only: ");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].getClass()==Pet.class) {
				System.out.println(arr[i]);
			}
		}
	}

}
