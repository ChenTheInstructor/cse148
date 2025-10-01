package p1_student;

public class Demo2 {

	public static void main(String[] args) {
		Bag myBag = new Bag(10);
		myBag.insert(new PartTimeStudent("Ap", 0, 7));
		myBag.insert(new PartTimeStudent("Bp", 1, 4));
		myBag.insert(new PartTimeStudent("Cp", 2, 2));
		myBag.insert(new FullTimeStudent("Af", 3, 4));
		myBag.insert(new FullTimeStudent("Bf", 4, 5));
		myBag.insert(new FullTimeStudent("Cf", 5, 7));
		System.out.println(myBag.size());
		myBag.showBag();
	}

}
