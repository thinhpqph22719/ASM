<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">

<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/khach-hang/add" method="post" modelAttribute="kh">
    <h3>Detail Khach Hang</h3>
    <div class="mb-3">
        <label class="form-label">MA</label>
        <form:input type="text" class="form-control" path="ma" value="${kh.ma}"/>
        <form:errors path="ma"/>
        <br/>
    </div>
    <div class="mb-3">
        <label class="form-label">HO</label>
        <form:input type="text" class="form-control" path="ho" value="${kh.ho}"/>
        <form:errors path="ho"/>
        <br/>    </div>
    <div class="mb-3">
        <label class="form-label">TEN DEM</label>
        <form:input type="text" class="form-control" path="tenDem" value="${kh.tenDem}"/>
        <form:errors path="tenDem"/>
    </div>
    <div class="mb-3">
        <label class="form-label">TEN</label>
        <form:input type="text" class="form-control" path="ten" value="${kh.ten}"/>
        <form:errors path="ten"/>
        <br/>
    </div>
    <div class="mb-3">
        <label class="form-label">Ngay Sinh</label>
        <form:input type="date" class="form-control" path="ngaySinh" value="${kh.ngaySinh}"/>
        <form:errors path="ngaySinh"/>
        <br/>
    </div>
    <div class="mb-3">
        <label class="form-label">SDT</label>
        <form:input type="text" class="form-control" path="sdt" value="${kh.sdt}"/>
        <form:errors path="sdt"/>
        <br/>
    </div>
    <div class="mb-3">
        <label class="form-label">DIA CHI</label>
        <form:input type="text" class="form-control" path="diaChi" value="${kh.diaChi}"/>
        <form:errors path="diaChi"/>
        <br/>
    </div>
    <div class="mb-3">
        <label class="form-label">THANH PHO</label>
        <form:select class="form-select" aria-label="Default select example" path="thanhPho" value="${kh.thanhPho}">
            <option value="Hà Nội" ${kh.thanhPho == "Hà Nội" ? "selected" : "" }/>Hà Nội
            <option value="TP. Hồ Chí Minh" ${kh.thanhPho == "TP. Hồ Chí Minh" ? "selected" : "" }/>TP. Hồ Chí Minh
            <option value="Đà Nẵng" ${kh.thanhPho == "Đà Nẵng" ? "selected" : "" }/>Đà Nẵng
            <option value="Cần Thơ" ${kh.thanhPho == "Cần Thơ" ? "selected" : "" }/>Cần Thơ
            <option value="Cần Thơ" ${kh.thanhPho == "Thanh Hóa" ? "selected" : "" }/>Thanh Hóa
        </form:select>
    </div>
    <div class="mb-3">
        <label class="form-label">QUOC GIA</label>
        <form:select class="form-select" aria-label="Default select example" path="quocGia" value="${kh.quocGia}">
            <option value="Hà Nội" ${kh.quocGia == "Việt Nam" ? "selected" : "" }>Việt Nam</option>
            <option value="úc" ${kh.quocGia == "Hà Lan" ? "selected" : "" }>Hà Lan</option>
            <option value="Mỹ" ${kh.quocGia == "Mỹ" ? "selected" : "" }>Mỹ</option>
            <option value="Anh" ${kh.quocGia == "Anh" ? "selected" : "" }>Anh</option>
            <option value="Hàn Quốc" ${kh.quocGia == "Hàn Quốc" ? "selected" : "" }>Hàn Quốc</option>
        </form:select>
    </div>
    <div class="mb-3">
        <label class="form-label">MAT KHAU</label>
        <form:input type="text" class="form-control" path="matKhau" value="${kh.matKhau}"/>
        <form:errors path="matKhau"/>
        <br/>
    </div>
    <button type="submit">Add</button>
</form:form>
</body>
</html>
