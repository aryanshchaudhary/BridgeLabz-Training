package inheritance;
public class VehicleTransportSystem {
	public static void main(String[] args) {
		Vehicle1 vehicle = new Vehicle1("Vehicle", 120, "Diesel");
		Truck truck = new Truck("Truck", 100, "Diesel", 20);
		Car car = new Car("Car", 80, "CNG", 7);
		Bike bike = new Bike("Bike", 120, "Petrol", 200);

		vehicle.displayInfo();
		truck.displayInfo();
		car.displayInfo();
		bike.displayInfo();
	}
}
class Vehicle1 {
	String name;
	double maxSpeed;
	String fuelType;
	Vehicle1(String name, double maxSpeed, String fuelType) {
		this.name = name;
		this.fuelType = fuelType;
		this.maxSpeed = maxSpeed;
	}
	void displayInfo() {
		System.out.println('\n' + "Name: " + name);
		System.out.println("Max Speed: " + maxSpeed + "kmph");
		System.out.println("Fuel Type: " + fuelType);
	}
}
class Truck extends Vehicle1 {
	int wheelCount;
	Truck(String name, double maxSpeed, String fuelType, int wheelCount) {
		super(name, maxSpeed, fuelType);
		this.wheelCount = wheelCount;
	}
	void displayInfo() {
		super.displayInfo();
		System.out.println("Wheel Count: " + wheelCount);
	}
}
class Car extends Vehicle1 {
	int seatCapacity;
	Car(String name, double maxSpeed, String fuelType, int seatCapacity) {
		super(name, maxSpeed, fuelType);
		this.seatCapacity = seatCapacity;
	}
	void displayInfo() {
		super.displayInfo();
		System.out.println("Seat Capacity: " + seatCapacity);
	}
}
class Bike extends Vehicle1 {
	int engineCC;
	Bike(String name, double maxSpeed, String fuelType, int engineCC) {
		super(name, maxSpeed, fuelType);
		this.engineCC = engineCC;
	}
	void displayInfo() {
		super.displayInfo();
		System.out.println("Engine: " + engineCC + "cc");
	}
}