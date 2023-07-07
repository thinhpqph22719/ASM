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
<form:form action="/chi-tietsp/detail/${ctsp.id}" method="get" modelAttribute="ctsp">
    ID:<span>${ctsp.id}</span>
    <br>
    SAN PHAM:<span>${ctsp.sanPham.ma}-${ctsp.sanPham.ten}</span>
    <br>
    NHA SAN XUAT:
    <span>${ctsp.nsx.ma}-${ctsp.nsx.ten}</span>
    <br>
    MAU SAC:
    <span>${ctsp.mauSac.ma}-${ctsp.mauSac.ten}</span>
    <br>
    DONG SP:
    <span>${ctsp.dongSP.ma}-${ctsp.dongSP.ten}</span>
    <br>
    NAM BH:
    <span>${ctsp.namBH}</span>
    <br>
    Mo Ta:
    <span>${ctsp.moTa}</span>
    <br>
    SO LUONG TON:
    <span>${ctsp.soLuongTon}</span>
    <br>
    GIA NHAP:
    <span>${ctsp.giaNhap}</span>
    <br>
    GIA BAN:
    <span>${ctsp.giaBan}</span>
    <br>

</form:form>
</body>
</html>