<html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<body>
<h2>Hello World!</h2>
<form action="${pageContext.request.contextPath}/login" method="get">
    账号：<input type="text" name="username"><br>
    密码：<input type="password" name="password"><br>
    爱好：<input type="checkbox" name="hobbies" value="看电影">看电影
         <input type="checkbox" name="hobbies" value="敲代码 ">敲代码
         <input type="checkbox" name="hobbies" value="玩游戏">玩游戏
    <input type="checkbox" name="hobbies" value="666">666
    <input type="submit">
</form>
<%

%>
</body>
</html>
