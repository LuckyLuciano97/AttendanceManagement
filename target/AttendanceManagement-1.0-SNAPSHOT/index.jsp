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
<form method="post" action="${pageContext.request.contextPath}/login">
    <label for="username">Username</label>
    <input name="username" type="text" id="username">

    <label for="password">Password</label>
    <input name="password" type="password" id="password">


    <button type="submit" value="login">Log in</button>

</form>
</body>
</html>