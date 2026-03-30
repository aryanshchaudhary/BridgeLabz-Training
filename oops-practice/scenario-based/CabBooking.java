package stroy_based_07_01_2026;

import java.util.*;

interface FareCalculator {
	double calculateFare(double distance);
}

class NormalFare implements FareCalculator {
	public double calculateFare(double distance) {
		return distance * 10;
	}
}

class PeakFare implements FareCalculator {
	public double calculateFare(double distance) {
		return distance * 15;
	}
}

class NoDriverAvailableException extends Exception {
	public NoDriverAvailableException(String msg) {
		super(msg);
	}
}

class User {
	private String name;

	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

class Driver {
	private String dName;
	private boolean available = true;

	public Driver(String dName) {
		this.dName = dName;
	}

	public boolean isAvailable() {
		return available;
	}

	public void assign() {
		available = false;
	}

	public String getName() {
		return dName;
	}
}

class Ride {
	public int bookId;
	User user;
	Driver driver;
	protected double fare;

	public Ride(int bookId, User user, Driver driver, double fare) {
		this.bookId = bookId;
		this.user = user;
		this.driver = driver;
		this.fare = fare;
	}

	public void display() {
		System.out.println("Ride ID: " + bookId +
				", User: " + user.getName() +
				", Driver: " + driver.getName()
				+ ", Fare: Rs." + fare);
	}

}
class RideService{
	private List<Ride> rides = new ArrayList<>();
	
	public void bookRide(Ride ride) {
		rides.add(ride);
		System.out.println("Ride booked successfully.");
	}
	public void viewRides() {
		for(Ride r : rides) {
			r.display();
		}
	}
	public void updateFare(int bookId, double newFare ) {
		for(Ride r : rides) {
			if(r.bookId == bookId) {
				r.fare = newFare;
				System.out.println("Fare Updated");
			}
		}
	}
	public void cancelRide(int BookId) {
		boolean removed = rides.removeIf(r -> r.bookId == BookId);
		if(removed) {
			System.out.println("Ride Cancelled");
		}else {
			System.out.println("Ride not found");
		}
	}
}
public class CabBooking {
	public static void main(String[] args) throws NoDriverAvailableException{
		User user = new User("Amit");
        Driver driver = new Driver("Rohit");

        if (!driver.isAvailable()) {
            throw new NoDriverAvailableException("No driver available");
        }

        FareCalculator fareCalc = new PeakFare();
        double fare = fareCalc.calculateFare(10);

        driver.assign();

        Ride ride = new Ride(1, user, driver, fare);

        RideService service = new RideService();

        service.bookRide(ride);      
        service.viewRides();           
        service.updateFare(1, 180);    
        service.cancelRide(1);  
	}
}
