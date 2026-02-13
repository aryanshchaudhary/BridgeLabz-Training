package smart_parking_slot_allocation_system;
public class Car extends Vehicle {

    public Car(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
    }

    @Override
    public String getType() {
        return "CAR";
    }
}
