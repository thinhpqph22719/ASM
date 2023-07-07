<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">

<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/dong-sp/update/${dsp.id}" method="post" modelAttribute="dsp">
    <h3>Update Dong San Pham</h3>

    <div class="mb-3">
        <label class="form-label">MA</label>
    <form:input type="text" class="form-control" path="ma" value="${dsp.ma}"/>
    </div>
    <div class="mb-3">
        <label class="form-label">TEN</label>
        <form:input type="text" class="form-control" path="ten" value="${dspten}"/>
    </div>
    <button type="submit">UPDATE</button>
</form:form>
</body>
</html>