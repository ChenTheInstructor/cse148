package p1;

import java.util.Objects;

public class Book implements Comparable<Book>{
	private String title;
	private double price;
	private int year;

	public Book(String title, double price, int year) {
		super();
		this.title = title;
		this.price = price;
		this.year = year;
	}
	
	public Book(Book b) { // deep copy constructor
		this.title = b.title;
		this.price = b.price;
		this.year = b.year;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(price, title, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(title, other.title) && year == other.year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + ", year=" + year + "]\n";
	}

	@Override
	public int compareTo(Book o) {
//		return this.title.compareTo(o.title);
		return Double.compare(this.price, o.price);
//		return Integer.compare(this.year, o.year);
	}

	
}
