<%--
  Created by IntelliJ IDEA.
  User: 14362
  Date: 2021/11/9
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/login" method="post">
    用户名：<input type="text" name="username"><br>
    密码：<input type="password" name="password">
    <input type="submit" value="登录">
</form>
</body>
</html>
