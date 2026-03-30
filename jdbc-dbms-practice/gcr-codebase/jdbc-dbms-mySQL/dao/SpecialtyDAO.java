package dao;

import util.DBConnection;
import java.sql.*;

public class SpecialtyDAO {

    public void addSpecialty(String name, String description) {

        String sql = "INSERT INTO specialties(specialty_name,description) VALUES(?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setString(2, description);
            ps.executeUpdate();

            System.out.println("Specialty added.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewSpecialties() {

        String sql = "SELECT * FROM specialties";

        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement()) {

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getInt("specialty_id")
                        + " - " + rs.getString("specialty_name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
