<%-- 
    Document   : index
    Created on : Jan 23, 2018, 9:50:54 PM
    Author     : Admin
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
        <form class="m-t" method="POST" action="ProcessServlet">
             <button type="submit" class="btn btn-primary block full-width m-b" name="btAction" value="GO">Login</button>
                   <c:set var="hotPro" value="${requestScope.PRODUCT}"/> 
                   <c:forEach var="hotPro1" items="${hotPro}" varStatus="counter">
                       <h1>${hotPro1.ten}</h1>
                   </c:forEach>
        </form>
    </body>
</html>
