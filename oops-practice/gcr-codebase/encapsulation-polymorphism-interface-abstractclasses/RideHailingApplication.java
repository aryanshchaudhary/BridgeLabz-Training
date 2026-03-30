package encapsulation_polymorphism;
interface GPS {
	String getCurrentLocation();

	void updateLocation(String location);
}

abstract class Vehicle1 {
	private int vehicleId;
	private String driverName;
	protected double ratePerKm;

	public Vehicle1(int vehicleId, String driverName, double ratePerKm) {
		this.vehicleId = vehicleId;
		this.driverName = driverName;
		this.ratePerKm = ratePerKm;
	}

	public abstract double calculateFare(double distance);

	public void getVehicleDetails() {
		System.out.println("Vehicle ID: " + vehicleId + ", Driver: " + driverName);
	}
}

class Car1 extends Vehicle1 implements GPS {
	private String currentLocation;

	public Car1(int id, String driver) {
		super(id, driver, 15); 
	}

	public double calculateFare(double distance) {
		return distance * ratePerKm;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void updateLocation(String location) {
		currentLocation = location;
	}
}

class Bike extends Vehicle1 implements GPS {

	private String currentLocation;

	public Bike(int id, String driver) {
		super(id, driver, 8);
	}

	public double calculateFare(double distance) {
		return distance * ratePerKm;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void updateLocation(String location) {
		currentLocation = location;
	}
}

class Auto extends Vehicle1 implements GPS {

	private String currentLocation;

	public Auto(int id, String driver) {
		super(id, driver, 10); 
	}

	public double calculateFare(double distance) {
		return distance * ratePerKm;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void updateLocation(String location) {
		currentLocation = location;
	}
}

public class RideHailingApplication {
	public static void main(String[] args) {
		Vehicle1[] rides = new Vehicle1[3];

		rides[0] = new Car1(101, "Aman");
		rides[1] = new Bike(102, "Rohit");
		rides[2] = new Auto(103, "Suresh");

		double distance = 10;

		for (Vehicle1 v : rides) {
			v.getVehicleDetails();
			System.out.println("Fare for " + distance + " km: ₹" + v.calculateFare(distance));

			GPS gps = (GPS) v;
			gps.updateLocation("Connaught Place");
			System.out.println("Current Location: " + gps.getCurrentLocation());
		}
	}
}
