<%--
  Created by IntelliJ IDEA.
  User: mazmi
  Date: 5/5/2020
  Time: 11:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="zooservlet" method="post">
    <tr>
        <td>Name</td>
        <td><input name="name"/></td>
    </tr>
    <tr>
        <td>type</td>
        <td><input name="type"/></td>
    </tr>
    <tr>
        <td>breed</td>
        <td><input name="breed"/></td>
    </tr>
    <tr>
        <td>color</td>
        <td><input name="color"/></td>
    </tr>
    <tr>
        <td>age</td>
        <td><input name="age"/></td>
    </tr>
    </table>
    <input type="submit"/>
</form>

</body>
</html>
