package model;

public class Visit {

    private int visitId;
    private int appointmentId;
    private String diagnosis;
    private String notes;

    public Visit(int appointmentId, String diagnosis, String notes) {
        this.appointmentId = appointmentId;
        this.diagnosis = diagnosis;
        this.notes = notes;
    }

    public int getVisitId() { return visitId; }
    public int getAppointmentId() { return appointmentId; }
    public String getDiagnosis() { return diagnosis; }
    public String getNotes() { return notes; }
}
