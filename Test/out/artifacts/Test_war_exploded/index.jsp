<%--
  Created by IntelliJ IDEA.
  User: 14362
  Date: 2021/10/29
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <!-- 直接输出常量 -->
  <c:out value="第一个JSTL小程序"></c:out>
  <%
    String name = "CodeTiger";
    request.setAttribute("name", name);
  %>
  <!-- 使用default属性 ,当name1的属性为空时，输出default属性的值-->
  <c:out value="${name1}" default="error"></c:out><br>
  <!-- 使用escapeXml属性，设置是否对转义字符进行转义，默认为true不转义 -->
  <c:out value="&lt;CodeTiger&gt;" escapeXml="false"></c:out><br>

  </body>
</html>
