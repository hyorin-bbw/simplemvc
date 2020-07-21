<%--
  Created by IntelliJ IDEA.
  User: L
  Date: 2020/7/20
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    User user = (User) request.getAttribute("user");
%>
<%@page import="com.hyorin.learningMVC.Bean.*" %>
<html>
<head>
    <title>user.jsp</title>
    <link rel="icon" href="../image/logo.ico" type="image/x-icon">
</head>
<body>
<h1>Hello <%= user.name %>!</h1>
<p>School name:
    <span style="color: red">
        <%= user.school.address %>
        <div style="color: blue">school ID:</div>
        <%= user.school.schoolNumber %>
</span>
</p>
</body>
</html>

