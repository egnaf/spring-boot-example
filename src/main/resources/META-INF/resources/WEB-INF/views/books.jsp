<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:forEach items="${books}" var="book">
    <span>${book.id}</span>. <span>${book.name}</span> <span>${book.author}</span><br>
</c:forEach>
