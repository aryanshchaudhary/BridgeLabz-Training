package stream_API;
import java.util.*;
import java.time.*;

class Member {
	String name;
	LocalDate expiryDate;

	Member(String name, LocalDate expiryDate) {
		this.name = name;
		this.expiryDate = expiryDate;
	}
}

public class ExpiringMemberships {
	public static void main(String[] args) {
		List<Member> members = Arrays.asList(new Member("Rahul", LocalDate.now().plusDays(10)),
				new Member("Anita", LocalDate.now().plusDays(40)), new Member("Suresh", LocalDate.now().plusDays(20)));
		members.stream().filter(m -> m.expiryDate.isBefore(LocalDate.now().plusDays(30))).forEach(
				m -> System.out.println("Membership expiring soon: " + m.name + ", Expiry Date: " + m.expiryDate));
	}
}
