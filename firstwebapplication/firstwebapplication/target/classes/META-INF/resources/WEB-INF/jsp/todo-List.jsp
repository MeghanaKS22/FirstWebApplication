<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>

    <link rel="stylesheet"
          href="<c:url value='/webjars/bootstrap/5.3.3/css/bootstrap.min.css'/>">
</head>

<body class="container mt-4">

    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <h1>Welcome</h1>
    <h2>Hi!! <c:out value="${username}"/> welcome to To-Do List</h2>

    <p>This is To-Do List Management</p>

    <!-- Todo Table -->
    <h3>Your Todos:</h3>

    <div class="container">

        <table class="table border-0">
            <thead class="table-dark border-0">
                <tr>
                    <th class="border-0 px-4">ID</th>
                    <th class="border-0 px-4">Username</th>
                    <th class="border-0 px-4">Description</th>
                    <th class="border-0 px-4">Target Date</th>
                    <th class="border-0 px-4">Done</th>
                    <th></th>
                    <th></th>
                </tr>
            </thead>

            <tbody class="border-0">
                <c:forEach var="todo" items="${todos}">
                    <tr class="border-0">
                        <td class="border-0 px-4"><c:out value="${todo.id}"/></td>
                        <td class="border-0 px-4"><c:out value="${todo.username}"/></td>
                        <td class="border-0 px-4"><c:out value="${todo.description}"/></td>
                        <td class="border-0 px-4"><c:out value="${todo.targetDate}"/></td>
                        <td class="border-0 px-4"><c:out value="${todo.done}"/></td>

                        <td class="border-0 px-4">
                            <a href="<c:url value='/delete-todo?id=${todo.id}'/>"
                               class="btn btn-danger">Delete</a>
                        </td>

                        <td class="border-0 px-4">
                            <a href="<c:url value='/update-todo?id=${todo.id}'/>"
                               class="btn btn-success">Update</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

        <a href="<c:url value='/addtodo'/>" class="btn btn-success">Add To-Do</a>
    </div>

    <script src="<c:url value='/webjars/jquery/3.6.0/jquery.min.js'/>"></script>
    <script src="<c:url value='/webjars/bootstrap/5.3.3/js/bootstrap.min.js'/>"></script>

</body>
</html>
