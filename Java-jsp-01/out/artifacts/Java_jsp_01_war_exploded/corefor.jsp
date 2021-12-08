<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 14362
  Date: 2021/10/10
  Time: 22:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    ArrayList<String> people = new ArrayList<String>();
    people.add(0,"zhang");
    people.add(1,"zhao");
    people.add(2,"li");
    people.add(3,"liu");
    people.add(4,"xia");
    request.setAttribute("list",people);
%>
<c:forEach var="people" items="${list}" begin="1" end="4" step="2">
    <c:out value="${people}"/>
    <hr>
</c:forEach>
</body>
</html>
