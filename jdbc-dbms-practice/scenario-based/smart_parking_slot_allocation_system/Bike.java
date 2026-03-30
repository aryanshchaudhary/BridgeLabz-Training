package smart_parking_slot_allocation_system;

public class Bike extends Vehicle{
	
	public Bike(String vehicleNumber, String ownerName) {
		super(vehicleNumber, ownerName);
	}
	
	@Override
	public String getType() {
		return "BIKE";
	}
}
