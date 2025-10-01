package p1_student;

public class Bag {
	private Student[] arr;
	private int nElems;

	public Bag(int maxSize) {
		arr = new Student[maxSize];
		nElems = 0;
	}

//	public Student searchByName(String name) {
//		
//	}
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
		for(int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
}
