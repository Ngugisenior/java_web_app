<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: radiant
  Date: 2020. 07. 15.
  Time: 7:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Radiant HQ</title>
  </head>
  <body>
  <p>Hello World</p>
  <%
    Date date = new Date();
    out.print("<h2>"+date.toString()+"</h2>");
  %>
  </body>
</html>
