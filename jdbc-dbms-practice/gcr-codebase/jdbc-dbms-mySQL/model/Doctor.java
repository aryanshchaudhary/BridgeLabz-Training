package model;

public class Doctor {

    private int doctorId;
    private String name;
    private int specialtyId;
    private String contact;
    private double consultationFee;
    private boolean isActive;

    public Doctor(String name, int specialtyId, String contact, double consultationFee) {
        this.name = name;
        this.specialtyId = specialtyId;
        this.contact = contact;
        this.consultationFee = consultationFee;
        this.isActive = true;
    }

    public int getDoctorId() { return doctorId; }
    public String getName() { return name; }
    public int getSpecialtyId() { return specialtyId; }
    public String getContact() { return contact; }
    public double getConsultationFee() { return consultationFee; }
    public boolean isActive() { return isActive; }
}
