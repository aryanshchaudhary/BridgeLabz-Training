package smart_water_tank_monitoring_system;

@SuppressWarnings("serial")
public class InvalidWaterLevelException extends Exception {

    public InvalidWaterLevelException(String message) {
        super(message);
    }
}
