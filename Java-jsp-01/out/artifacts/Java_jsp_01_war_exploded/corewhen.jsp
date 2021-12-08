<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 14362
  Date: 2021/10/10
  Time: 22:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set var="score" value="99"/>
<c:choose>
  <c:when test="${score>90}">
    优秀
  </c:when>
  <c:when test="${score>80}">
    良好
  </c:when>
  <c:when test="${score>60}">
    及格
  </c:when>
</c:choose>

</body>
</html>
