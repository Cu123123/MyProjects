<%--
  Created by IntelliJ IDEA.
  User: 14362
  Date: 2021/10/19
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <script type="application/javascript" language="JavaScript">
    function getTime(){
      var date = new Date();
      var time = date.getFullYear()+"年"+date.getMonth()+"月"+date.getDay()+"日"
              +date.getHours()+"时"+date.getMinutes()+"分"+date.getSeconds()+"秒";
      document.getElementById("time").innerHTML = "<font color='red'>"+time+"</font>";
    }
    setInterval("getTime()",1000);
  </script>
</head>
<body>
<form>
  <div id="time"></div>
</form>
</body>
</html>
