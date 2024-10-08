package com.example.attendancemanagement;

import java.io.*;
import java.sql.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import javax.xml.transform.Result;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance", "root", "aloha13");

            // Authenticate user and fetch user type in a single query
            pst = conn.prepareStatement("SELECT Usertype FROM Users WHERE username=? AND password=?");
            pst.setString(1, username);
            pst.setString(2, password);
            rs = pst.executeQuery();

            if (rs.next()) {
                String userType = rs.getString("Usertype");
                session.setAttribute("username", username);
                session.setAttribute("userType", userType);

                switch (userType.toUpperCase()) {
                    case "ADMIN":
                        response.sendRedirect(request.getContextPath() + "/admin.jsp");
                        break;
                    case "STUDENT":
                        response.sendRedirect(request.getContextPath() + "/student.jsp");
                        break;
                    case "FACULTY":
                        response.sendRedirect(request.getContextPath() + "/faculty.jsp");
                        break;
                    default:
                        response.sendRedirect(request.getContextPath() + "/error.jsp");
                        break;
                }
            } else {
                // Authentication failed
                request.setAttribute("errorMessage", "Invalid username or password");
                request.getRequestDispatcher("/login.jsp").forward(request, response);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "An error occurred during login");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        } finally {
            // Close resources
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect(request.getContextPath() + "/index.jsp");
    }
}