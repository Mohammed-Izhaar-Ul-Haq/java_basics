package com.vvit.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteStudent {
    public static void main(String[] args) {
        String query = "delete from student where id=2";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_simple", "root", "musavveer15");
            Statement s = c.createStatement();
            s.execute(query);
            c.close();
            System.out.println("deleted");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
