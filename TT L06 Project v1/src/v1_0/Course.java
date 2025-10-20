package v1_0;

public class Course {
	private final String TITLE;
	private String letterGrade;
	private final int CREDITS;

	public Course(String tITLE, String letterGrade, int cREDITS) {
		super();
		TITLE = tITLE;
		this.letterGrade = letterGrade;
		CREDITS = cREDITS;
	}

	public String getLetterGrade() {
		return letterGrade;
	}

	public void setLetterGrade(String letterGrade) {
		this.letterGrade = letterGrade;
	}

	public String getTITLE() {
		return TITLE;
	}

	public int getCREDITS() {
		return CREDITS;
	}

	@Override
	public String toString() {
		return "\nCourse\n[" + TITLE + ", " + letterGrade + ", " + CREDITS + "]";
	}

	public double getGradePoint() {
		return switch (letterGrade) {
		case "A" -> 4.0;
		case "B+" -> 3.5;
		case "B" -> 3.0;
		case "C+" -> 2.5;
		case "C" -> 2.0;
		case "D+" -> 1.5;
		case "D" -> 1.0;
		case "F" -> 0.0;
		default -> {
//			System.out.println("Invalid Letter Grade used!");
			yield -1.0;
		}
		};
	}
}
