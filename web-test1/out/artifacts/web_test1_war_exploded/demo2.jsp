<%--
  Created by IntelliJ IDEA.
  User: 14362
  Date: 2021/10/18
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script language="JavaScript" type="application/javascript">
        // var temp;
        // alert(temp);
        // temp=22;
        // alert(typeof(temp))
        // console.log(parseInt('a'));
        // console.log(parseInt('1a'));
        // console.log(parseInt('123'));
        // var nums = [0, 1, 2];
        // // nums[10] = 10;
        // var num2 = [0, 1]
        // var num3 = [0,1];
        //
        // console.log(num2.concat(nums.concat(num3)));
        var date = new Date();
        console.log(date.toJSON());
        function getTime(){
            var date = new Date();
            document.getElementById("time").title=date.toJ();
        }

    </script>

</head>
<body>
<form>
    <input type="text" id="time">
    <input type="button" onclick="getTime()" value="getTime">
</form>
</body>
</html>
