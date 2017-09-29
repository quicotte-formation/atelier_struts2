<%-- 
    Document   : lister
    Created on : 29 sept. 2017, 10:20:54
    Author     : IB
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:forEach items="${films}" var="film">
            TITRE: ${film.titre}
        </c:forEach>
    </body>
</html>
