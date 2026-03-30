package aero_vigil;

public class FlightUtil {
	public boolean validateFlightNumber(String flightNumber) throws InvalidFlightException{
		if(flightNumber == null || !flightNumber.matches("FL-[1-9][0-9]{3}")) {
			throw new InvalidFlightException(
					"The flight number " + flightNumber + " is invalid");
		}
		return true;
	}
	
	public boolean validateFlightName(String flightName) throws InvalidFlightException{
		if(flightName == null || !flightName.equalsIgnoreCase("SpiceJet") 
				&& !flightName.equalsIgnoreCase("Vistara") && !flightName.equalsIgnoreCase("IndiGo")
				&& !flightName.equalsIgnoreCase("Air Arabia")) {
			throw new InvalidFlightException(
				"The flight name " + flightName + " is invalid");
		}
		return true;
	}
	
	public boolean validatePassengerCount(int passengerCount, String flightName) throws InvalidFlightException{
		int maxCapacity;
		
		switch(flightName.toLowerCase()) {
		case "spicejet": maxCapacity = 396;
		break;
		case "vistara" : maxCapacity = 615;
		break;
		case "indigo" : maxCapacity = 230;
		break;
		case "air arabio" : maxCapacity = 130;
		break;
		default:
			throw new InvalidFlightException(
					"The flight name " + flightName + " is invalid" );
		}
		
		if(passengerCount <= 0 || passengerCount > maxCapacity) {
			throw new InvalidFlightException(
					"The passenger count " + passengerCount +
	                " is invalid for " + flightName);
		}
		return true;
	}
	
	public double calculateFuelToFillTank(String flightName, double currentFuelLevel) throws InvalidFlightException{
		double maxFuelCapacity;
		switch(flightName.toLowerCase()) {
		case "spicejet": maxFuelCapacity = 200000;
		break;
		case "vistara" : maxFuelCapacity = 300000;
		break;
		case "indigo" : maxFuelCapacity = 250000;
		break;
		case "air arabio" : maxFuelCapacity = 150000;
		break;
		default:
			throw new InvalidFlightException(
					"Invalid fuel level for " + flightName);
		}
		if(currentFuelLevel < 0 || currentFuelLevel > maxFuelCapacity) {
			throw new InvalidFlightException(
					"Invalid fuel level for " + flightName);
		}
		return maxFuelCapacity - currentFuelLevel;
	}
}
