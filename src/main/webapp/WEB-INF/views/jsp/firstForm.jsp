<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/15/2018
  Time: 11:44 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form loaded, ${message}</title>
</head>
<body>
<form:form action="processFormSecond" modelAttribute="employee">
    <form:input type="text" path="firstName"/>
    <form:input type="text" path="lastName"/>

    <form:select path="country">
        <form:options items="${countryOptions}"/>
    </form:select>
    <button type="submit" value="Submit">submit</button>
</form:form>

</body>
</html>
