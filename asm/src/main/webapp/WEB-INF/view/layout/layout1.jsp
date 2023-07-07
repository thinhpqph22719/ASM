<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">

<html>
<head>
    <title>Title</title>
</head>
<body>
<nav class="navbar navbar-expand-lg bg-body-tertiary" >
    <div class="col-12" style="background: #12d084">
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <a class="navbar-brand" href="#">Trang Chủ</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/khach-hang/hien-thi">Khách Hàng</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/san-pham/hien-thi">Sản Phẩm</a>
                </li>
                <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="/mau-sac/hien-thi">Màu Sắc</a>
            </li>
                <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="/dong-sp/hien-thi">Dòng Sản Phẩm</a>
            </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/nsx/hien-thi">NSX</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/chi-tietsp/hien-thi">Chi Tiêt SP</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/nhan-vien/hien-thi">Nhân Viên</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/cua-hang/hien-thi">Cửa Hầng</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/chuc-vu/hien-thi">Chúc Vụ</a>
                </li>

            <form class="d-flex" role="search" style="margin-top: 10px" >
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
                </div>
        </div>
    </div>
</nav>
<div class="row mt-10" style="min-height: 500px;">
    <div class="col-3" style="background: antiquewhite">
    </div>
    <div class="col-9">
        <jsp:include page="${ view }" />

    </div>
</div>
</body>
</html>