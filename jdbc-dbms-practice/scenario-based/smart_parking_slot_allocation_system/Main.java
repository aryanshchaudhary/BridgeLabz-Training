package smart_parking_slot_allocation_system;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        List<ParkingSlot> slots = new ArrayList<>();
        slots.add(new ParkingSlot(1, "CAR"));
        slots.add(new ParkingSlot(2, "CAR"));
        slots.add(new ParkingSlot(3, "BIKE"));

        ParkingManager manager = new ParkingManager(slots);

        Vehicle car1 = new Car("HR26AB1234", "Rahul");
        Vehicle bike1 = new Bike("DL12XY7890", "Aman");

        try {
            manager.allocateSlot(car1);
            manager.allocateSlot(bike1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
