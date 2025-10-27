package p1;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("b", 3.5, 25);
		Student s2 = new Student("b", 3.6, 25);
		Student s3 = s1.shallowCopy(s1);
		
		System.out.println(s1 == s3);
		
//		Student s3 = new Student(s1);
//		System.out.println(s1.equals(s3));
//		System.out.println(s1 == s3);
//		
////		System.out.println(s1 == s2);
//		System.out.println(s1.compareTo(s2));
//		
////		String s1 = "A";
////		String s2 = "B";
////		System.out.println("4".compareTo("1"));
	}

}
