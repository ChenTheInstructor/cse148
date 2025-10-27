package p1_course_comparison;

import java.util.Objects;

public class Course implements Comparable<Course>{
	private final String title;
	private String letterGrade;
	private final int credits;

	public Course(String title, String letterGrade, int credits) {
		super();
		this.title = title;
		this.letterGrade = letterGrade;
		this.credits = credits;
	}

	public Course(String title, int credits) {
		super();
		this.title = title;
		this.credits = credits;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(credits, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return credits == other.credits && Objects.equals(title, other.title);
	}

	public String getLetterGrade() {
		return letterGrade;
	}

	public void setLetterGrade(String letterGrade) {
		this.letterGrade = letterGrade;
	}

	public String getTitle() {
		return title;
	}

	public int getCredits() {
		return credits;
	}

	@Override
	public String toString() {
		return "Course [title=" + title + ", letterGrade=" + letterGrade + ", credits=" + credits + "]";
	}

	@Override
	public int compareTo(Course c2) {
//		return Double.compare(this.credits, c2.credits);
//		return -Integer.compare(this.credits, c2.credits);
		return this.title.compareTo(c2.title);
//		return this.letterGrade.compareTo(c2.letterGrade);
	}
}
