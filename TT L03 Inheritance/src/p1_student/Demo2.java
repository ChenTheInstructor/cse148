package p1_student;

import java.util.Optional;

public class Demo2 {

	public static void main(String[] args) {
		Bag myBag = new Bag(10);
		System.out.println(myBag.isEmpty());
		
		myBag.insert(new PartTimeStudent("Ap", 0, 7));
		myBag.insert(new PartTimeStudent("Bp", 1, 4));
		myBag.insert(new PartTimeStudent("Cp", 2, 20));
		myBag.insert(new FullTimeStudent("Af", 3, 4));
		myBag.insert(new FullTimeStudent("Bf", 4, 5));
		myBag.insert(new FullTimeStudent("Cf", 5, 7));
		myBag.insert(new PartTimeStudent("Cp", 2, 2));
		myBag.insert(new FullTimeStudent("Af", 3, 4));
		myBag.insert(new FullTimeStudent("Bf", 1, 1));
		myBag.insert(new FullTimeStudent("Cf", 5, 7));
		System.out.println(myBag.size());
		myBag.showBag();
		myBag.findPartTimeStudentByCredits(20).ifPresent(System.out::println);;
		System.out.println("\n\nThe bag content: ");
		myBag.showBag();
//		result.ifPresent(System.out::println);
//		if(result.isPresent()) {
//			System.out.println(result.get());
//		} else {
//			System.out.println("No Student object found.");
//		}
//		if(result.isEmpty()) {
//			System.out.println("There is no student found.");
//		} else {
//			System.out.println(result.get().toString());
//		}
		System.out.println(myBag.isFull());
	}

}
