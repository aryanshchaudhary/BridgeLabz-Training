package smart_parking_slot_allocation_system;

@SuppressWarnings("serial")
public class NoParkingSlotAvailableException extends Exception {
    public NoParkingSlotAvailableException(String message) {
        super(message);
    }
}
