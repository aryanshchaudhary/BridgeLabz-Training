package dao;

import util.DBConnection;
import java.sql.*;

public class BillingDAO {

    public void generateBill(int visitId, double amount) {

        String sql = "INSERT INTO bills(visit_id,total_amount) VALUES(?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, visitId);
            ps.setDouble(2, amount);
            ps.executeUpdate();

            System.out.println("Bill generated.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void recordPayment(int billId,
                              String mode,
                              double amount) {

        String updateBill = "UPDATE bills SET payment_status='PAID', payment_date=CURDATE() WHERE bill_id=?";
        String insertTxn = "INSERT INTO payment_transactions(bill_id,payment_mode,amount) VALUES(?,?,?)";

        try (Connection con = DBConnection.getConnection()) {

            con.setAutoCommit(false);

            PreparedStatement ps1 = con.prepareStatement(updateBill);
            ps1.setInt(1, billId);
            ps1.executeUpdate();

            PreparedStatement ps2 = con.prepareStatement(insertTxn);
            ps2.setInt(1, billId);
            ps2.setString(2, mode);
            ps2.setDouble(3, amount);
            ps2.executeUpdate();

            con.commit();
            System.out.println("Payment recorded.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
