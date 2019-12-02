<%@page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Products Page</title>
</head>
<body>
<table>
    <thead>
    <th>
    <td>ID</td>
    <td>name</td>
    <td>Description</td>
    <td>Price</td>
    </th>
    </thead>
    <tbody>
    <c:forEach items="${products}" var="product">
        <tr>
            <td>${product.productId}</td>
            <td>${product.productName}</td>
            <td>${product.productDescription}</td>
            <td>${product.productPrice}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>