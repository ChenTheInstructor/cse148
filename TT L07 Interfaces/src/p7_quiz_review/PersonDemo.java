package p7_quiz_review;

public class PersonDemo {

	public static void main(String[] args) {
		Person p1 = new Person("A");
		System.out.println(p1);
//		Person p2 = p1.ShallowCopy(p1);
		Person p2 = new Person(p1);
		
		System.out.println(p1 == p2);
	}

}
