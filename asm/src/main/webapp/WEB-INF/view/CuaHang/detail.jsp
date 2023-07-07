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
<form:form action="/cua-hang/detail/${ch.id}" method="get" modelAttribute="ch">
    <h3>Detail Cua Hang</h3>

    Ma:
    <span>${ch.ma}</span>
    <br>
    Ten:
    <span>${ch.ten}</span>
    <br>
    Dia Chi:
    <span>${ch.diaChi}</span>
    <br>
    Thanh Pho:
    <span>${ch.thanhPho}</span>
    <br>
    Quoc Gia:
    <span>${ch.quocGia}</span>
    <br>
</form:form>
</body>
</html>