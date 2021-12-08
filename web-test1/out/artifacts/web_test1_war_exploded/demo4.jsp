<%--
  Created by IntelliJ IDEA.
  User: 14362
  Date: 2021/10/20
  Time: 13:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        function sum1(){
            var num1 = document.getElementById("num1").value;
            var num2 = document.getElementById("num2").value;
            if(isNaN(Number(num1)+Number(num2))){
                alert("请输入正确的数字")
            }else {
                document.getElementById("result").value = Number(num1)+Number(num2);
            }

        }
    </script>
</head>
<body>
    <form>
        加法运算：
        <br/>
        数字一：<input id="num1"/> + 数字二：<input id="num2"/> = <input id="result">
        <input type="button" value="求和" onclick="sum1()">
    </form>
</body>
</html>
