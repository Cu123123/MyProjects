
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
      <style>
          a:link{
              font-size: 20px;
              color: green;
              text-decoration: none;
          }
          /*a:visited{*/
          /*    font-size: 20px;*/
          /*    color: red;*/
          /*}*/
          /*a:hover{*/
          /*    color: blue;*/
          /*}*/
          a:active{
              color: pink;
          }
      </style>
  </head>
  <body>
      <form>
        <input type="range"><br>
        <input type="email" placeholder="请输入邮箱"required="required" ><br>
        <input type="color" value="111"><br>
          <textarea>

          </textarea><br>
          <p hidden>aaaaaaaaaaa</p><br>
          <p contenteditable="true">可修改</p>
          <p spellcheck="true">hellp</p>
          <a href="#"> spring </a>
        <input type="submit">
      </form>
    <input type="text" list="movie"/>
    <datalist id="movie">
    <option label="第一" value="zhang"></option>
    <option label="第二" value="zhao"></option>
    <option label="第三" value="li"></option>
  </datalist>
  </body>
</html>
