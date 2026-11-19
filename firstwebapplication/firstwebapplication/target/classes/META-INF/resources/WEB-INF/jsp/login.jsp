<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
</head>

<body>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>Login</h1>

<div class="container">
    <form action="${pageContext.request.contextPath}/login" method="post">
        Username: <input type="text" name="username" />
        <br><br>
        Password: <input type="password" name="password" />
        <br><br>
        <input type="submit" value="Login"/>
    </form>
</div>

</body>
</html>
