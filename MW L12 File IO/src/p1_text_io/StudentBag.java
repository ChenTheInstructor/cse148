package p1_text_io;

import java.util.Arrays;
import java.util.function.Predicate;

public class StudentBag {
	private Student[] arr;
	private int nElems;

	public StudentBag(int maxSize) {
		arr = new Student[maxSize];
	}

	public Student[] remove(Predicate<Student> predicate) {
		Student[] tempArr = new Student[nElems];
		int matchCount = 0;

		for (int i = 0; i < nElems; i++) {
			if (predicate.test(arr[i])) {
				tempArr[matchCount++] = arr[i];
				arr[i] = arr[nElems - 1];
				nElems--;
				i--;
			}
		}
		return Arrays.copyOf(tempArr, matchCount);
	}

	public Student[] find(Predicate<Student> predicate) {
		Student[] tempArr = new Student[nElems];
		int matchCount = 0;
		for (int i = 0; i < nElems; i++) {
			if (predicate.test(arr[i])) {
				tempArr[matchCount++] = arr[i];
			}
		}
		return Arrays.copyOf(tempArr, matchCount);
	}

	public void insert(Student s) {
		arr[nElems++] = s;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
}
