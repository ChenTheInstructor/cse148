package p1_student;

import java.util.Optional;

public class Bag {
	private Student[] arr;
	private int nElems;

	public Bag(int maxSize) {
		arr = new Student[maxSize];
		nElems = 0;
	}
	
	public Optional<Student> findPartTimeStudentByCredits(int credits) {
		for(int i = 0; i < nElems; i++) {
			if(arr[i] instanceof PartTimeStudent && ((PartTimeStudent)arr[i]).getCredits() 
					== credits) {
				return Optional.of(arr[i]);
			}
		}
		return Optional.ofNullable(null);
	
	}

	public Optional<Student> removeById(int id) {
		for (int i = 0; i < nElems; i++) {
			if (arr[i].getId() == id) {
				Student temp = arr[i];
				arr[i] = arr[nElems - 1];
				arr[nElems - 1] = null;
				nElems--;

				return Optional.of(temp);
			}
		}
		return Optional.ofNullable(null);
	}

	public Optional<Student> removeByName(String name) {
		int i;
		for (i = 0; i < nElems; i++) {
			if (arr[i].getName().equals(name)) {
				break;
			}
		}

		if (i == nElems) {
			return Optional.ofNullable(null);
		} else {
			Student temp = arr[i];
			for (int j = i; j < nElems - 1; j++) {
				arr[j] = arr[j + 1];
			}
			nElems--;
			return Optional.of(temp);
		}
	}

	public Optional<Student> searchByName(String name) {
		for (int i = 0; i < nElems; i++) {
			if (arr[i].getName().equals(name)) {
				return Optional.of(arr[i]);
			}
		}
		return Optional.ofNullable(null);
	}

	public Optional<Student> searchById(int id) {
		for (int i = 0; i < nElems; i++) {
			if (arr[i].getId() == id) {
				return Optional.of(arr[i]);
			}
		}
		return Optional.ofNullable(null);
	}

	public void insert(Student s) {
		arr[nElems++] = s;
	}

	public int size() {
		return nElems;
	}

	public boolean isEmpty() {
		return nElems == 0;
	}

	public boolean isFull() {
		return nElems == arr.length;
	}

	public void showBag() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
}
