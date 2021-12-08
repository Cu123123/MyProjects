<%@ page import="static javax.servlet.jsp.PageContext.*" %><%--
  Created by IntelliJ IDEA.
  User: 14362
  Date: 2021/10/10
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%

  request.setAttribute("name1","zhang1");
  session.setAttribute("name2","zhang2");
  application.setAttribute("name3","zhang3");
%>
<%

    pageContext.forward("/PageContextDemo2.jsp");
%>

</body>
</html>
