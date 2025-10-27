package p1_course_comparison;

import java.util.Comparator;

public class MyComparator implements Comparator<Course> {

	@Override
	public int compare(Course o1, Course o2) {
		return Integer.compare(o1.getCredits(), o2.getCredits());
	}
	
}