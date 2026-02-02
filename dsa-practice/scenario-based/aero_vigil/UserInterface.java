package aero_vigil;
import java.util.*;
public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FlightUtil ft = new FlightUtil();
		
		try {
			System.out.println("Enter flight details");
			String input = sc.nextLine();
			
			String[] details = input.split(":");
			
			String flightNumber = details[0];
			String flightName = details[1];
			int passengerCount = Integer.parseInt(details[2]);
			double currentFuelLevel = Double.parseDouble(details[3]);
			
			ft.validateFlightNumber(flightNumber);
			ft.validateFlightName(flightName);
			ft.validatePassengerCount(passengerCount, flightName);
			
			double fuelRequired = ft.calculateFuelToFillTank(flightName, currentFuelLevel);
			
			System.out.println("Fuel required to fill the tank: " + fuelRequired + " litres");
		}catch(InvalidFlightException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
