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
<form:form action="/nhan-vien/update/${nv.id}" method="post" modelAttribute="nv">
    <h3>Update Nhan Vien</h3>

    <div class="mb-3">
        <label class="form-label">MA</label>
        <form:input type="text" class="form-control" path="ma" value="${nv.ma}"/>
    </div>
    <div class="mb-3">
        <label class="form-label">HO</label>
        <form:input type="text" class="form-control" path="ho" value="${nv.ho}"/>
    </div>
    <div class="mb-3">
        <label class="form-label">TEN DEM</label>
        <form:input type="text" class="form-control" path="tenDem" value="${nv.tenDem}"/>
    </div>
    <div class="mb-3">
        <label class="form-label">TEN</label>
        <form:input type="text" class="form-control" path="ten" value="${nv.ten}"/>
    </div>
    <label class="form-label">GIOI TINH</label>
    <div class="md-3">
        <form:radiobutton class="form-check-input" path="gioiTinh" value="true" checked="true"/>Nam
        <form:radiobutton class="form-check-input" path="gioiTinh" value="false"/>Nữ
    </div>
    <div class="mb-3">
        <label class="form-label">DIA CHI</label>
        <form:input type="text" class="form-control" path="diaChi" value="${nv.diaChi}"/>
    </div>
    <div class="mb-3">
        <label class="form-label">SDT</label>
        <form:input type="text" class="form-control" path="sdt" value="${nv.sdt}"/>
    </div>
    <div class="mb-3">
        <label class="form-label">MAT KHAU</label>
        <form:input type="text" class="form-control" path="matKhau" value="${nv.matKhau}"/>
    </div>
    <label class="form-label">Trang Thai</label>
    <div class="mb-3">
        <form:radiobutton class="form-check-input" path="trangThai" value="1"/>Hoạt Động
        <form:radiobutton class="form-check-input" path="trangThai" value="0"/>Ngừng Hoạt Động
    </div>
    <div class="mb-3">
        <label class="form-label">Cua Hang</label>
        <form:select type="text" class="form-control" path="cuaHang">
            <c:forEach items="${dsCuaHang}" var="ch">
                <option value="${ch.id}" ${ch.id == nv.cuaHang.id?'selected = "selected"':''}>${ch.ma}</option>
            </c:forEach>
        </form:select>
    </div>
    <div class="mb-3">
        <label class="form-label">Chuc Vu</label>
        <form:select type="text" class="form-control" path="chucVu">
            <c:forEach items="${dsChucVu}" var="cv">
                <option value="${cv.id}" ${cv.id == nv.chucVu.id?'selected = "selected"':''}>${cv.ma}</option>
            </c:forEach>
        </form:select>
    </div>
    <button type="submit">Update</button>
</form:form>
</body>
</html>