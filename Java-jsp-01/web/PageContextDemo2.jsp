<%--
  Created by IntelliJ IDEA.
  User: 14362
  Date: 2021/10/10
  Time: 21:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String name1 = (String) request.getAttribute("name1");
    String name2 = (String) session.getAttribute("name2");
    String name3 = (String)application.getAttribute("name3");

%>
<h3>${name1}</h3>
<h3>${name2}</h3>
<h3>${name3}</h3>
</body>
</html>
