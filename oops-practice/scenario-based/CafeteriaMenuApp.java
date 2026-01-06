package week_3;
import java.util.*;
public class CafeteriaMenuApp {
	static String[] menu = {
	        "Burger",
	        "Pizza",
	        "Sandwich",
	        "Pasta",
	        "French Fries",
	        "Coffee",
	        "Tea",
	        "Cold Drink",
	        "Noodles",
	        "Ice Cream"
	    };
	static void displayMenu() {
		System.out.println("Cafeteria Menu");
		for(int i = 0; i < menu.length; i++) {
			System.out.println(i + ". " + menu[i]);
		}
	}
	static String getItemByIndex(int index) {
		if(index >= 0 && index < menu.length) {
			return menu[index];
		}else {
			return "Invalid Selection";
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		displayMenu();
		System.out.print("\nEnter item index to order: ");
		int choice = sc.nextInt();
		String selectedItem = getItemByIndex(choice);
		System.out.println("You selected: " + selectedItem);
		sc.close();
	}
}
