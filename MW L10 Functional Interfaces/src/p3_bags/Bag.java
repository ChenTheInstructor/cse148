package p3_bags;

import java.util.Arrays;
import java.util.function.Predicate;

public class Bag {
	private Student[] arr;
	private int nElems;
	
	public Bag(int maxSize) {
		arr = new Student[maxSize];
		nElems = 0;
	}
	
	public void insert(Student s) {
		arr[nElems++] = s;
	}
	
	public Student[] search(Predicate<Student> predicate) {
		Student[] temp = new Student[nElems];
		int matchCount = 0;
		for(int i = 0; i < nElems; i++) {
			if(predicate.test(arr[i])) {
				temp[matchCount++] = arr[i];
			}
		}
		
		return Arrays.copyOf(temp, matchCount);
	}
	
	
	public void insert(String name, double gpa) {
		Student newStudent = new Student(name, gpa);
		arr[nElems++] = newStudent;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
}
