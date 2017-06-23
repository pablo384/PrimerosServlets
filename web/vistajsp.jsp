<%--
  Created by IntelliJ IDEA.
  User: pablo
  Date: 23/6/2017
  Time: 12:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Vista JSP</title>
</head>
<body>
<c:forEach var="tempProducto" items="${listadeproductos}">
${tempProducto}<br>
</c:forEach>
</body>
</html>
