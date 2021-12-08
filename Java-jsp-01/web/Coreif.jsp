
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="Coreif.jsp" method="post">
    <input type="text" name="name" value="${param.name}">
    <input type="submit">
</form>
<c:if test="${param.name=='admin'}" var="isAdmin">
    <c:out value="欢迎您"></c:out>
</c:if>
<c:out value="${isAdmin}"></c:out>
</body>
</html>
