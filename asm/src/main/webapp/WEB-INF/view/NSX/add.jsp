<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">

<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/nsx/add" method="post" modelAttribute="nsx">
    <h3>ADD Nha San Xuat</h3>
    <div class="mb-3">
        <label class="form-label">MA</label>
        <input type="text" class="form-control" name="ma" value="${nsx.ma}">
        <form:errors path="ma"/>
        <br/>
    </div>
    <div class="mb-3">
        <label class="form-label">TEN</label>
        <input type="text" class="form-control" name="ten" value="${nsx.ten}">
        <form:errors path="ten"/>
    </div>
    <button type="submit">Add</button>
</form:form>
</body>
</html>