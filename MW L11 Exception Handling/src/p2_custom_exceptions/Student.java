package p2_custom_exceptions;

public class Student {
	private String name;
	private int age;

	public Student(String name, int age) throws InvalidAgeException {
		super();
		this.name = name;
		if(age < 0 || age > 200) {
			throw new InvalidAgeException("The age is not right when running constructor");
		}
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if (age < 0) {
//			try {
				throw new InvalidAgeException("The Age is inapproriate.");
//			} catch (Exception e) {
//				// e.printStackTrace();
//				System.out.println(e.getMessage());
//			}
		}
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}
