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
<form:form action="/khach-hang/detail/${kh.id}" method="get" modelAttribute="kh">
    <div class="container">
        <div class="col-9 offset-3">
            <h3>Detail Khach Hang</h3>
            MA:             <span>${kh.ma}</span>
            <br>
            HO VA TEN:      <span>${kh.ho} ${kh.tenDem} ${kh.ten}</span>
            <br>
            NGAY SINH:      <span>${kh.ngaySinh}</span>
            <br>
            SDT:            <span>${kh.sdt}</span>
            <br>
            DIA CHI:        <span>${kh.diaChi}</span>
            <br>
            THANH PHO:      <span>${kh.thanhPho}</span>
            <br>
            QUOC GIA:       <span>${kh.quocGia}</span>
            <br>
            MAT KHAU:       <span>${kh.matKhau}</span>
            <br>
        </div>
    </div>

</form:form>
</body>
</html>