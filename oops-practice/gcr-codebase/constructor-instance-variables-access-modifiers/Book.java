package level_1;
public class Book {
	String title;
	String author;
	double price;
	Book() {
		this.title = "Book1";
		this.author = "Author1";
		this.price = 99.99;
	}
	Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void display() {
		System.out.println(title + " " + author + " " + price);
	}
	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book("Fire and Ash", "James Cameroon", 199);	
		
		b1.display();
		b2.display();

	}
}
