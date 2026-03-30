package week_3;
import java.util.*;
class InvalidPhoneNumberExcep extends Exception{
	public InvalidPhoneNumberExcep(String msg) {
		super(msg);
	}
}
class Contact{
	String name;
	String phone;
	
	Contact(String name, String phone){
		this.name = name;
		this.phone = phone;
	}
}
class ContactOrganizer{
	List<Contact> contacts = new ArrayList<>();
	void addContact(String name, String phone) throws InvalidPhoneNumberExcep{
		if(!phone.matches("\\d{10}")) {
			throw new InvalidPhoneNumberExcep("Phone number must be exact 10 digits.");
		}
		for(Contact c : contacts) {
			if(c.phone.equals(phone)) {
				System.out.println("Duplicate contact not allowed.");
			}
		}
		contacts.add(new Contact(name, phone));
		System.out.println("Contact added successfully.");
	}
	void searchContact(String phone) {
		for(Contact c : contacts) {
			if(c.phone.equals(phone)) {
				System.out.println("Found: " + c.name + "-" + c.phone);
				return;
			}
		}
		System.out.println("Contact not found");
	}
	void deleteContact(String phone) {
		Iterator<Contact> it = contacts.iterator();
		while(it.hasNext()) {
			if(it.next().phone.equals(phone)) {
				it.remove();
				System.out.println("Contact deleted");
				return;
			}
		}
		System.out.println("Contact not found");
	}
}
public class PhoneContactOrganizer {
	public static void main(String[] args) {
		ContactOrganizer app = new ContactOrganizer();

        try {
            app.addContact("Amit", "9876543210");
            app.addContact("Ravi", "9876543210"); 
            app.addContact("Neha", "12345"); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        app.searchContact("9876543210");
        app.deleteContact("9876543210");
	}
}
