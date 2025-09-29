package p1_student;

public class Demo {

	public static void main(String[] args) {
		PartTimeStudent pts1 = new PartTimeStudent("Joey", 1000, 7);
		double tuition1 = pts1.calculateTuition();
		System.out.println("Part Time Student 1 name " + pts1.getName() + ", Tuition: " + tuition1);
		pts1.showInfo();

		FullTimeStudent fts1 = new FullTimeStudent("Mary", 1001, 4);
		double tuition2 = fts1.calculateTuition();

		System.out.println("Full Time Student 1 name: " + fts1.getName() + ", Tuition: " + tuition2);
		fts1.showInfo();

		// polymorphism
		String str1;
		str1 = new String("Hi");

		PartTimeStudent pts2 = new PartTimeStudent("Zack", 1002, 3); // object type is PartTimeStudent

		Student s1 = new Student("Nancy", 1003); // object type is Student

		System.out.println("\n\n---------------------------");
		// Inheritance represents "is a" relationship. Because of it:
		Student pts3 = new PartTimeStudent("Joe", 1004, 10);
		FullTimeStudent fts2 = new FullTimeStudent("Suzy", 1005, 5);
		Student fts3 = new FullTimeStudent("Kevin", 1006, 4);

		fts2.showInfo();

		System.out.println("\n\n---------------------------------");
		((FullTimeStudent) fts3).showInfo();

		System.out.println("\n\n----------------------------------");
		PartTimeStudent[] arr1 = { pts1, pts2 };
		FullTimeStudent[] arr2 = { fts1, fts2 };

		// polymorphism allows:
		Student[] arr3 = { pts1, pts2, pts3, fts1, fts2 };

		for (int i = 0; i < arr3.length; i++) {
			if (arr3[i].getName().equals("Suzy")) {
				{
					arr3[i].setName("Kathy");
					System.out.println(arr3[i]);
				}
			}
		}

	}
}
