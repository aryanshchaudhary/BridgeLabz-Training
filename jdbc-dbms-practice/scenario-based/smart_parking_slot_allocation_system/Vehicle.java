package smart_parking_slot_allocation_system;
public abstract class Vehicle {
    private String vehicleNumber;
    @SuppressWarnings("unused")
	private String ownerName;

    public Vehicle(String vehicleNumber, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public abstract String getType(); // Car or Bike
}
