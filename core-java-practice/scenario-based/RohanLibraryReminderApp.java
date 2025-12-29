package scenario_based;
import java.util.*;
public class RohanLibraryReminderApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<=5;i++) {
			System.out.println("Book" + i);
			System.out.println("Enter due date ( day number): ");
			int dueDate=sc.nextInt();
			System.out.println("Enter the return date ( day number): ");
			int returnDate=sc.nextInt();
			if(returnDate>dueDate) {
				int lateDays = returnDate-dueDate;
				int fine = lateDays * 5;
				System.out.println("Late by " + lateDays + " days. Fine: Rs" + fine);
			}else {
				System.out.println("Returned on time");
			}
		}
		sc.close();
	}
}
