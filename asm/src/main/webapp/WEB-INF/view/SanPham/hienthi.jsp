<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">

<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/san-pham/hien-thi" method="get">
    <button type="submit"><a href="/san-pham/view-add">ADD</a></button>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">STT</th>
            <th scope="col">MA</th>
            <th scope="col">TEN</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="sp" varStatus="stt">
            <tr>
                <td>${stt.index+1}</td>
                <td>${sp.ma}</td>
                <td>${sp.ten}</td>
                <td>
                    <button type="button" class="btn btn-outline-primary"><a href="/san-pham/detail/${sp.id}">DETAIL</a></button>
                    <button type="button" class="btn btn-outline-primary"><a href="/san-pham/delete/${sp.id}">DELETE</a></button>
                    <button type="button" class="btn btn-outline-primary"><a href="/san-pham/view-update/${sp.id}">UPDATE</a></button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <nav aria-label="Page navigation example" style="margin-right: 750px">
        <ul class="pagination float-end">
            <li class="page-item">
                <a class="page-link" href="/san-pham/hien-thi?page=${currentPage -1 <= 0?0:currentPage -1}" >
                    <span aria-hidden="true">&laquo;</span>
                </a>
            </li>
            <c:forEach var="i" begin="0" end="${totalPages -1}">
                <li class="page-item"><a class="page-link" href="/san-pham/hien-thi?page=${i}">${i + 1}</a></li>
            </c:forEach>
            <li class="page-item">
                <a class="page-link" href="/san-pham/hien-thi?page=${currentPage +1 >= totalPages -1?totalPages -1:currentPage +1}" >
                    <span aria-hidden="true">&raquo;</span>
                </a>
            </li>
        </ul>
    </nav>
</form>
</body>
</html>