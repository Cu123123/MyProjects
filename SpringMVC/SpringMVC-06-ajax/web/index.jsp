<%--
  Created by IntelliJ IDEA.
  User: 14362
  Date: 2021/11/8
  Time: 12:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>

<%--    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.6.0.js">--%>
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    </script>

    <script>

        function a1(){
          $.post({
            url:"http://localhost:8080/a1",
            data:{'name':$("#txtName").val()},
            success:function (data,status) {
              alert(data);
              alert(status);
            }
          });
        }


    </script>
  </head>
  <body>

  <%--onblur：失去焦点触发事件--%>
  用户名:<input type="text" id="txtName" onblur="a1()"/>

  </body>
</html>
