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
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script>
        $(document).ready(function() {
            $("#displayButton").click(function() {
                $.get("retrieve", function(data) {
                    $("#userTable").html(data);
                });
            });
        });
    </script>
</head>
<body>
<h1>Welcome Admin</h1>
<br>
<button id="displayButton">Display Users</button>

<div id="userTable">
    <!-- The table will be inserted here -->
</div>
</body>
</html>

</body>
</html>
