package com.example.attendancemanagement;

import java.io.*;
import java.sql.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "RetrieveUsersServlet", urlPatterns = "/retrieve")
public class RetrieveUsers extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Connection conn = null;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance", "root", "aloha13");
        PreparedStatement stmt = conn.prepareStatement("Select * FROM ADMIN");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {

            System.out.println(rs.getString("id") + rs.getString("username") + rs.getString("name"));



        }
        request.getRequestDispatcher("admin.jsp").forward(request, response);


    } catch (ClassNotFoundException e) {
        throw new RuntimeException(e);
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }

    }


}