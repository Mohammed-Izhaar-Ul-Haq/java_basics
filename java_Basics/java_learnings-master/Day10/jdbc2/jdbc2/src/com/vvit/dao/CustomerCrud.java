package com.vvit.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vvit.dto.Customer;

public class CustomerCrud {

    static String url = "jdbc:mysql://localhost:3306/jdbc2";
    static String user = "root";
    static String password = "musavveer15";
    static Connection con;

    public int insertCustomer(Customer c) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("insert into customer values(?,?,?,?,?)");
            ps.setInt(1, c.getId());
            ps.setString(2, c.getName());
            ps.setString(3, c.getEmail());
            ps.setInt(4, c.getAge());
            ps.setLong(5, c.getPhone());
            return ps.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }
}
