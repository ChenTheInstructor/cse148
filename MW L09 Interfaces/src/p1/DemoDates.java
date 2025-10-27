package p1;

import java.time.LocalDate;
import java.util.Date;

public class DemoDates {

	public static void main(String[] args) {
		Date d1 = new Date();
		LocalDate d2 = LocalDate.now();
		LocalDate d3 = LocalDate.of(2025, 12, 25);
		System.out.println(d3.getDayOfYear() - d2.getDayOfYear());
	}

}
