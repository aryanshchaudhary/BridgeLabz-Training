package dao;

import util.DBConnection;
import java.sql.*;

public class AppointmentDAO {

    public void bookAppointment(int patientId, int doctorId,
                                String date, String time) {

        String checkSql = "SELECT COUNT(*) FROM appointments WHERE doctor_id=? AND appointment_date=? AND appointment_time=?";
        String insertSql = "INSERT INTO appointments(patient_id,doctor_id,appointment_date,appointment_time,status) VALUES(?,?,?,?, 'SCHEDULED')";

        try (Connection con = DBConnection.getConnection()) {

            con.setAutoCommit(false);

            PreparedStatement check = con.prepareStatement(checkSql);
            check.setInt(1, doctorId);
            check.setDate(2, Date.valueOf(date));
            check.setTime(3, Time.valueOf(time));
            ResultSet rs = check.executeQuery();
            rs.next();

            if (rs.getInt(1) > 0) {
                System.out.println("Slot already booked.");
                con.rollback();
                return;
            }

            PreparedStatement insert = con.prepareStatement(insertSql);
            insert.setInt(1, patientId);
            insert.setInt(2, doctorId);
            insert.setDate(3, Date.valueOf(date));
            insert.setTime(4, Time.valueOf(time));
            insert.executeUpdate();

            con.commit();
            System.out.println("Appointment booked.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cancelAppointment(int appointmentId) {
        String sql = "UPDATE appointments SET status='CANCELLED' WHERE appointment_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, appointmentId);
            ps.executeUpdate();
            System.out.println("Appointment cancelled.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
