<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <title>Product</title>
    </head>
    <body>
        <h2>Product id: ${product.id}</h2>
        <h2>Product title: ${product.title}</h2>
        <h2>Product cost: ${product.cost}</h2>
        <h2>Product manufacture date: ${product.date}</h2>
        <h2>Product manufacturer: ${product.manufacturer}</h2>

        <c:url var="editUrl" value="/products/edit">
            <c:param name="id" value="${product.id}"/>
        </c:url>
        <a href="${editUrl}">EDIT</a>
        <br>
        <c:url var="deleteUrl" value="/products/delete">
            <c:param name="id" value="${product.id}"/>
        </c:url>
        <a href="${deleteUrl}">DELETE</a>
    </body>
</html>