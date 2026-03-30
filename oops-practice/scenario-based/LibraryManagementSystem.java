package week_2;
public class LibraryManagementSystem {
	static String[] titles = { "Java Programming", "Finding Our Lost Happiness", "Python Basics", "The Missile Man" };
	static String[] authors = { "Aryansh Chaudhary", "Tony Stark", "Chaudhary Aslam", "Rehman Dakait" };
	static boolean[] isAvailable = { true, true, true, true };

	static void display() {
		System.out.println("Library Books: ");
		for (int i = 0; i < titles.length; i++) {
			System.out.println((i + 1) + ". " + titles[i] + " by " + authors[i] + "| Status: "
					+ (isAvailable[i] ? "Available" : "Checked Out"));
		}
	}

	static void searchBook(String keyword) {
		System.out.println("Search Result: ");
		boolean found = true;
		for (int i = 0; i < titles.length; i++) {
			System.out.println(
					titles[i] + " by " + authors[i] + " | Status: " + (isAvailable[i] ? "Available" : "Checked Out"));
			found = true;
		}
		if (!found) {
			System.out.println("No book found or wrong title entered.");
		}
	}

	static void checkOut(int index) {
		if (isAvailable[index]) {
			isAvailable[index] = false;
			System.out.println("Book checked out successfully.");
		} else {
			System.out.println("Book is already checked out.");
		}
	}

	public static void main(String[] args) {
		display();
		searchBook("Missile");
		checkOut(0);
		display();
	}
}
