package book_shelf;

public class Book {
	String title;
	String author;
	
	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Title: " + title + ", Author: " + author;
	}
}
