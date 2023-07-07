<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<form:form action="/nhan-vien/detail/${nv.id}" method="get" modelAttribute="nv">
    <h3>Detail Nhan Vien</h3>
    Ma:<span>${nv.ma}</span>
    <br>
    HO VA TEN:
    <span>${nv.ho} ${nv.tenDem} ${nv.ten}</span>
    <br>
    GIOI TINH:
    <span>${nv.gioiTinh}</span>
    <br>
    NGAY SINH:
    <span>${nv.ngaySinh}</span>
    <br>
    DIA CHI:
    <span>${nv.diaChi}</span>
    <br>
    SDT:
    <span>${nv.sdt}</span>
    <br>
    MAT KHAU:
    <span>${nv.matKhau}</span>
    <br>
    TRANG THAI:
    <span>${nv.trangThai}</span>
    <br>
    CUA HANG:
    <span>${nv.cuaHang.ma} - ${nv.cuaHang.ten}</span>
    <br>
    CHUC VU:
    <span>${nv.chucVu.ma} - ${nv.chucVu.ten}</span>
    <br>

</form:form>
</body>
</html>