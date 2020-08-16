<%--
  Created by IntelliJ IDEA.
  User: shahin_yzd
  Date: 8/15/2020
  Time: 10:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>

<form action=Login method="post">

    User Name: <input type=text name=userName><br>
    Password: <input type=password name=password><br>
    <input type=submit value=Login onClick="validate(this.form)"> <br>
</form>

</body>
</html>
