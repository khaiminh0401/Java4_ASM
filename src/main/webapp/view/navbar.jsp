<%@ page language="java" pageEncoding="utf-8"%>
<style>
.logo{width:100%}#nav-header::before{background:url("https://cdn.tgdd.vn/mwgcart/mwg-site/ContentMwg/images/newyear2023/Background/hoa-mai.png");background-repeat:no-repeat;background-size:100%}.button-nav{background-color:#2fcc76 !important}.header{width:28%}.color-custom>*{color:#2fcc76}.button-link{padding:0px 21px;text-align:center;color:#000;text-decoration:none}.navbar-link{display:flex;flex-direction:row;flex-wrap:wrap;justify-content:space-between;width:100%}.nav-link{color:black}
</style>
<nav class="navbar navbar-expand-md navbar-warning" style="background-color: white;" ng-controller="navCtrl"id="nav-header">
    <div class="container">
        <a class="navbar-brand me-5" style="width:10%" href="/Java4_ASM"><img class="logo img-fluid" src="https://media.istockphoto.com/id/1280464957/vector/cpo-letter-for-your-best-business-symbol.jpg?s=612x612&w=0&k=20&c=3UJtNY4MrHwZK4ekSD6jrbrXzGhjNommKpHwAK0MSh4=" alt="logo"></a>
        <button class="navbar-toggler d-lg-none" type="button" data-bs-toggle="collapse"
            data-bs-target="#collapsibleNavId" aria-controls="collapsibleNavId" aria-expanded="false"
            aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="collapsibleNavId">
            <ul class="navbar-nav me-3 mt-2 mt-lg-0">
                <form class="d-flex my-2 my-lg-0">
                    <button class="btn btn-default my-2 my-sm-0 me-sm-2 button-nav"  type="button">Xem giá, tồn kho tại: <span class="fw-bold">Hồ Chí Minh</span></button>
                    <div class="input-group">
                        <input class="form-control " type="text" placeholder="Search">
                        <button class="btn btn-default bg-light my-2 my-sm-0" type="submit"><i class="fa fa-search" aria-hidden="true"></i></button>
                    </div>
                </form>
            </ul>
            <div class="d-flex">
                <a class="btn btn-default button-nav p-2 mx-2" ng-if="khachhang" href="#!cart/{{khachhang.makh}}"><i class="fa fa-cart-arrow-down" aria-hidden="true"></i> Giỏ hàng</a>
                <div class="header d-flex align-items-center" >
                    <div class="dropdown open" ng-if="khachhang">
                        <a class="button-link dropdown-toggle" style="cursor: pointer;"  id="dropdownKH" data-bs-toggle="dropdown" aria-haspopup="true"
                                aria-expanded="false">
                                   <i class="fa fa-user-circle" aria-hidden="true"></i> ${{khachhang.tenkh}}
                                </a>
                        <div class="dropdown-menu" aria-labelledby="dropdownKH">
                            <a class="dropdown-item" href="#!profile">Thông tin cá nhân</a>
                            <a class="dropdown-item" href="#!changePassword/{{khachhang.makh}}">Đổi mật khẩu</a>
                            <button class="dropdown-item" ng-click="logout()">Đăng xuất</button>
                        </div>
                    </div>
                    <!-- <a href="#" ng-if="khachhang" class="button-link" style="width: max-content;">{{khachhang.tenkh}}</a> -->
                    <a href="/Java4_ASM/login" ng-if="!khachhang" class="button-link">Đăng nhập</a>
                    <a href="#!register" ng-if="!khachhang" class="button-link">Đăng ký</a>
                </div>
            </div>

        </div>
    </div>
</nav>
<nav class="navbar navbar-expand-md  navbar-warning  pt-0 " style="background-color: white;">
      <div class="container">
        <!-- <a class="navbar-brand" href="#">Danh mục:</a> -->
        <button class="navbar-toggler d-lg-none" type="button" data-bs-toggle="collapse" data-bs-target="#collapsibleNav" aria-controls="collapsibleNavId"
            aria-expanded="false" aria-label="Toggle navigation">
            Danh mục
            <!-- <span class="navbar-toggler-icon"></span> -->
        </button>
        <div class="collapse color-custom navbar-collapse" id="collapsibleNav">
            <ul class="navbar-nav navbar-link me-auto mt-2 mt-lg-0">
                <li class="nav-item">
                    <a class="nav-link" href="/Java4_ASM/laptop"><i class="fa-solid fa-laptop"></i> Laptop</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#"><i class="fa-solid fa-tablet"></i> Tablet</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="dropdownId" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa-solid fa-headphones"></i> Phụ kiện</a>
                    <div class="dropdown-menu" aria-labelledby="dropdownId">
                        <a class="dropdown-item" href="#">Action 1</a>
                        <a class="dropdown-item" href="#">Action 2</a>
                    </div>
                </li>
                <li class="nav-item">
                    <a href="" class="nav-link"><i class="bi bi-smartwatch"></i> Smartwatch</a>
                </li>
                <li class="nav-item">
                    <a href="" class="nav-link"><i class="bi bi-watch"></i> Đồng hồ</a>
                </li>
                <li class="nav-item">
                    <a href="" class="nav-link"><i class="fa-solid fa-mobile-retro"></i> Máy cũ giá rẻ</a>
                </li>
                <li class="nav-item">
                    <a href="" class="nav-link"><i class="fa-solid fa-desktop"></i> PC, Máy in</a>
                </li>
                <li class="nav-item">
                    <a href="" class="nav-link">Sim, Thẻ cào</a>
                </li>
                <li class="nav-item">
                    <a href="" class="nav-link">Dịch vụ, tiện ích</a>
                </li>
            </ul>
        </div>
  </div>
</nav>


