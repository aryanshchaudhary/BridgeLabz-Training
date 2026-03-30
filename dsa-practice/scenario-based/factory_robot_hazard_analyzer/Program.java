package factory_robot_hazard_analyzer;
import java.util.*;
public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Arm Precision (0.0 - 1.0):");
		double armPrecision = sc.nextDouble();
		System.out.println("Enter Worker Density (1 - 20):");
		int workerDensity = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Machinery State (Worn/Faulty/Critical):");
		String machineryState = sc.nextLine();
		
		try {
			RobotHazardAuditor robo = new RobotHazardAuditor();
			System.out.println("Robot Hazard Risk Score: " + robo.CalculateHazardRisk(armPrecision, workerDensity, machineryState));
		}catch(RobotSafetyException e) {
			System.err.println(e.getMessage());
		}
		sc.close();
	}
}
