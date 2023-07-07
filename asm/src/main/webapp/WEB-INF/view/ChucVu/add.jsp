<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">

<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/chuc-vu/add" method="post" modelAttribute="cv">
    <h3>ADD Chuc Vu</h3>

    <div class="mb-3">
        <label class="form-label">MA</label>
        <form:input type="text" class="form-control" path="ma" value="${cv.ma}"/>
        <form:errors path="ma"/>
        <br/>
    </div>
    <div class="mb-3">
        <label class="form-label">TEN</label>
        <form:input type="text" class="form-control" path="ten" value="${cv.ten}"/>
        <form:errors path="ten"/>
        <br/>
    </div>
    <button type="submit">Add</button>
</form:form>
</body>
</html>