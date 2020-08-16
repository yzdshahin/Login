<%@ page import="Model.Person" %><%--
  Created by IntelliJ IDEA.
  User: shahin_yzd
  Date: 8/16/2020
  Time: 10:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Sucess</title>
</head>
<body>
<p>You are successfully logged in!</p>
<% Person person= (Person) request.getAttribute("Person");
    out.print("Welcome, "+person.getUser());
%>
</body>
</html>
