package p1;

public class Demo {

	public static void main(String[] args) {
//		Person p1 = new Person("A");
//		System.out.println(p1);
//		Person p2 = new Person("B");
//		System.out.println(p2);
//		Person p3 = new Person("C");
//		System.out.println(p3);
//		Person p4 = new Person("D");
//		System.out.println(p4);
		
//		Person s1 = new PartTimeStudent("SA", 1.1, 8);
//		Person s2 = new PartTimeStudent("SB", 2.1, 9);
//		Person s3 = new PartTimeStudent("SC", 3.1, 1);
//		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
		
		System.out.println(Calculator.getBookFees());
		
		Calculator pts1 = new PartTimeStudent("PTS1", 4.0, 8);
		System.out.println(pts1.getFee());
	}
	

}
