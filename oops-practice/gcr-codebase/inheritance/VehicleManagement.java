package inheritance;
public class VehicleManagement {
	public static void main(String[] args) {
		ElectricVehicle ev = new ElectricVehicle();
		PetrolVehicle pv = new PetrolVehicle();

		ev.charge();
		pv.refuel();
	}
}
interface Refuelable {
	void refuel();
}
class Vehicle {
	String model;
}
class ElectricVehicle extends Vehicle {
	void charge() {
		System.out.println("Charging electric vehicle");
	}
}
class PetrolVehicle extends Vehicle implements Refuelable {
	public void refuel() {
		System.out.println("Refueling petrol vehicle");
	}
}