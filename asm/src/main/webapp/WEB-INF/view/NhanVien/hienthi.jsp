<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">

<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/nhan-vien/hien-thi" method="get">
    <button type="submit"><a href="/nhan-vien/view-add">ADD</a></button>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">STT</th>
            <th scope="col">MA</th>
            <th scope="col">HO VA TEN</th>
            <th scope="col">GIOI TINH</th>
            <th scope="col">NGAY SINH</th>
            <th scope="col">DIA CHI</th>
            <th scope="col">SDT</th>
            <th scope="col">MAT KHAU</th>
            <th scope="col">TRANG THAI</th>
            <th scope="col">CUA HANG</th>
            <th scope="col">CHUC VU</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="nv" varStatus="stt">
            <tr>
                <td>${stt.index+1}</td>
                <td>${nv.ma}</td>
                <td>${nv.ho} ${nv.tenDem} ${nv.ten}</td>
                <td>${nv.gioiTinh?"Nam":"Nữ"}</td>
                <td>${nv.ngaySinh}</td>
                <td>${nv.diaChi}</td>
                <td>${nv.sdt}</td>
                <td>${nv.matKhau}</td>
                <td>${nv.trangThai ==1?"Hoạt Động":"Ngừng Hoạt Động"}</td>
                <td>${nv.cuaHang.ma} - ${nv.cuaHang.ten}</td>
                <td>${nv.chucVu.ma} - ${nv.chucVu.ten}</td>
                <td>
                    <button type="button" class="btn btn-outline-primary"><a href="/nhan-vien/detail/${nv.id}">DETAIL</a></button>
                    <button type="button" class="btn btn-outline-primary"><a href="/nhan-vien/delete/${nv.id}">`DELETE`</a></button>
                    <button type="button" class="btn btn-outline-primary"><a href="/nhan-vien/view-update/${nv.id}">UPDATE</a></button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <nav aria-label="Page navigation example" style="margin-right: 750px">
        <ul class="pagination float-end">
            <li class="page-item">
                <a class="page-link" href="/nhan-vien/hien-thi?page=${currentPage -1 <= 0?0:currentPage -1}" >
                    <span aria-hidden="true">&laquo;</span>
                </a>
            </li>
            <c:forEach var="i" begin="0" end="${totalPages -1}">
                <li class="page-item"><a class="page-link" href="/nhan-vien/hien-thi?page=${i}">${i + 1}</a></li>
            </c:forEach>
            <li class="page-item">
                <a class="page-link" href="/nhan-vien/hien-thi?page=${currentPage +1 >= totalPages -1?totalPages -1:currentPage +1}" >
                    <span aria-hidden="true">&raquo;</span>
                </a>
            </li>
        </ul>
    </nav>
</form>
</body>
</html>