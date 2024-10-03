<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: Luka
  Date: 3/20/2024
  Time: 10:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin Page</title>
</head>
<h1>Welcome Admin</h1>
<br>


<%--User list with options to delete, edit, read data--%>
<%--Add another user dropdown--%>
<%--<%--%>
<%--    // Retrieve the ResultSet from the request attribute--%>
<%--    ResultSet rs = (ResultSet) request.getAttribute("resultSet");--%>
<%--%>--%>
<table>
    <tr>
        <th>ID</th>
        <th>Username</th>
        <th>Name</th>
        <th>Password</th>
    </tr>
<%--    <%--%>
<%--        // Iterate over the ResultSet and display the data--%>
<%--        while (rs.next()) {--%>
<%--    %>--%>
<%--    <tr>--%>
<%--        <td><%= rs.getInt("id") %></td>--%>
<%--        <td><%= rs.getString("username") %></td>--%>
<%--        <td><%= rs.getString("name") %></td>--%>
<%--        <td><%= rs.getString("password") %></td>--%>
<%--    </tr>--%>
<%--    <%--%>
<%--        }--%>
<%--    %>--%>
</table>
<body>

</body>
</html>
