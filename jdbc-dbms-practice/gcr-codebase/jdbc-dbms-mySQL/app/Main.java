package app;
import dao.*;
import model.Patient;
import model.PaymentTransaction;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    private static PatientDAO patientDAO = new PatientDAO();
    private static DoctorDAO doctorDAO = new DoctorDAO();
    private static AppointmentDAO appointmentDAO = new AppointmentDAO();
    private static VisitDAO visitDAO = new VisitDAO();
    private static BillingDAO billingDAO = new BillingDAO();
    private static PaymentTransactionDAO transactionDAO = new PaymentTransactionDAO();

    public static void main(String[] args) {

        while (true) {

            System.out.println("\nHEALTH CLINIC MANAGEMENT SYSTEM");
            System.out.println("1. Register Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Book Appointment");
            System.out.println("4. Cancel Appointment");
            System.out.println("5. Record Visit");
            System.out.println("6. Generate Bill");
            System.out.println("7. Record Payment");
            System.out.println("8. Search Patient");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    registerPatient();
                    break;

                case 2:
                    addDoctor();
                    break;

                case 3:
                    bookAppointment();
                    break;

                case 4:
                    cancelAppointment();
                    break;

                case 5:
                    recordVisit();
                    break;

                case 6:
                    generateBill();
                    break;

                case 7:
                    recordPayment();
                    break;

                case 8:
                    searchPatient();
                    break;

                case 9:
                    System.out.println("Exiting system...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void registerPatient() {

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("DOB (yyyy-mm-dd): ");
        String dob = sc.nextLine();

        System.out.print("Phone: ");
        String phone = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Address: ");
        String address = sc.nextLine();

        System.out.print("Blood Group: ");
        String bg = sc.nextLine();

        Patient patient = new Patient(name, dob, phone, email, address, bg);
        patientDAO.registerPatient(patient);
    }

    private static void addDoctor() {

        System.out.print("Doctor Name: ");
        String name = sc.nextLine();

        System.out.print("Specialty ID: ");
        int specialtyId = sc.nextInt();

        sc.nextLine();
        System.out.print("Contact: ");
        String contact = sc.nextLine();

        System.out.print("Consultation Fee: ");
        double fee = sc.nextDouble();

        doctorDAO.addDoctor(name, specialtyId, contact, fee);
    }

    private static void bookAppointment() {

        System.out.print("Patient ID: ");
        int patientId = sc.nextInt();

        System.out.print("Doctor ID: ");
        int doctorId = sc.nextInt();

        sc.nextLine();
        System.out.print("Date (yyyy-mm-dd): ");
        String date = sc.nextLine();

        System.out.print("Time (HH:mm:ss): ");
        String time = sc.nextLine();

        appointmentDAO.bookAppointment(patientId, doctorId, date, time);
    }

    private static void cancelAppointment() {

        System.out.print("Appointment ID: ");
        int appointmentId = sc.nextInt();

        appointmentDAO.cancelAppointment(appointmentId);
    }

    private static void recordVisit() {

        System.out.print("Appointment ID: ");
        int appointmentId = sc.nextInt();

        sc.nextLine();
        System.out.print("Diagnosis: ");
        String diagnosis = sc.nextLine();

        System.out.print("Notes: ");
        String notes = sc.nextLine();

        visitDAO.recordVisit(appointmentId, diagnosis, notes);
    }

    private static void generateBill() {

        System.out.print("Visit ID: ");
        int visitId = sc.nextInt();

        System.out.print("Total Amount: ");
        double amount = sc.nextDouble();

        billingDAO.generateBill(visitId, amount);
    }

    private static void recordPayment() {

        System.out.print("Bill ID: ");
        int billId = sc.nextInt();

        sc.nextLine();
        System.out.print("Payment Mode: ");
        String mode = sc.nextLine();

        System.out.print("Amount: ");
        double amount = sc.nextDouble();

        billingDAO.recordPayment(billId, mode, amount);

        PaymentTransaction txn =
                new PaymentTransaction(billId, mode, amount);

        transactionDAO.addTransaction(txn);
    }

    private static void searchPatient() {

        System.out.print("Enter name to search: ");
        String name = sc.nextLine();

        patientDAO.searchPatientByName(name);
    }
}
