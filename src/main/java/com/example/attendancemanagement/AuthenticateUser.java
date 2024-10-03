package com.example.attendancemanagement;

import java.sql.*;
public class AuthenticateUser {

    public static boolean authenticateUser(String username, String password, String userType) {
    try

        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance", "root", "aloha13");
            PreparedStatement pst = conn.prepareStatement("Select username,password from " + userType + " where username=? and password=?");
            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }

        } catch(ClassNotFoundException |
        SQLException e)

        {
            e.printStackTrace();
        }
        return false;
    }
}