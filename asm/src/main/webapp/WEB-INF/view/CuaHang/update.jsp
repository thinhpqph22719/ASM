<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">

<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/cua-hang/update/${ch.id}" method="post" modelAttribute="ch">
    <h3>Update Cua Hang</h3>

    <div class="mb-3">
        <label class="form-label">MA</label>
    <form:input type="text" class="form-control" path="ma" value="${ch.ma}"/>
    </div>
    <div class="mb-3">
        <label class="form-label">TEN</label>
        <form:input type="text" class="form-control" path="ten" value="${ch.ten}"/>
    </div>
    <div class="mb-3">
        <label class="form-label">DIACHI</label>
        <form:input type="text" class="form-control" path="diaChi" value="${ch.diaChi}"/>
    </div>
    <div class="mb-3">
        <label class="form-label">THANH PHO</label>
        <form:select class="form-select" aria-label="Default select example" path="thanhPho" value="${ch.thanhPho}">
            <option value="Hà Nội" ${ch.thanhPho == "Hà Nội" ? "selected" : "" }/>Hà Nội
            <option value="TP. Hồ Chí Minh" ${ch.thanhPho == "TP. Hồ Chí Minh" ? "selected" : "" }/>TP. Hồ Chí Minh
            <option value="Đà Nẵng" ${ch.thanhPho == "Đà Nẵng" ? "selected" : "" }/>Đà Nẵng
            <option value="Cần Thơ" ${ch.thanhPho == "Cần Thơ" ? "selected" : "" }/>Cần Thơ
            <option value="Cần Thơ" ${ch.thanhPho == "Thanh Hóa" ? "selected" : "" }/>Thanh Hóa
        </form:select>
    </div>
    <div class="mb-3">
        <label class="form-label">QUOC GIA</label>
        <form:select class="form-select" aria-label="Default select example" path="quocGia" value="${ch.quocGia}">
            <option value="Hà Nội" ${ch.quocGia == "Việt Nam" ? "selected" : "" }>Việt Nam</option>
            <option value="úc" ${ch.quocGia == "Hà Lan" ? "selected" : "" }>Hà Lan</option>
            <option value="Mỹ" ${ch.quocGia == "Mỹ" ? "selected" : "" }>Mỹ</option>
            <option value="Anh" ${ch.quocGia == "Anh" ? "selected" : "" }>Anh</option>
            <option value="Anh" ${ch.quocGia == "Hàn Quốc" ? "selected" : "" }>Hàn Quốc</option>
        </form:select>
    </div>
    <button type="submit">UPDATE</button>
</form:form>
</body>
</html>