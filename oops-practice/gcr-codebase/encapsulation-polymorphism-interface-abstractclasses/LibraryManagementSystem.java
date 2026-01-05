package encapsulation_polymorphism;

import java.util.*;

interface Reservable {
	void reserveItem();

	boolean checkAvailability();
}

abstract class LibraryItem {
	private int itemId;
	private String title;
	private String author;
	private boolean available = true;

	public LibraryItem(int itemId, String title, String author) {
		this.itemId = itemId;
		this.title = title;
		this.author = author;
	}

	public abstract int getLoanDuration();

	public void getItemDetails() {
		System.out.println(itemId + " " + title + " by " + author);
	}
	protected boolean isAvailable() {
		return available;
	}
	protected void setAvailable(boolean status) {
		available = status;
	}
}

class Book extends LibraryItem implements Reservable {
	public Book(int itemId, String title, String author) {
		super(itemId, title, author);
	}

	public int getLoanDuration() {
		return 14;
	}
	public void reserveItem() {
		if(checkAvailability()) {
			setAvailable(false);
			System.out.println("Book reserved successfully");
		}else {
			System.out.println("Book is already reserved");
		}
	}
	public boolean checkAvailability() {
		return isAvailable();
	}
}
class Magazine extends LibraryItem implements Reservable {
	public Magazine(int itemId, String title, String author) {
		super(itemId, title, author);
	}

	public int getLoanDuration() {
		return 10;
	}
	public void reserveItem() {
		if(checkAvailability()) {
			setAvailable(false);
			System.out.println("Magazine reserved successfully");
		}else {
			System.out.println("Magazine is already reserved");
		}
	}
	public boolean checkAvailability() {
		return isAvailable();
	}
}
class DVD extends LibraryItem implements Reservable {
	public DVD(int itemId, String title, String author) {
		super(itemId, title, author);
	}

	public int getLoanDuration() {
		return 7;
	}
	public void reserveItem() {
		if(checkAvailability()) {
			setAvailable(false);
			System.out.println("DVD reserved successfully");
		}else {
			System.out.println("DVD is already reserved");
		}
	}
	public boolean checkAvailability() {
		return isAvailable();
	}
}
public class LibraryManagementSystem {
	public static void main(String[] args) {
		List<LibraryItem> lib = new ArrayList<>();
		lib.add(new Book(1, "The Missile Man" , "Ratan Tata"));
		lib.add(new Magazine(2, "Rupayan" , "Amar Ujala"));
		lib.add(new DVD(3, "Raat Ki Raani" , "Himganga"));
		
		for(LibraryItem l : lib) {
			l.getItemDetails();
            System.out.println("Loan Duration: " + l.getLoanDuration() + " days");

            Reservable reservable = (Reservable) l;
            reservable.reserveItem();
		}
	}
}
