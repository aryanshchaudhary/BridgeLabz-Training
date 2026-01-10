//Hospital Patient Management System (CRUD)
//● Concepts: Patient, Doctor, Bill classes.
//● OOP: Encapsulation (Properties), Abstraction (Interface IPayable), Inheritance
//(InPatient, OutPatient : Patient), Polymorphism (DisplayInfo).

package week_3;
import java.util.*;
interface IPayable {
	double calculateBill();
}

abstract class Patient {
	private int patientId;
	private String name;
	private int age;

	public Patient(int patientId, String name, int age) {
		this.patientId = patientId;
		this.name = name;
		this.age = age;
	}

	public int getPatientId() {
		return patientId;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	abstract void displayInfo();
}

class InPatient extends Patient implements IPayable {
	private int days;
	private double dailyCharge;

	public InPatient(int id, String name, int age, int days, double dailyCharge) {
		super(id, name, age);
		this.days = days;
		this.dailyCharge = dailyCharge;
	}

	public double calculateBill() {
		return days * dailyCharge;
	}

	public void displayInfo() {
		System.out
				.println("In-Patient | ID: " + getPatientId() + " Name: " + getName() + " Bill: Rs." + calculateBill());
	}
}

class OutPatient extends Patient implements IPayable {
	private double consultationFee;

	public OutPatient(int id, String name, int age, double fee) {
		super(id, name, age);
		this.consultationFee = fee;
	}

	public double calculateBill() {
		return consultationFee;
	}

	public void displayInfo() {
		System.out
				.println("Out-Patient | ID: " + getPatientId() + " Name: " + getName() + " Bill: ₹" + calculateBill());
	}
}

public class HospitalManagementSystem {
	static List<Patient> patients = new ArrayList<>();

	static void addPatient(Patient p) {
		patients.add(p);
	}

	static void viewPatients() {
		for (Patient p : patients)
			p.displayInfo();
	}

	static void updatePatientAge(int id, int newAge) {
		for (Patient p : patients) {
			if (p.getPatientId() == id) {
				p.setAge(newAge);
				System.out.println("Patient age updated");
				return;
			}
		}
	}

	static void deletePatient(int id) {
		patients.removeIf(p -> p.getPatientId() == id);
		System.out.println("Patient deleted");
	}

	public static void main(String[] args) {
		addPatient(new InPatient(1, "Ravi", 40, 4, 1500));
		addPatient(new OutPatient(2, "Neha", 28, 500));

		viewPatients();
		updatePatientAge(1, 41);
		deletePatient(2);
		viewPatients();
	}
}
