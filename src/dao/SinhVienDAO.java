package dao;

import java.util.ArrayList;
import java.util.List;
import model.SinhVien;
import java.sql.*;

/**
 *
 * @author ha
 */
public class SinhVienDAO {
    public List<SinhVien> getAll() {
        List<SinhVien> list = new ArrayList<>();
        String sql = "SELECT * FROM SinhVien";
        try (Connection conn = DBConnection.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new SinhVien(
                    rs.getString("maSV"),
                    rs.getString("hoTen"),
                    rs.getString("lop"),
                    rs.getDouble("gpa")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean insert(SinhVien sv) {
        String sql = "INSERT INTO SinhVien(maSV, hoTen, lop, gpa) VALUES(?,?,?,?)";
        try (Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, sv.getMaSV());
                ps.setString(2, sv.getHoTen());
                ps.setString(3, sv.getLop());
                ps.setDouble(4, sv.getGpa());
                return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean update(SinhVien sv) {
        String sql = "UPDATE SinhVien SET hoTen=?, lop=?, gpa=? WHERE maSV=?";
        try (Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, sv.getHoTen());
                ps.setString(2, sv.getLop());
                ps.setDouble(3, sv.getGpa());
                ps.setString(4, sv.getMaSV());
                return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(String maSV) {
        String sql = "DELETE FROM SinhVien WHERE maSV=?";
        try (Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, maSV);
                return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
