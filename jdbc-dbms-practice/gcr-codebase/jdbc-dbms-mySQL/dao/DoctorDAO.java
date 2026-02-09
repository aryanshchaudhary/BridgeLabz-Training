package dao;

import util.DBConnection;
import java.sql.*;

public class DoctorDAO {

    public void addDoctor(String name, int specialtyId,
                          String contact, double fee) {

        String sql = "INSERT INTO doctors(name,specialty_id,contact,consultation_fee) VALUES(?,?,?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setInt(2, specialtyId);
            ps.setString(3, contact);
            ps.setDouble(4, fee);

            ps.executeUpdate();
            System.out.println("Doctor added.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deactivateDoctor(int doctorId) {
        String sql = "UPDATE doctors SET is_active=false WHERE doctor_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, doctorId);
            ps.executeUpdate();
            System.out.println("Doctor deactivated.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
