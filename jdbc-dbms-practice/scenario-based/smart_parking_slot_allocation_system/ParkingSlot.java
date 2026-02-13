package smart_parking_slot_allocation_system;
public class ParkingSlot {

    private int slotId;
    private String slotType; 
    private boolean isOccupied;
    @SuppressWarnings("unused")
	private Vehicle vehicle;

    public ParkingSlot(int slotId, String slotType) {
        this.slotId = slotId;
        this.slotType = slotType;
        this.isOccupied = false;
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isOccupied = true;
    }

    public void removeVehicle() {
        this.vehicle = null;
        this.isOccupied = false;
    }

    public int getSlotId() {
        return slotId;
    }

    public String getSlotType() {
        return slotType;
    }
}
