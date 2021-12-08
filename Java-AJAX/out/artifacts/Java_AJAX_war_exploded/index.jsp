<%--
  Created by IntelliJ IDEA.
  User: 14362
  Date: 2021/10/17
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Ajax</title>
<%--    要使用jQue，需要导入--%>
    <script src="{pageContext.request.contextPath}/statics/js/jquery-3.6.0.js"/>
  </head>
  <body>
  <script type="text/javascript">

    function a1(){
      //所有参数：
      //url:待载入页面的URL地址，Json
      //data:待发送 key/value 参数
      // success:载入成功时回调函数
        //data:封装了服务器返回的数据
        //status:状态

        //默认是get请求

      $.post{
        url:"${pageContext.request.contextPath}/ajax/a1",
          data:{"name":$("#txtName").val()},
          success:function(data,status){
            console(data);
            console(status);
          }
      })

    }
  </script>
<%--  onvlur失去焦点产生事件--%>
    用户名：
  <input type="text" id = "txtName" onblur="">
  </body>
</html>
