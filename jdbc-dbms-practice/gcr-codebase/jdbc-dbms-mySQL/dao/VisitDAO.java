package dao;

import util.DBConnection;
import java.sql.*;

public class VisitDAO {

    public void recordVisit(int appointmentId,
                            String diagnosis,
                            String notes) {

        String insertVisit = "INSERT INTO visits(appointment_id,diagnosis,notes) VALUES(?,?,?)";
        String updateAppointment = "UPDATE appointments SET status='COMPLETED' WHERE appointment_id=?";

        try (Connection con = DBConnection.getConnection()) {

            con.setAutoCommit(false);

            PreparedStatement ps1 = con.prepareStatement(insertVisit);
            ps1.setInt(1, appointmentId);
            ps1.setString(2, diagnosis);
            ps1.setString(3, notes);
            ps1.executeUpdate();

            PreparedStatement ps2 = con.prepareStatement(updateAppointment);
            ps2.setInt(1, appointmentId);
            ps2.executeUpdate();

            con.commit();
            System.out.println("Visit recorded.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
