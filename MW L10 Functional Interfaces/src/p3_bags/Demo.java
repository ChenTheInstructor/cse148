package p3_bags;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("Adam", 3.7);
		Student s2 = new Student("Bill", 4.0);
		Student s3 = new Student("Cathy", 3.0);
		Student s4 = new Student("Dave", 3.5);
		Bag myBag = new Bag(1000);
		myBag.insert(s1);
		myBag.insert(s2);
		myBag.insert(new Student("Cathy", 3.7));
		myBag.insert(new Student("Dave"));
//		
//		Student[] studentsFound = myBag.search((s) -> s.getGpa() >= 3.0 && s.getName().compareTo("Bill") > 0);
//		System.out.println(Arrays.toString(studentsFound));
		
//		s1.curveGpa((gpa) -> gpa + 0.5 );
//		System.out.println(s1.getGpa());
		
		Student[] arr = {s1, s2, s3, s4};
		Arrays.stream(arr).filter((s) -> s.getGpa() >= 3.5).forEach(System.out::println);
		
		
	}

}
