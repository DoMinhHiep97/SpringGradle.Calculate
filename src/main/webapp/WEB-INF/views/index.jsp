<%--
  Created by IntelliJ IDEA.
  User: 19tha
  Date: 10/22/2019
  Time: 2:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="output"></div>
<form method="get" action="/ok" id="myForm">
    <input type="text" name="first" id="first" />
    <input type="text" name="second" id="second" />
    <br>
    <input type="submit" name="operator" value="addition">
    <input type="submit" name="operator" value="minus">
    <input type="submit" name="operator" value="multiplication">
    <input type="submit" name="operator" value="division">

    <span>Result:${result}</span>


</form>
</body>
</html>
