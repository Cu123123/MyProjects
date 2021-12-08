<%@ page import="com.zhang.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: 14362
  Date: 2021/10/29
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
欢迎<font color="#00008b"> <%=((User)session.getAttribute("user")).getName()%>>使用本系统！
</body>
</html>
