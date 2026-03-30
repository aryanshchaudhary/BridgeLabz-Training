package ev_charging_station_management_system;

@SuppressWarnings("serial")
public class NoChargingSlotAvailableException extends Exception {
    public NoChargingSlotAvailableException(String msg) {
        super(msg);
    }
}
