package com.vvit.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetStudentById {
    public static void main(String[] args) {
        String query = "select * from student where id=2";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_simple", "root", "musavveer15");
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery(query);
            if(rs.next()) {
                System.out.println("Student ID " + rs.getInt(1));
                System.out.println("Student Name " + rs.getString(2));
                System.out.println("Student Age " + rs.getInt(3));
            } else {
                System.out.println("No student found");
            }
            c.close();
            

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
