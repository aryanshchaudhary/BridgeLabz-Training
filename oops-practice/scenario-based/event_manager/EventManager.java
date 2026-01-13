package event_manager;

public class EventManager {
	public static void main(String[] args) {
		Ticket[] tickets = {
	            new Ticket(1200),
	            new Ticket(500),
	            new Ticket(1500),
	            new Ticket(800),
	            new Ticket(300),
	            new Ticket(2000)
	        };

	        QuickSorter sorter = new QuickSorter();
	        sorter.quickSort(tickets, 0, tickets.length - 1);

	        System.out.println("🎟️ Tickets sorted by price:");
	        for (Ticket t : tickets) {
	            System.out.print(t.getPrice() + " ");
	        }

	        System.out.println("\n\nTop 3 Cheapest Tickets:");
	        for (int i = 0; i < 3; i++) {
	            System.out.print(tickets[i].getPrice() + " ");
	        }

	        System.out.println("\n\nTop 3 Most Expensive Tickets:");
	        for (int i = tickets.length - 1; i >= tickets.length - 3; i--) {
	            System.out.print(tickets[i].getPrice() + " ");
	        }
	}
}
