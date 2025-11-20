package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import p1_text_io.Student;
import p1_text_io.StudentBag;

public class DataImporter {

	public static void importStudentFile(String fileName, StudentBag theBag) {
		File file = new File(fileName);
		try {
			Scanner scanner = new Scanner(file);
			String headings = scanner.nextLine();
			System.out.println(headings);
			
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				
				String fn = scanner.next();
				String ln = scanner.next();
				String major = scanner.next();
				double gpa = scanner.nextDouble();
				int age = scanner.nextInt();
				
//				String[] arr = line.split(" ");
//				String fn = arr[0];
//				String ln = arr[1];
//				String major = arr[2];
//				double gpa = Double.parseDouble(arr[3]);
//				int age = Integer.parseInt(arr[4]);
				
				Student s = new Student(fn,ln,major, gpa, age);
				theBag.insert(s);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(NoSuchElementException e) {
			System.out.println("Reached the end of file!");
		}
	}
}
