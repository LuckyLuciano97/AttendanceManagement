package com.example.attendancemanagement;

import java.io.*;
import java.sql.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import javax.xml.transform.Result;

@WebServlet(name = "loginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    HttpSession session = request.getSession();
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String userType = request.getParameter("userType");

    boolean isAuthenticated = AuthenticateUser.authenticateUser(username, password, userType);

    if (isAuthenticated) {
        switch (userType){
            case "ADMIN":
                request.getRequestDispatcher("admin.jsp").forward(request,response);
                break;
            case "STUDENT":
                request.getRequestDispatcher("student.jsp").forward(request,response);
                break;
            case "FACULTY":
                request.getRequestDispatcher("faculty.jsp").forward(request,response);
                break;
        }
    } else {
        System.out.println("An error occured");
    }


    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

}