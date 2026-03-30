package smart_energy_consumption_monitor;

@SuppressWarnings("serial")
class InvalidEnergyReadingException extends Exception {
    public InvalidEnergyReadingException(String message) {
        super(message);
    }
}
