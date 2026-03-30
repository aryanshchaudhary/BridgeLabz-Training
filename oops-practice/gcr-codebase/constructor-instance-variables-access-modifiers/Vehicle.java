package level_1;
public class Vehicle {
	String ownerName;
	String vehicleType;
	static double registrationFee = 4500;
	Vehicle(String o, String v){
		ownerName = o;
		vehicleType = v;
	}
	void displayVehicleDetails() {
		System.out.println(ownerName + " " + vehicleType + " Fee:" + registrationFee);
	}
	static void updateRegistrationFee(double fee) {
		registrationFee = fee;
		System.out.println("Updated Registration Fee: " + registrationFee);
	}
	public static void main(String[] args) {
		Vehicle v = new Vehicle("Hulk", "SUV");
		v.displayVehicleDetails();
		Vehicle.updateRegistrationFee(5000);
	}
}
