<%--
  Created by IntelliJ IDEA.
  User: iwtbah
  Date: 2020/11/1
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>添加账户信息</h1>
<form action="${pageContext.request.contextPath}/account/save" method="post" name="accountFrom">
    姓名:<input name="name" type="text"/><br/>
    余额:<input name="money" type="text"/><br/>
    <input type="submit" value="保存">
</form>
</body>
</html>
