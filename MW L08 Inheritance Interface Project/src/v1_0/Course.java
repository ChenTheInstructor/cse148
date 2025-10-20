package v1_0;

public class Course {
	private final String TITLE;
	private String letterGrade;
	private final int CREDITS;
	private boolean hasGrade;
	
	public Course(String title, String letterGrade, int credits,boolean hasGrade) {
		super();
		TITLE = title;
		this.letterGrade = letterGrade;
		CREDITS = credits;
		this.hasGrade = hasGrade;
	}

	
	public boolean getHasGrade() {
		return hasGrade;
	}


	public void setHasGrade(boolean hasGrade) {
		this.hasGrade = hasGrade;
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
		return "\n[TITLE=" + TITLE + ", letterGrade=" + letterGrade + ", CREDITS=" + CREDITS + "]";
	}
	
	
}
