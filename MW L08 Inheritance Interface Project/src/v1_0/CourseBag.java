package v1_0;

import java.util.Arrays;

public class CourseBag {
	private Course[] arr;
	private int count;

	public CourseBag() {
		arr = new Course[Settings.MAX_COURSE_BAG_SIZE];
		count = 0;
	}
	
	public Course[] searchByLetterGrade(String letterGrade) {
		Course[] temp = new Course[count];
		int matchCount = 0;
		for(int i = 0; i < count; i++) {
			if(arr[i].getLetterGrade().equalsIgnoreCase(letterGrade)) {
				temp[matchCount++] = arr[i];
			}
		}
//		return temp;
		return Arrays.copyOf(temp, matchCount);
	}
	
	public Course searchByTitle(String title) {
		for(int i = 0; i < count; i++) {
			if(arr[i].getTITLE().equalsIgnoreCase(title)) {
				return arr[i];
			}
		}
		return null;
	}

	public Course[] getCourseArray() {
		return arr;
	}



	public void setCourseArray(Course[] arr) {
		this.arr = arr;
	}



	public int getCount() {
		return count;
	}



	public void setCount(int count) {
		this.count = count;
	}



	public boolean addCourse(Course course) {
		if (course.getTITLE() == null || course == null || course.getTITLE().equals("")) {
			return false;
		} else {
			arr[count++] = course;
			return true;
		}
	}
	
	public boolean isOnDeansList() {
		if(calculateGPA() >= Settings.DEANS_LIST_MINIMUM) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getTotalCredits() {
		int totalCredits = 0;
		for(int i = 0; i < count; i++) {
			if(!arr[i].getHasGrade()) {
				continue;
			}
			totalCredits += arr[i].getCREDITS();
		}
		return totalCredits;
	}
	
	public double getGradePoints() {
		double totalGradePoints = 0.0;
		
		for(int i =0; i < count; i++) {
			if(!arr[i].getHasGrade()) {
				continue;
			}
			totalGradePoints += (arr[i].getCREDITS() * 
					convertLetterGradeToPoint(arr[i].getLetterGrade()));
		}
		return totalGradePoints;
		
	}
	
	public double convertLetterGradeToPoint(String letterGrade) {
		return switch(letterGrade.toUpperCase().trim()) {
		case "A" -> 4.0;
		case "B+" -> 3.5;
		case "B"-> 3.0;
		case "C+" -> 2.5;
		case "C" -> 2.0;
		case "D+" -> 1.5;
		case "D" -> 1.0;
		case "F" -> 0.0;
		default -> -1.0;
		};
	}
	
	public double calculateGPA() {
		return getGradePoints() / getTotalCredits();
	}

	@Override
	public String toString() {
		String courses = "";
		for(int i = 0; i< count; i++) {
			courses += arr[i] + "\n";
		}
		return "CourseBag [" + courses + "]\ncount=" + count  + "\n";
	}

}
