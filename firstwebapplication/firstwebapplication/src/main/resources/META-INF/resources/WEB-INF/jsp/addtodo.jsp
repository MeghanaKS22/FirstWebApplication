


<body class="container mt-4">

    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <div class="container">
        <h1>Welcome to ToDo List</h1>
        <h2>Hi!! ${username}, welcome to To-Do List</h2>

        <form:form method="POST" modelAttribute="todo">

            <fieldset class="mb-3">
                <form:label path="description">Description</form:label>
                <form:input path="description" cssClass="form-control"/>
                <form:errors path="description" cssClass="text-danger"/>
            </fieldset>

            <fieldset class="mb-3">
                <form:label path="targetDate">Target Date</form:label>
                <form:input path="targetDate" cssClass="form-control"/>
                <form:errors path="targetDate" cssClass="text-danger"/>
            </fieldset>

            <form:hidden path="id"/>
            <form:hidden path="done"/>

            <input type="submit" class="btn btn-success"/>
        </form:form>
    </div>

    <script src="<c:url value='/webjars/jquery/3.6.0/jquery.min.js'/>"></script>
    <script src="<c:url value='/webjars/bootstrap/5.3.3/js/bootstrap.min.js'/>"></script>

</body>
</html>
