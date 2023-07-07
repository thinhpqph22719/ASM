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
<form:form action="/chi-tietsp/update/${ctsp.id}" method="post" modelAttribute="ctsp">
    <div class="col-3">
        <label class="form-label">TEN SP</label>
        <form:select type="text" class="form-control" path="sanPham">
            <c:forEach items="${dsSanPham}" var="sp">
                <option value="${sp.id}" ${sp.id == ctsp.sanPham.id?'selected = "selected"':''}>${sp.ma} - ${sp.ten}</option>
            </c:forEach>
        </form:select>
    </div>
    <div class="col-3">
        <label class="form-label">TEN NSX</label>
        <form:select type="text" class="form-control" path="nsx">
            <c:forEach items="${dsNSX}" var="nsxx">
                <option value="${nsxx.id}" ${nsxx.id == ctsp.nsx.id?'selected = "selected"':''}>${nsxx.ma} - ${nsxx.ten}</option>
            </c:forEach>
        </form:select>
    </div>
    <div class="col-3">
        <label class="form-label">TEN MAU SAC</label>
        <form:select type="text" class="form-control" path="mauSac">
            <c:forEach items="${dsMauSac}" var="ms">
                <option value="${ms.id}" ${ms.id == ctsp.mauSac.id?'selected = "selected"':''}>${ms.ma} - ${ms.ten}</option>
            </c:forEach>
        </form:select>
    </div>
    <div class="col-3">
        <label class="form-label">TEN DONG SP</label>
        <form:select type="text" class="form-control" path="dongSP">
            <c:forEach items="${dsDongSP}" var="dsp">
                <option value="${dsp.id}" ${dsp.id == ctsp.dongSP.id?'selected = "selected"':''}>${dsp.ma} - ${dsp.ten} </option>
            </c:forEach>
        </form:select>
    </div>
    <div class="col-3">
        <label class="form-label">NAM BH</label>
        <form:input type="text" class="form-control" path="namBH" value="${ctsp.namBH}"/>
    </div>
    <div class="col-3">
        <label class="form-label">MO TA</label>
        <form:input type="text" class="form-control" path="moTa" value="${ctsp.moTa}"/>
    </div>
    <div class="col-3">
        <label class="form-label">SO LUONG TON</label>
        <form:input type="text" class="form-control" path="soLuongTon" value="${ctsp.soLuongTon}"/>
    </div>
    <div class="col-3">
        <label class="form-label">GIA NHAP</label>
        <form:input type="text" class="form-control" path="giaNhap" value="${ctsp.giaNhap}"/>
    </div>
    <div class="col-3">
        <label class="form-label">GIA BAN</label>
        <form:input type="text" class="form-control" path="giaBan" value="${ctsp.giaBan}"/>
    </div>
    <button type="submit">Update</button>
</form:form>
</body>
</html>