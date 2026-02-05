package stream_API;
import java.util.*;
class Doctor{
	String name;
	String specialization;
	boolean availableOnWeekend;
	
	Doctor(String name, String specialization, boolean availableOnWeekend) {
		this.name = name;
		this.specialization = specialization;
		this.availableOnWeekend = availableOnWeekend;
	}
}

public class DoctorAvailability {
	public static void main(String[] args) {
		List<Doctor> doctors = Arrays.asList(new Doctor("Dr. Smith", "Cardiology", true),
				new Doctor("Dr. Johnson", "Neurology", false), new Doctor("Dr. Lee", "Pediatrics", true),
				new Doctor("Dr. Brown", "Orthopedics", false));
		
		doctors.stream().filter(d -> d.availableOnWeekend).sorted((d1, d2) -> d1.name.compareTo(d2.name))
				.forEach(d -> System.out.println(d.name + " - " + d.specialization));
	}
}
