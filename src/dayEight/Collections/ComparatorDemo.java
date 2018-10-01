package dayEight.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<Author> list = new ArrayList<>();
		list.add(new Author("Henry", "Tropic of Can", 29));
		list.add(new Author("Nalo", " 300", 59));
		list.add(new Author("Frank", "Men search for meaning..", 19));
		list.add(new Author("Deborah", "Sky Boys", 39));
		list.add(new Author("George", "Game of thrones", 23));

		System.out.println("------------Sorting FirstName-----");
		Collections.sort(list); // default first name sort
		for (Author str : list) {
			System.out.println(str);
		}

		System.out.println("-------------Sorting by Age ------");

		Collections.sort(list, new AuthorAge());
		for (Author str1 : list) {
			System.out.println(str1);
		}
		System.out.println("-------------Sorting BookName------");

		Collections.sort(list, new BookName());
		for (Author str2 : list) {
			System.out.println(str2);
		}

	}

}

class Author implements Comparable<Author> {
	String firstName, bookName;
	int auAge;

	public Author(String firstName, String bookName, int auAge) {
		super();
		this.firstName = firstName;
		this.bookName = bookName;
		this.auAge = auAge;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getAuAge() {
		return auAge;
	}

	@Override
	public String toString() {
		return "Author [firstName=" + firstName + ", bookName=" + bookName + ", auAge=" + auAge + "]";
	}

	public void setAuAge(int auAge) {
		this.auAge = auAge;
	}

	@Override
	public int compareTo(Author o) {
		// TODO Auto-generated method stub
		return this.firstName.compareTo(o.firstName);
	}

}

class AuthorAge implements Comparator<Author> {

	@Override
	public int compare(Author o1, Author o2) {
		// TODO Auto-generated method stub

		if (o1.auAge == o2.auAge)
			return 0;
		else if (o1.auAge > o2.auAge)
			return 1;
		else
			return -1;
	}

}

class BookName implements Comparator<Author> {

	@Override
	public int compare(Author o1, Author o2) {
		// TODO Auto-generated method stub
		return o1.bookName.compareTo(o2.bookName);
	}

}
