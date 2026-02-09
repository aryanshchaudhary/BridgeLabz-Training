package dao;

import util.DBConnection;
import model.Patient;
import java.sql.*;

public class PatientDAO {

    public void registerPatient(Patient patient) {
        String sql = "INSERT INTO patients(name,dob,phone,email,address,blood_group) VALUES(?,?,?,?,?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, patient.getName());
            ps.setDate(2, Date.valueOf(patient.getDob()));
            ps.setString(3, patient.getPhone());
            ps.setString(4, patient.getEmail());
            ps.setString(5, patient.getAddress());
            ps.setString(6, patient.getBloodGroup());

            ps.executeUpdate();
            System.out.println("Patient registered successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void searchPatientByName(String name) {
        String sql = "SELECT * FROM patients WHERE name LIKE ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, "%" + name + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt("patient_id") + " - "
                        + rs.getString("name") + " - "
                        + rs.getString("phone"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

