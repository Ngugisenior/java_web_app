<%--
  Created by IntelliJ IDEA.
  User: radiant
  Date: 2020. 07. 15.
  Time: 7:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h1>Welcome, Please login:</h1>
    <form action="${pageContext.request.contextPath}/login" method="post">
        login-name: <input type="text" name="loginname" width="30"/>
        password: <input type="password" name="password" width="10"/>
        <input type="submit" value="Login">
    </form>
    <p style="color: red;">${errorMessage}</p>
</body>
</html>
