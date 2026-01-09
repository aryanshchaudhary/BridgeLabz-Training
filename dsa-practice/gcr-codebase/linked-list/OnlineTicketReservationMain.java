package circular_linked_list;
import java.time.LocalDateTime;
class Ticket {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    LocalDateTime bookingTime;
    Ticket next;

    Ticket(int ticketId, String customerName, String movieName,
           String seatNumber, LocalDateTime bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}
class TicketReservationSystem {
    private Ticket head = null;
    private Ticket tail = null;

    public void addTicket(int ticketId, String customerName,
                          String movieName, String seatNumber) {

        Ticket newTicket = new Ticket(
                ticketId,
                customerName,
                movieName,
                seatNumber,
                LocalDateTime.now()
        );

        if (head == null) {
            head = tail = newTicket;
            newTicket.next = head;
        } else {
            tail.next = newTicket;
            tail = newTicket;
            tail.next = head;
        }
        System.out.println("Ticket booked successfully.");
    }

    public void removeTicket(int ticketId) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        Ticket current = head;
        Ticket previous = tail;

        do {
            if (current.ticketId == ticketId) {

                if (current == head && current == tail) {
                    head = tail = null;
                }
                else if (current == head) {
                    head = head.next;
                    tail.next = head;
                }
                else if (current == tail) {
                    tail = previous;
                    tail.next = head;
                }
                else {
                    previous.next = current.next;
                }

                System.out.println("Ticket removed successfully.");
                return;
            }

            previous = current;
            current = current.next;

        } while (current != head);

        System.out.println("Ticket not found.");
    }

    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        Ticket temp = head;
        System.out.println("\nBooked Tickets:");
        do {
            displayTicket(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by customer name
    public void searchByCustomer(String customerName) {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        Ticket temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(customerName)) {
                displayTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tickets found for this customer.");
        }
    }

    public void searchByMovie(String movieName) {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        Ticket temp = head;
        boolean found = false;

        do {
            if (temp.movieName.equalsIgnoreCase(movieName)) {
                displayTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tickets found for this movie.");
        }
    }

    public int countTickets() {
        if (head == null) return 0;

        int count = 0;
        Ticket temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }

    private void displayTicket(Ticket t) {
        System.out.println(
                "Ticket ID: " + t.ticketId +
                ", Customer: " + t.customerName +
                ", Movie: " + t.movieName +
                ", Seat: " + t.seatNumber +
                ", Time: " + t.bookingTime
        );
    }
}
public class OnlineTicketReservationMain {
	public static void main(String[] args) {
		TicketReservationSystem system = new TicketReservationSystem();

        system.addTicket(101, "Aryansh", "Inception", "A10");
        system.addTicket(102, "Rahul", "Avatar", "B15");
        system.addTicket(103, "Aryansh", "Inception", "A11");

        system.displayTickets();

        System.out.println("\nSearch by Customer:");
        system.searchByCustomer("Aryansh");

        System.out.println("\nSearch by Movie:");
        system.searchByMovie("Avatar");

        system.removeTicket(102);

        system.displayTickets();

        System.out.println("\nTotal Tickets: " + system.countTickets());
	}
}
