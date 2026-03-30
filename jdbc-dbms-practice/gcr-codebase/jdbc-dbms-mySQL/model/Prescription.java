package model;

public class Prescription {

    private int prescriptionId;
    private int visitId;
    private String medicineName;
    private String dosage;
    private String duration;

    public Prescription(int visitId, String medicineName,
                        String dosage, String duration) {
        this.visitId = visitId;
        this.medicineName = medicineName;
        this.dosage = dosage;
        this.duration = duration;
    }

    public int getPrescriptionId() { return prescriptionId; }
    public int getVisitId() { return visitId; }
    public String getMedicineName() { return medicineName; }
    public String getDosage() { return dosage; }
    public String getDuration() { return duration; }
}
