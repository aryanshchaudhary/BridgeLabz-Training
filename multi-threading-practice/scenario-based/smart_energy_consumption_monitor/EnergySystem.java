package smart_energy_consumption_monitor;
public class EnergySystem {

    public static void main(String[] args) {

        EnergyMonitor monitor = new EnergyMonitor();

        try {

            monitor.addReading("2026-02-01", 5.5);
            monitor.addReading("2026-02-01", 6.0);
            monitor.addReading("2026-02-02", 4.5);
            monitor.addReading("2026-02-02", 5.0);

            monitor.addReading("2026-02-03", -3.0);

        } catch (InvalidEnergyReadingException e) {
            System.out.println("Error: " + e.getMessage());
        }

        double avg1 = monitor.calculateDailyAverage("2026-02-01");
        System.out.println("Daily Average (2026-02-01): " + avg1);

        double monthlyAvg = monitor.calculateMonthlyAverage();
        System.out.println("Monthly Average: " + monthlyAvg);
    }
}
