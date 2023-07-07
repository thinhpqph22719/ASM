<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">

<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/dong-sp/add" method="post" modelAttribute="dsp">
    <h3>ADD Dong San Pham</h3>

    <div class="mb-3">
        <label class="form-label">MA</label>
        <input type="text" class="form-control" name="ma" value="${dsp.ma}">
        <form:errors path="ma"/>
        <br/>
    </div>
    <div class="mb-3">
        <label class="form-label">TEN</label>
        <input type="text" class="form-control" name="ten" value="${dsp.ten}">
        <form:errors path="ten"/>
        <br/>
    </div>
    <button type="submit">Add</button>
</form:form>
</body>
</html>