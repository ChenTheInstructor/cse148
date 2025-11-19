package p2_custom_exceptions;

public class Demo {

	public static void main(String[] args)  {
		Student s1 = null;
		try {
			s1 = new Student("Jose", 20);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		System.out.println(s1);
		
			try {
				s1.setAge(-21);
			} catch (Exception e) {
//				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		
		System.out.println("The age is: " + s1.getAge());
	}

}
