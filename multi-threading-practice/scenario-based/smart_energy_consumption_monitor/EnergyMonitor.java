package smart_energy_consumption_monitor;
import java.util.*;

class EnergyMonitor {

    private Map<String, List<Double>> energyData;

    public EnergyMonitor() {
        energyData = new HashMap<>();
    }

    public void addReading(String date, double reading)
            throws InvalidEnergyReadingException {

        if (reading < 0) {
            throw new InvalidEnergyReadingException(
                "Energy reading cannot be negative");
        }

        energyData.putIfAbsent(date, new ArrayList<>());
        energyData.get(date).add(reading);
    }

    public double calculateDailyAverage(String date) {
        List<Double> readings = energyData.get(date);
        if (readings == null) return 0;

        double sum = 0;
        for (double r : readings) {
            sum += r;
        }

        return sum / readings.size();
    }

    public double calculateMonthlyAverage() {
        double total = 0;
        int count = 0;

        for (List<Double> readings : energyData.values()) {
            for (double r : readings) {
                total += r;
                count++;
            }
        }

        return count == 0 ? 0 : total / count;
    }
}
