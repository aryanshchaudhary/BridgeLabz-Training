package dao;

import util.DBConnection;
import model.PaymentTransaction;
import java.sql.*;

public class PaymentTransactionDAO {

    public void addTransaction(PaymentTransaction transaction) {

        String sql = "INSERT INTO payment_transactions(bill_id, payment_mode, amount) VALUES(?,?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, transaction.getBillId());
            ps.setString(2, transaction.getPaymentMode());
            ps.setDouble(3, transaction.getAmount());

            ps.executeUpdate();
            System.out.println("Payment transaction inserted.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewTransactionsByBill(int billId) {

        String sql = "SELECT * FROM payment_transactions WHERE bill_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, billId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                        "Transaction ID: " + rs.getInt("transaction_id")
                        + " | Mode: " + rs.getString("payment_mode")
                        + " | Amount: " + rs.getDouble("amount")
                        + " | Date: " + rs.getTimestamp("transaction_date")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
