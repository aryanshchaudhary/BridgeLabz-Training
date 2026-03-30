package stream_API;
import java.util.*;
public class EmailNotifications {
	static void sendEmail(String email) {
		System.out.println("Email sent to: " + email);
	}
	public static void main(String[] args) {
		List<String> emails = Arrays.asList("nitish@gmail.com", 
				"aryansh@gmail.com","himanshu@gmail.com");
		
		emails.forEach(email -> sendEmail(email));
	}
}
