package model;

public class Specialty {

    private int specialtyId;
    private String specialtyName;
    private String description;

    public Specialty(String specialtyName, String description) {
        this.specialtyName = specialtyName;
        this.description = description;
    }

    public int getSpecialtyId() { return specialtyId; }
    public String getSpecialtyName() { return specialtyName; }
    public String getDescription() { return description; }
}
