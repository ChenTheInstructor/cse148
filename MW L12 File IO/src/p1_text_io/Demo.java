package p1_text_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import utils.DataImporter;

public class Demo {

	public static void main(String[] args) {
		StudentBag theBag = new StudentBag(100);
		DataImporter.importStudents("data1.txt", theBag);
		theBag.display();
		
//		System.out.println("Find somebody:");
//		Student[] foundArr = theBag.find(s -> s.getGpa() >= 3.5);
//		
//		for(Student st : foundArr ) {
//			System.out.println(st);
//		}
//		
//		System.out.println("Students removed: ");
//		Student[] removeArr = theBag.remove(s -> s.getGpa() < 2.0);
//		for(Student st : removeArr ) {
//			System.out.println(st);
//		}
//		
//		System.out.println("The bag content after removal: ");
//		theBag.display();
	}

}
