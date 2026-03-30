package smart_water_tank_monitoring_system;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args)
            throws InvalidWaterLevelException {

        List<WaterTank> tanks = new ArrayList<>();

        tanks.add(new WaterTank("T1", 1000, 150));
        tanks.add(new WaterTank("T2", 1000, 800));
        tanks.add(new WaterTank("T3", 1000, 100));
        tanks.add(new WaterTank("T4", 1000, 500));

        tanks.sort(Comparator.comparingDouble(
                WaterTank::getCurrentLevel));

        System.out.println("Sorted Tanks (Lowest First):");

        for (WaterTank tank : tanks) {
            System.out.println(tank);

            if (tank.isBelowThreshold()) {
                System.out.println("⚠ ALERT: Tank "
                        + tank.getTankId()
                        + " below 20%");
            }
        }
    }
}
