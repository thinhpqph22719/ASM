<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">

<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/khach-hang/hien-thi" method="get">
    <button type="submit"><a href="/khach-hang/view-add">ADD</a></button>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">STT</th>
            <th scope="col">MA</th>
            <th scope="col">HO VA TEN</th>
            <th scope="col">NGAY SINH</th>
            <th scope="col">SDT</th>
            <th scope="col">DIA CHI</th>
            <th scope="col">THANH PHO</th>
            <th scope="col">QUOC GIA</th>
            <th scope="col">MAT KHAU</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="kh" varStatus="stt">
            <tr>
                <td>${stt.index+1}</td>
                <td>${kh.ma}</td>
                <td>${kh.ho} ${kh.tenDem} ${kh.ten}</td>
                <td>${kh.ngaySinh}</td>
                <td>${kh.sdt}</td>
                <td>${kh.diaChi}</td>
                <td>${kh.thanhPho}</td>
                <td>${kh.quocGia}</td>
                <td>${kh.matKhau}</td>
                <td>
                    <button type="button" class="btn btn-outline-primary"><a href="/khach-hang/detail/${kh.id}">DETAIL</a></button>
                    <button type="button" class="btn btn-outline-primary"><a href="/khach-hang/delete/${kh.id}">DELETE</a></button>
                    <button type="button" class="btn btn-outline-primary"><a href="/khach-hang/view-update/${kh.id}">UPDATE</a></button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <nav aria-label="Page navigation example" style="margin-right: 750px">
        <ul class="pagination float-end">
            <li class="page-item">
                <a class="page-link" href="/khach-hang/hien-thi?page=${currentPage -1 <= 0?0:currentPage -1}" >
                    <span aria-hidden="true">&laquo;</span>
                </a>
            </li>
            <c:forEach var="i" begin="0" end="${totalPages -1}">
                <li class="page-item"><a class="page-link" href="/khach-hang/hien-thi?page=${i}">${i + 1}</a></li>
            </c:forEach>
            <li class="page-item">
                <a class="page-link" href="/khach-hang/hien-thi?page=${currentPage +1 >= totalPages -1?totalPages -1:currentPage +1}" >
                    <span aria-hidden="true">&raquo;</span>
                </a>
            </li>
        </ul>
    </nav>
</form>
</body>
</html>