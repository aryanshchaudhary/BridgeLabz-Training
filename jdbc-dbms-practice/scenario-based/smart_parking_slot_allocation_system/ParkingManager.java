package smart_parking_slot_allocation_system;
import java.util.*;

public class ParkingManager {

    private Map<Integer, ParkingSlot> parkingSlots = new HashMap<>();
    private Queue<Vehicle> waitingQueue = new LinkedList<>();

    public ParkingManager(List<ParkingSlot> slots) {
        for (ParkingSlot slot : slots) {
            parkingSlots.put(slot.getSlotId(), slot);
        }
    }

    public void allocateSlot(Vehicle vehicle) throws NoParkingSlotAvailableException {

        for (int id : new TreeSet<>(parkingSlots.keySet())) { 
            ParkingSlot slot = parkingSlots.get(id);

            if (slot.isAvailable() &&
                slot.getSlotType().equals(vehicle.getType())) {

                slot.parkVehicle(vehicle);
                System.out.println("Vehicle parked in slot: " + id);
                return;
            }
        }

        waitingQueue.add(vehicle);
        throw new NoParkingSlotAvailableException("No slot available. Added to waiting queue.");
    }

    public void freeSlot(int slotId) {
        ParkingSlot slot = parkingSlots.get(slotId);

        if (slot != null && !slot.isAvailable()) {
            slot.removeVehicle();
            System.out.println("Slot " + slotId + " is now free.");

            if (!waitingQueue.isEmpty()) {
                Vehicle nextVehicle = waitingQueue.poll();
                try {
                    allocateSlot(nextVehicle);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
