package encapsulation_polymorphism;
import java.util.*;
interface Insurable {
	double calculateInsurance();
	String getInsuranceDetails();
}
abstract class Vehicle {
	private String vehicleNumber;
	private String type;
	protected double rentalRate;

	public Vehicle(String vehicleNumber, String type, double rentalRate) {
		this.vehicleNumber = vehicleNumber;
		this.type = type;
		this.rentalRate = rentalRate;
	}
	public abstract double calculateRentalCost(int days);
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public String getType() {
		return type;
	}
}
class Car extends Vehicle implements Insurable{
	public Car(String vehicleNumber) {
		super(vehicleNumber, "Car",  1500);
	}
	public double calculateRentalCost(int days) {
		return days*rentalRate;
	}
	public double calculateInsurance() {
		return 500;
	}
	public String getInsuranceDetails() {
		return "Car Insurance";
	}
}
class Bus extends Vehicle implements Insurable{
	public Bus(String vehicleNumber) {
		super(vehicleNumber, "Bus", 3000);
	}
	public double calculateRentalCost(int days) {
		return days*rentalRate;
	}
	public double calculateInsurance() {
		return 1500;
	}
	public String getInsuranceDetails() {
		return "Bus Insurance";
	}
}
class Truck extends Vehicle implements Insurable{
	public Truck(String vehicleNumber) {
		super(vehicleNumber, "Truck", 4000);
	}
	public double calculateRentalCost(int days) {
		return days*rentalRate;
	}
	public double calculateInsurance() {
		return 2500;
	}
	public String getInsuranceDetails() {
		return "Bus Insurance";
	}
}
public class VehicleRentalSystem {
	public static void main(String[] args) {
		List<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(new Car("CAR124"));
		vehicles.add(new Bus("BUS789"));
		vehicles.add(new Truck("TRUCK145"));
		for(Vehicle v : vehicles) {
			 System.out.println("Vehicle No: " + v.getVehicleNumber());
	            System.out.println("Type: " + v.getType());
	            System.out.println("Rental Cost (3 days): " + v.calculateRentalCost(3));

	            Insurable i = (Insurable) v;
	            System.out.println("Insurance: " + i.calculateInsurance());
		}		
	}
}
