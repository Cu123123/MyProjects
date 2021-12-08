<%@ page import="Test.People" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<%--%>
<%--    People people = new People();--%>
<%--    people.setId(1);--%>
<%--    people.setName("zhang");--%>
<%--    people.setAge(18);--%>
<%--    people.setAddress("沈阳");--%>
<%--%>--%>
<%--<%=people.getId()%>--%>
<%--<%=people.getName()%>--%>
<%--<%=people.getAge()%>--%>
<%--<%=people.getAddress()%>--%>
<jsp:useBean id="people" class="Test.People" scope="page"/>
<jsp:setProperty name="people" property="id" value="1"/>
<jsp:setProperty name="people" property="name" value="zhang"/>
<jsp:setProperty name="people" property="age" value="18"/>
<jsp:setProperty name="people" property="address" value="沈阳"/>
<jsp:getProperty name="people" property="id"/>
<jsp:getProperty name="people" property="name"/>
<jsp:getProperty name="people" property="age"/>
<jsp:getProperty name="people" property="address"/>

</body>
</html>
