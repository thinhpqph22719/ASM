<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">

<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/chi-tietsp/hien-thi" method="get">
    <button type="submit"><a href="/chi-tietsp/view-add">ADD</a></button>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">STT</th>
            <th scope="col">ID</th>
            <th scope="col">SAN PHAM</th>
            <th scope="col">NHA SAN XUAT</th>
            <th scope="col">MAU SAC</th>
            <th scope="col">DONG SP</th>
            <th scope="col">NAM BH</th>
            <th scope="col">SO LUONG TON</th>
            <th scope="col">GIA NHAP</th>
            <th scope="col">GIA BAN</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="ctsp" varStatus="stt">
            <tr>
                <td>${stt.index+1}</td>
                <td>${ctsp.id}</td>
                <td>${ctsp.sanPham.ma}-${ctsp.sanPham.ten}</td>
                <td>${ctsp.nsx.ma}-${ctsp.nsx.ten}</td>
                <td>${ctsp.mauSac.ma}-${ctsp.mauSac.ten}</td>
                <td>${ctsp.dongSP.ma}-${ctsp.dongSP.ten}</td>
                <td>${ctsp.namBH}</td>
                <td>${ctsp.moTa}</td>
                <td>${ctsp.soLuongTon}</td>
                <td>${ctsp.giaNhap}</td>
                <td>${ctsp.giaBan}</td>
                <td>
                    <button type="button" class="btn btn-outline-primary"><a href="/chi-tietsp/detail/${ctsp.id}">DETAIL</a></button>
                    <button type="button" class="btn btn-outline-primary"><a href="/chi-tietsp/delete/${ctsp.id}">DELETE</a></button>
                    <button type="button" class="btn btn-outline-primary"><a href="/chi-tietsp/view-update/${ctsp.id}">UPDATE</a></button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <nav aria-label="Page navigation example" style="margin-right: 750px">
        <ul class="pagination float-end">
            <li class="page-item">
                <a class="page-link" href="/chi-tietsp/hien-thi?page=${currentPage -1 <= 0?0:currentPage -1}" >
                    <span aria-hidden="true">&laquo;</span>
                </a>
            </li>
            <c:forEach var="i" begin="0" end="${totalPages -1}">
                <li class="page-item"><a class="page-link" href="/chi-tietsp/hien-thi?page=${i}">${i + 1}</a></li>
            </c:forEach>
            <li class="page-item">
                <a class="page-link" href="/chi-tietsp/hien-thi?page=${currentPage +1 >= totalPages -1?totalPages -1:currentPage +1}" >
                    <span aria-hidden="true">&raquo;</span>
                </a>
            </li>
        </ul>
    </nav>
</form>
</body>
</html>