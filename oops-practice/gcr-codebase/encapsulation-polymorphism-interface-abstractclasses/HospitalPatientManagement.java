package encapsulation_polymorphism;

import java.util.*;

interface MedicalRecord {
	void addRecord(String record);

	void viewRecords();
}

abstract class Patient {
	private int patientId;
	private String name;
	protected int age;
	private String diagnosis;

	public Patient(int patientId, String name, int age) {
		this.patientId = patientId;
		this.name = name;
		this.age = age;
	}

	public abstract double calculateBill();

	public void getPatientDetails() {
		System.out.println("Patient ID: " + patientId + "Name: ");
	}

	protected void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	protected String getDiagnosis() {
		return diagnosis;
	}
}

class InPatient extends Patient implements MedicalRecord {
	private int daysAdmitted;
	private String medicalHistory;

	public InPatient(int id, String name, int age, int daysAdmitted) {
		super(id, name, age);
		this.daysAdmitted = daysAdmitted;
	}

	public double calculateBill() {
		return daysAdmitted * 3000;
	}

	public void addRecord(String record) {
		medicalHistory = record;
		setDiagnosis(record);
	}

	public void viewRecords() {
		System.out.println("Medical Record: " + medicalHistory);
	}
}

class OutPatient extends Patient implements MedicalRecord {

	private double consultationFee;
	private String medicalHistory;

	public OutPatient(int id, String name, int age, double consultationFee) {
		super(id, name, age);
		this.consultationFee = consultationFee;
	}

	public double calculateBill() {
		return consultationFee;
	}

	public void addRecord(String record) {
		medicalHistory = record;
		setDiagnosis(record);
	}

	public void viewRecords() {
		System.out.println("Medical Record: " + medicalHistory);
	}
}

public class HospitalPatientManagement {
	public static void main(String[] args) {
		Patient[] patients = new Patient[2];

		patients[0] = new InPatient(1, "Rahul", 30, 5);
		patients[1] = new OutPatient(2, "Anita", 25, 800);

		for (Patient p : patients) {
			p.getPatientDetails();
			System.out.println("Bill Amount: " + p.calculateBill());

			MedicalRecord record = (MedicalRecord) p;
			record.addRecord("General Checkup");
			record.viewRecords();
		}
	}
}
