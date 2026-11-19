<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
</head>

<body>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <div class="container">
        <h1>Welcome to our website</h1>
        <h2>We are glad to have you here</h2>

        <div>Name: ${username}</div>
        <div>Password: ${password}</div>

        <div>
            <a href="${pageContext.request.contextPath}/todo-list">
                Manage To-Dos
            </a>
        </div>
    </div>

</body>
</html>
