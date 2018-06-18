<%--
  Created by IntelliJ IDEA.
  User: sky
  Date: 6/7/2018
  Time: 11:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>This is form second</title>
</head>
<body>
${firstName}
${lastName}
${country}
<form:form action="processFormThird">
    <input type="text" name="firstName">
    <input type="text" name="lastName">
    <input type="text" name="country">
    <button type="submit" value="submit" >To reach Third Form click here</button>
</form:form>
</body>
</html>
