package v1_0;

import java.util.Arrays;

public class CourseBag {
	private Course[] arr;
	private int count;
	
	public CourseBag(int maxSize) {
		arr = new Course[maxSize];
		count = 0;
	}
	
	public int getCount() {
		return count;
	}
	
	

	public Course[] getArray() {
		return arr;
	}

	public boolean addCourse(Course course) {
		if(course == null || course.getTITLE() == null || course.getTITLE().equals("")) {
			return false;
		}
		arr[count++] = course;
		return true;
	}
	
	public int totalCredits() {
		int total = 0;
		for(int i = 0; i < count; i++) {
			if(arr[i].getGradePoint() == -1.0 || arr[i].getLetterGrade() == null) {
				continue;
			}
			total += arr[i].getCREDITS();
		}
		return total;
	}
	
	public double totalWeightedGradePoints() {
		double total = 0.0;
		
		for(int i = 0; i < count; i++) {
			if(arr[i].getGradePoint() == -1.0 || arr[i].getLetterGrade() == null) {
				continue;
			}
			total += (arr[i].getCREDITS() * arr[i].getGradePoint());
		}
		return total;
	}
	
	public double calculateGPA() {
		return  totalWeightedGradePoints()/ totalCredits(); 
	}

	@Override
	public String toString() {
		String courses = "";
		for(int i = 0; i < count; i++) {
			courses += arr[i];
		}
		return "\nCourseBag \n[" + courses + "\n]\n";
	}
	
	
}
