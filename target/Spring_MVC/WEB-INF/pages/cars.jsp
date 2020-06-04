<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ page language="java" contentType="text/html;charset=cp1251"%>
<html>

<head>
    <title>
        Cars JSP
    </title>
</head>
<body>

<fmt:setBundle basename="messages" />
<h1><fmt:message key="locale"/></h1>

<c:forEach var="msq" items="${cars}">
    <td><h2>${msq}</h2></td>
</c:forEach>

</body>
</html>