//Flight Booking System (CRUD)Scenario:
// Simulate a basic flight booking system where users can search flights, book them,
//and view booking details. 
// Problem Requirements:
//● Use Array to store available flight data.
//● Store user bookings in a List.
//● Use String operations to allow case-insensitive flight search.
//● Use methods for searching, booking, and displaying bookings.

package week_3;
import java.util.*;
class Flight{
	int id;
	String from;
	String to;
	
	Flight(int id, String from, String to){
		this.id = id;
		this.from = from;
		this.to = to;
	}
}
class Booking{
	int bookingId;
	String passenger;
	Flight flight;
	
	Booking(int id, String passenger, Flight flight){
		this.bookingId = id;
		this.passenger = passenger;
		this.flight = flight;
	}
}
public class FlightBookingSystem{
	static Flight[] flights = {
			new Flight(1, "Delhi", "Mumbai"),
			new Flight(2, "Chennai", "Delhi")
	};
	static List<Booking> bookings = new ArrayList<>();

    static void searchFlight(String from, String to) {
        for (Flight f : flights) {
            if (f.from.equalsIgnoreCase(from)
                    && f.to.equalsIgnoreCase(to)) {
                System.out.println("Flight ID: " + f.id);
            }
        }
    }

    static void bookFlight(int bookingId, String name, int flightId) {
        for (Flight f : flights) {
            if (f.id == flightId) {
                bookings.add(new Booking(bookingId, name, f));
                System.out.println("Booking successful");
            }
        }
    }

    static void updateBooking(int bookingId, String newName) {
        for (Booking b : bookings) {
            if (b.bookingId == bookingId) {
                b.passenger = newName;
                System.out.println("Booking updated");
                return;
            }
        }
    }

    static void cancelBooking(int bookingId) {
        bookings.removeIf(b -> b.bookingId == bookingId);
        System.out.println("Booking cancelled");
    }

    static void viewBookings() {
        for (Booking b : bookings) {
            System.out.println("Booking ID: " + b.bookingId +
                    " Passenger: " + b.passenger);
        }
    }

    public static void main(String[] args) {
        searchFlight("Delhi", "Mumbai");
        bookFlight(101, "Paresh", 1);
        viewBookings();
        updateBooking(101, "Rahul");
        cancelBooking(101);
    }
}

