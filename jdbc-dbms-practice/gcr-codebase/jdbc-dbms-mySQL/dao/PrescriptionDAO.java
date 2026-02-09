package dao;

import util.DBConnection;
import java.sql.*;

public class PrescriptionDAO {

    public void addPrescriptions(int visitId,
                                 String[] medicines,
                                 String[] dosages,
                                 String[] durations) {

        String sql = "INSERT INTO prescriptions(visit_id,medicine_name,dosage,duration) VALUES(?,?,?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            for (int i = 0; i < medicines.length; i++) {
                ps.setInt(1, visitId);
                ps.setString(2, medicines[i]);
                ps.setString(3, dosages[i]);
                ps.setString(4, durations[i]);
                ps.addBatch();
            }

            ps.executeBatch();
            System.out.println("Prescriptions added.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
