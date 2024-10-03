<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Attendance Management System</title>
</head>
<body>
<h1>Attendance Management System</h1>
<br/>
<h3>${error}</h3>
<form method="post" action="/login">
    <label for="username">Username</label>
    <input name="username" type="text" id="username">

    <label for="password">Password</label>
    <input name="password" type="password" id="password">

    <label for="userType">Account Type</label>
    <select name="userType" id="userType">
        <option value="STUDENT">STUDENT</option>
        <option value="FACULTY">FACULTY</option>
        <option value="ADMIN">ADMIN</option>
    </select>

    <button type="submit" value="login">Log in</button>

</form>
</body>
</html>