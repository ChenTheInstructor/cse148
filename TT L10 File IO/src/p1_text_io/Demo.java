package p1_text_io;

import java.io.File;

import utils.BackupRestoreHandler;
import utils.DataImporter;

public class Demo {

	public static void main(String[] args) {
		StudentBag theBag = new StudentBag(1000);

		DataImporter.importStudentFile("data/data1.txt", theBag);

		BackupRestoreHandler.backup(theBag);
		theBag = null;
		
		
		File file = new File("backup/studentBag.dat");
		if (file.exists()) {
			theBag = BackupRestoreHandler.restore();
			theBag.display();
		} else {
			theBag = new StudentBag(1000);
		}

//		theBag.display();
//		
//		System.out.println("\nStudents in CS major: ");
//		Student[] a = theBag.find(s -> s.getMajor().equalsIgnoreCase("CS"));
//		for(Student s : a) {
//			System.out.println(s);
//		}
//		
//		System.out.println("\nStudents on Dean's List: ");
//		Student[] b = theBag.find(s -> s.getGpa() >= 3.5);
//		for(Student s : b) {
//			System.out.println(s);
//		}
//				
//		System.out.println("\nStudents removed due to low GPA: ");
//		Student[] c = theBag.remove(s -> s.getGpa() < 2.0);
//		for(Student s : c) {
//			System.out.println(s);
//		}
//		
//		System.out.println("The remaining students in the bag: ");
//		theBag.display();
//		
// 		System.out.println("The end of program.");
	}

}
