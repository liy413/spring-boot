<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/28 0028
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1">
        <tr>
            <td>编号</td>
            <td>姓名</td>
        </tr>
        <c:forEach items="${users}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
