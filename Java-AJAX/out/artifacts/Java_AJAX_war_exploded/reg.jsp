<%--
  Created by IntelliJ IDEA.
  User: 14362
  Date: 2021/10/17
  Time: 20:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <script src="${pageContext.request.contextPath}/statics/js/jquery-3.6.0.js"/>
  <script>
    function a1(){
      $.post({
        url:"${pageContext.request.contextPath}/ajax/a1",
        data:{"name":$("#name").val()},
        success:function (data){
          if(data.toString()=='ok'){
            $('#userInfo').css("color","green");
          }else {
            $('#userInfo').css("color","red");
          }
          $("#userInfo").html(data);
        }
      })
    }
    function a2(){

    }
  </script>
</head>
<body>
<p>
  用户名：
  <input type="text" id="name" onblur="a1()">
</p>
<p>
  密码：
  <input type="text" id="pwd" onblur="a2()">
  <span id = "pwdInfo"></span>
</p>
</body>
</html>
