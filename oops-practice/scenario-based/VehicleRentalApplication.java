// Vehicle Rental Application (CRUD)
//● Concepts: Vehicle, Bike, Car, Truck, Customer.
//● Access Modifiers: protected fields.
//● Interface: IRentable with CalculateRent(int days)

package week_3;
import java.util.*;
interface IRentable{
	double calculateRent(int days);
}

abstract class Vehicle implements IRentable{
	protected int id;
	protected String brand;
	protected double rate;
	
	public Vehicle(int id, String brand, double rate) {
		this.id = id;
		this.brand = brand;
		this.rate = rate;
	}
	public int getId() {
		return id;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	abstract void display();
}
class Bike extends Vehicle {
    public Bike(int id, String brand, double rate) {
        super(id, brand, rate);
    }

    public double calculateRent(int days) {
        return days * rate;
    }

    void display() {
        System.out.println("Bike | ID: " + id + " Brand: " + brand);
    }
}
class Car extends Vehicle {
    public Car(int id, String brand, double rate) {
        super(id, brand, rate);
    }

    public double calculateRent(int days) {
        return days * rate;
    }

    void display() {
        System.out.println("Car | ID: " + id + " Brand: " + brand);
    }
}
public class VehicleRentalApplication {
	static List<Vehicle> vehicles = new ArrayList<>();

    static void addVehicle(Vehicle v) {
        vehicles.add(v);
    }
    static void viewVehicles() {
        for (Vehicle v : vehicles)
            v.display();
    }
    static void updateRate(int id, double newRate) {
        for (Vehicle v : vehicles) {
            if (v.getId() == id) {
                v.setRate(newRate);
                System.out.println("Rate updated");
                return;
            }
        }
    }
    static void deleteVehicle(int id) {
        vehicles.removeIf(v -> v.getId() == id);
        System.out.println("Vehicle removed");
    }
	public static void main(String[] args) {
		addVehicle(new Bike(1, "Yamaha", 500));
        addVehicle(new Car(2, "Honda", 2000));

        viewVehicles();
        updateRate(1, 600);
        deleteVehicle(2);
        viewVehicles();
	}
}
