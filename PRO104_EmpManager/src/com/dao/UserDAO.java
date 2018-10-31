package com.dao;

import com.helper.JdbcHelper;
import com.model.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    public void insert(User model) {
        String sql = "INSERT INTO User (MaNV, MatKhau, HoTen, VaiTro) VALUES (?, ?, ?, ?)";
        JdbcHelper.executeUpdate(sql,
                model.getMaNV(),
                model.getMatKhau(),
                model.getHoTen(),
                model.isVaiTro());
    }

    public void update(User model) {
        String sql = "UPDATE User SET MatKhau=?, HoTen=?, VaiTro=? WHERE MaNV=?";
        JdbcHelper.executeUpdate(sql,
                model.getMatKhau(),
                model.getHoTen(),
                model.isVaiTro(),
                model.getMaNV());
    }

    public void delete(String MaNV) {
        String sql = "DELETE FROM User WHERE MaNV=?";
        JdbcHelper.executeUpdate(sql, MaNV);
    }

    public List<User> select() {
        String sql = "SELECT * FROM User";
        return select(sql);
    }

    public User findById(String manv) {
        String sql = "SELECT * FROM User WHERE MaNV=?";
        List<User> list = select(sql, manv);
        return list.size() > 0 ? list.get(0) : null;
    }

    private List<User> select(String sql, Object... args) {
        List<User> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    User model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    private User readFromResultSet(ResultSet rs) throws SQLException {
        User model = new User();
        model.setMaNV(rs.getString("MaNV"));
        model.setMatKhau(rs.getString("MatKhau"));
        model.setHoTen(rs.getString("HoTen"));
        model.setVaiTro(rs.getBoolean("VaiTro"));
        return model;
    }
}
