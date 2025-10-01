package p1;

public class Bag {
	private Student[] arr;
	int nElems;

	public Bag(int maxSize) {
		super();
		this.arr = new Student[maxSize];
		nElems = 0;
	}

	public Student removeByName(String name) {
		int i;
		for (i = 0; i < nElems; i++) {
			if (arr[i].getName().equalsIgnoreCase(name)) {
				break;
			}
		}

		if (i == nElems) {
			return null;
		} else {
			Student temp = arr[i];
			for (int j = i; j < nElems - 1; j++) {
				arr[j] = arr[j + 1];
			}
			nElems--;
			return temp;
		}
	}

	public Student findByName(String name) {
		for (int i = 0; i < nElems; i++) {
			if (arr[i].getName().equalsIgnoreCase(name)) {
				return arr[i];
			}
		}
		return null;
	}

	public Student findByGPA(double gpa) {
		for (int i = 0; i < nElems; i++) {
			if (arr[i].getGpa() == gpa) {
				return arr[i];
			}
		}
		return null;
	}

	public void insert(Student s) {
		arr[nElems] = s;
		nElems++;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
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

}
