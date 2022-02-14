<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <title>Add product</title>
    </head>
    <body>
<%--@elvariable id="product" type="ru.geekbrains.Product"--%>
        <form:form action="form" modelAttribute="product">
        <form:hidden path="id" value="${product.id}"/>
        Title: <form:input path="title"/>
        <br>
        Cost: <form:input path="cost"/>
        <br>
        Manufacture Date: <form:input path="date"/>
        <br>
        Manufacturer: <form:input path="manufacturer"/>
        <br>
        <input type="submit" value="Save"/>
        </form:form>
    </body>
</html>