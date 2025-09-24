package p1;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("Joe", 4.0);
		Student s2 = new Student("Joe", 4.0);
		
		System.out.println(s1.equals(s2));
	}

}
