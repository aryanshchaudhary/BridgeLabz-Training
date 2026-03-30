package level_1;
public class Book2 {
	String title;
	String author;
	double price;
	boolean available = true;
	Book2(){
		title = "Finding out lost Happiness";
		author = "Bhakti Vedanta";
		price = 70.0;
	}
	void borrowBook() {
		if (available) {
			available = false;
			System.out.println("Book Borrowed: " + title);
		}else {
			System.out.println("Book not available");
		}
	}
	public static void main(String[] args) {
		Book2 b = new Book2();
		b.borrowBook();
		b.borrowBook();
	}
}
