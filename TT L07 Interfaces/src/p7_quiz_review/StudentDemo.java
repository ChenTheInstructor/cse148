package p7_quiz_review;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1 = new Student("B", 3.5);
		System.out.println(s1);
		
		Student s2 = new Student(s1);
		System.out.println(s2);
		
		System.out.println(s1 == s2);
		
		Student s3 = new Student("B", 3.5);
		
		Student s4 = new Student(s1);
		
//		System.out.println(s4);
		
		System.out.println(s1.equals(s4));
		System.out.println(s4);
	}

}
