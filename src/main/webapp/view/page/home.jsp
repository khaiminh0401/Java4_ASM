<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<style>
.option-promo {
	display: flex;
	list-style: none
}

.option-promo li {
	background-image:
		url("https://cdn.tgdd.vn/mwgcart/mwg-site/ContentMwg/images/newyear2023/Background/bg-danh-muc-desktop.png");
	background-repeat: no-repeat;
	background-size: 100% 100%;
	width: calc(33.3333333333% - 16px);
	margin-right: 20px;
	background-color: #fff;
	border-radius: 12px;
	padding: 15px 0
}

.option-promo li a img {
	display: inline-block;
	vertical-align: middle;
	width: auto;
	height: 70px
}

.option-promo li a {
	display: block;
	overflow: hidden;
	text-decoration: none;
	padding-left: 30px
}

.option-promo li a span {
	display: inline-block;
	vertical-align: middle;
	overflow: hidden;
	color: #222;
	font-size: 22px;
	line-height: 28px;
	text-align: left;
	margin-left: 10px;
	max-width: 65%
}

.big-baner {
	overflow: hidden
}

.big-baner img {
	width: 100%;
	height: -moz-max-content;
	height: max-content
}

#carouselMain {
	width: 70%;
	display: block;
	margin: 0 auto
}

.carousel-inner {
	border-radius: 30px
}

.section-deal img {
	width: 100%
}

.col-1 {
	width: 10%
}

.box-list {
	position: relative
}

.box-list::after {
	position: absolute
}

.name-box {
	overflow: hidden;
	line-height: 36px;
	font-size: 22px;
	padding: 15px
}

.name-box::before {
	content: "";
	background-size: 100%;
	width: 48px;
	height: 48px;
	position: absolute;
	top: 0;
	left: 0;
	background-image:
		url("https://cdn.tgdd.vn/mwgcart/mwg-site/ContentMwg/images/newyear2023/Icon/mut.png")
}

.name-box::after {
	content: "";
	width: 128px;
	height: 50px;
	position: absolute;
	right: 135px;
	top: 0;
	background-size: 100%;
	background-image:
		url("https://cdn.tgdd.vn/mwgcart/mwg-site/ContentMwg/images/newyear2023/Background/bg-top1-danh-muc-noi-bat.png");
	background-repeat: no-repeat
}

.img-respon {
	width: 50% !important
}

@media screen and (max-width: 768px) {
	.option-promo {
		flex-direction: row;
		flex-wrap: wrap;
		align-items: center
	}
	.option-promo li {
		width: calc(50% - 32px);
		padding: 16px;
		margin: 16px
	}
	.option-promo li a img {
		height: 50px
	}
	.box-list .row .col-1 {
		width: 20%
	}
	.img-respon {
		height: 200px
	}
	.card-title {
		font-size: .9rem
	}
}
</style>
<div class="container-fluid" ng-controller="homeCtrl">
	<div class="big-baner">
		<img
			src="https://cdn.tgdd.vn/2023/01/banner/LiveBanner-Bighero---TGDD-minn-1920x450.png"
			alt="">
	</div>
	<div class="body">
		<div id="carouselMain" class="carousel slide" data-bs-ride="carousel">
			<ol class="carousel-indicators">
				<li data-bs-target="#carouselMain" data-bs-slide-to="0"
					class="active" aria-current="true" aria-label="First slide"></li>
				<li data-bs-target="#carouselMain" data-bs-slide-to="1"
					aria-label="Second slide"></li>
				<li data-bs-target="#carouselMain" data-bs-slide-to="2"
					aria-label="Third slide"></li>
			</ol>
			<div class="carousel-inner" role="listbox">
				<div class="carousel-item active">
					<img
						src="https://cdn.tgdd.vn/2022/12/banner/vivo-tet720-220-720x220-2.webp"
						class="w-100 d-block" alt="First slide">
				</div>
				<div class="carousel-item ">
					<img
						src="https://cdn.tgdd.vn/2023/01/banner/720-220-720x220-10.png"
						class="w-100 d-block" alt="Second slide">
				</div>
				<div class="carousel-item">
					<img
						src="https://cdn.tgdd.vn/2022/12/banner/reno8-tet-720-220-720x220-2.webp"
						class="w-100 d-block" alt="Third slide">
				</div>
			</div>
			<button class="carousel-control-prev" type="button"
				data-bs-target="#carouselMain" data-bs-slide="prev">
				<i class="fa-solid fa-circle-chevron-left" style="font-size: 40px;"></i>
				<span class="visually-hidden">Previous</span>
			</button>
			<button class="carousel-control-next" type="button"
				data-bs-target="#carouselMain" data-bs-slide="next">
				<i class="fa-solid fa-circle-chevron-right" style="font-size: 40px;"></i>

				<span class="visually-hidden">Next</span>
			</button>
		</div>
		<ul class="option-promo">
			<li><a href="https://www.thegioididong.com/samsung"> <img
					width="50" height="50"
					data-src="https://cdn.tgdd.vn//content/Frame-46604--1--120x120-1.png"
					class=" ls-is-cached lazyloaded" alt="Samsung Giảm Sốc"
					src="https://cdn.tgdd.vn//content/Frame-46604--1--120x120-1.png">
					<span> Samsung Giảm Sốc </span>
			</a></li>
			<li><a href="https://www.thegioididong.com/dong-ho-gia-soc">
					<img width="50" height="50"
					data-src="https://cdn.tgdd.vn//content/NEW-YEAR-ICON-120x120.gif"
					class=" lazyloaded" alt="Đồng hồSale đến 70%"
					src="https://cdn.tgdd.vn//content/NEW-YEAR-ICON-120x120.gif">
					<span> Đồng hồ<br>Sale đến 70%
				</span>
			</a></li>
			<li><a href="https://www.thegioididong.com/laptop-gia-soc">
					<img width="50" height="50"
					data-src="https://cdn.tgdd.vn//content/icon-laptop-xa-kho-100x100-1.png"
					class=" lazyloaded" alt="Laptop xả kho"
					src="https://cdn.tgdd.vn//content/icon-laptop-xa-kho-100x100-1.png">
					<span> Laptop xả kho </span>
			</a></li>
			<li><a href="/may-doi-tra/"> <img width="50" height="50"
					data-src="https://cdn.tgdd.vn//content/icon-TGDD-OF-100x100.gif"
					class=" lazyloaded" alt="Máy cũGiảm đến 50%"
					src="https://cdn.tgdd.vn//content/icon-TGDD-OF-100x100.gif">
					<span> Máy cũ<br>Giảm đến 50%
				</span>
			</a></li>

		</ul>
		<section class="section-deal bg-warning pb-5">
			<img
				src="https://cdn.tgdd.vn/2023/01/banner/Banner-hotsale-1200x120-1.png"
				alt="">
			<div id="carouselProduct" class="carousel slide mt-5"
				data-bs-ride="carousel">
				<ol class="carousel-indicators">
					<li data-bs-target="#carouselProduct" data-bs-slide-to="0"
						class="active" aria-current="true" aria-label="First slide"></li>
					<li data-bs-target="#carouselProduct" data-bs-slide-to="1"
						aria-label="Second slide"></li>
				</ol>
				<div class="carousel-inner" role="listbox">
					<%--                 <c:forEach var="sp" items="${sp}">
                    <div class="carousel-item active">
                        <div class="row d-flex justify-content-around">
                            <div class="card col-5">
                                <img class="card-img-top pt-2 d-block mx-auto img-respon" src="${ }"
                                    alt="Card image cap">
                                <div class="card-body">
                                    <h4 class="card-title">${sp.getSanPham().getName()}</h4>
                                    <p class="card-text fw-bold text-danger">${sp.getSanPham().getPrice()}</p>
                                </div>
                            </div>
                        </div>
                    </div>
                    </c:forEach> --%>
					<!--  <div class="carousel-item">
                        <div class="row d-flex justify-content-around">
                            <div class="card col-5" ng-repeat="sp in sanpham | limitTo: 2:2">
                                <img class="card-img-top pt-2 d-block mx-auto img-respon" src="{{sp.hinhanh}}"
                                    alt="Card image cap">
                                <div class="card-body">
                                    <h4 class="card-title">{{sp.tensp}}</h4>
                                    <p class="card-text fw-bold text-danger">{{sp.giasp | currency:"":0}}</p>
                                </div>
                            </div>
                        </div>
                    </div> -->
				</div>
				<button class="carousel-control-prev" type="button"
					data-bs-target="#carouselProduct" data-bs-slide="prev">
					<i class="fa-solid fa-circle-chevron-left text-dark"
						style="font-size: 3rem;"></i> <span class="visually-hidden">Previous</span>
				</button>
				<button class="carousel-control-next" type="button"
					data-bs-target="#carouselProduct" data-bs-slide="next">
					<i class="fa-solid fa-circle-chevron-right text-dark"
						style="font-size: 3rem;"></i> <span class="visually-hidden">Next</span>
				</button>
			</div>
		</section>
		<section class="bg-light box-list my-5 p-5 pt-0">
			<strong class="name-box">DANH MỤC NỔI BẬT</strong>
			<div class="row px-4 d-flex justify-content-around"
				style="font-size: 0.8rem;">
				<div class="card border-0 bg-light col-1">
					<div class="card-body text-center">
						<img src="https://cdn.tgdd.vn//content/Laptop-129x129.png"
							style="height: 60px;" alt="hình"> <span class="card-text">Laptop</span>
					</div>
				</div>
				<div class="card border-0 bg-light col-1">
					<div class="card-body text-center">
						<img src="https://cdn.tgdd.vn//content/Tablet-128x129.png"
							style="height: 60px;" alt="hình"> <span class="card-text">Tablet</span>
					</div>
				</div>
				<div class="card border-0 bg-light col-1">
					<div class="card-body text-center">
						<img
							src="https://cdn.tgdd.vn//content/Donghothongminh-128x129.png"
							style="height: 60px;" alt="hình"> <span class="card-text">Đồng
							hồ thông minh</span>
					</div>
				</div>
				<div class="card border-0 bg-light col-1">
					<div class="card-body text-center">
						<img src="https://cdn.tgdd.vn//content/icon-DTGR-30x30.png"
							style="height: 60px;" alt="hình"> <span class="card-text">Điện
							thoại độc quyền</span>
					</div>
				</div>
				<div class="card border-0 bg-light col-1">
					<div class="card-body text-center">
						<img
							src="https://cdn.tgdd.vn//content/Donghothoitrang-128x129.png"
							style="height: 60px;" alt="hình"> <span class="card-text">Đồng
							hồ thời trang</span>
					</div>
				</div>
				<div class="card border-0 bg-light col-1">
					<div class="card-body text-center">
						<img src="https://cdn.tgdd.vn//content/icon-may-cu-60x60.png"
							style="height: 60px;" alt="hình"> <span class="card-text">Máy
							cũ giá rẻ</span>
					</div>
				</div>
				<div class="card border-0 bg-light col-1">
					<div class="card-body text-center">
						<img src="https://cdn.tgdd.vn//content/Oplung-128x128.png"
							style="height: 60px;" alt="hình"> <span class="card-text">Ốp
							lưng</span>
					</div>
				</div>

				<div class="card border-0 bg-light col-1">
					<div class="card-body text-center">
						<img src="https://cdn.tgdd.vn//content/chuot-128x129.png"
							style="height: 60px;" alt="hình"> <span class="card-text">Chuột
							máy tính</span>
					</div>
				</div>
				<div class="card border-0 bg-light col-1">
					<div class="card-body text-center">
						<img src="https://cdn.tgdd.vn//content/ban-phim-128x129.png"
							style="height: 60px;" alt="hình"> <span class="card-text">Bàn
							phím</span>
					</div>
				</div>
				<div class="card border-0 bg-light col-1">
					<div class="card-body text-center">
						<img src="https://cdn.tgdd.vn//content/Simthecao-129x129.png"
							style="height: 60px;" alt="hình"> <span class="card-text">Sim,
							Thẻ cào</span>
					</div>
				</div>
			</div>
			<div class="row px-4 d-flex justify-content-around"
				style="font-size: 0.8rem;">
				<div class="card border-0 bg-light col-1">
					<div class="card-body text-center">
						<img src="https://cdn.tgdd.vn//content/Loa-128x128.png"
							style="height: 60px;" alt="hình"> <span class="card-text">Loa</span>
					</div>
				</div>
				<div class="card border-0 bg-light col-1">
					<div class="card-body text-center">
						<img src="https://cdn.tgdd.vn//content/Tainghe-128x129.png"
							style="height: 60px;" alt="hình"> <span class="card-text">Tai
							nghe</span>
					</div>
				</div>
				<div class="card border-0 bg-light col-1">
					<div class="card-body text-center">
						<img src="https://cdn.tgdd.vn//content/Sacduphong-128x129.png"
							style="height: 60px;" alt="hình"> <span class="card-text">Sạc
							dự phòng</span>
					</div>
				</div>
				<div class="card border-0 bg-light col-1">
					<div class="card-body text-center">
						<img src="https://cdn.tgdd.vn//content/Capsac-129x129.png"
							style="height: 60px;" alt="hình"> <span class="card-text">Cáp
							sạc</span>
					</div>
				</div>
				<div class="card border-0 bg-light col-1">
					<div class="card-body text-center">
						<img src="https://cdn.tgdd.vn//content/Maytinhbo-128x129.png"
							style="height: 60px;" alt="hình"> <span class="card-text">Máy
							tính bộ</span>
					</div>
				</div>

				<div class="card border-0 bg-light col-1">
					<div class="card-body text-center">
						<img src="https://cdn.tgdd.vn//content/Mayin-128x129.png"
							style="height: 60px;" alt="hình"> <span class="card-text">Máy
							in</span>
					</div>
				</div>

				<div class="card border-0 bg-light col-1">
					<div class="card-body text-center">
						<img src="https://cdn.tgdd.vn//content/Manhinhmaytinh-128x129.png"
							style="height: 60px;" alt="hình"> <span class="card-text">Màn
							hình máy tính</span>
					</div>
				</div>
				<div class="card border-0 bg-light col-1">
					<div class="card-body text-center">
						<img src="https://cdn.tgdd.vn//content/Phukiengaming-128x129.png"
							style="height: 60px;" alt="hình"> <span class="card-text">Phụ
							kiện gaming</span>
					</div>
				</div>
				<div class="card border-0 bg-light col-1">
					<div class="card-body text-center">
						<img src="https://cdn.tgdd.vn//content/icon-camera-128x129.png"
							style="height: 60px;" alt="hình"> <span class="card-text">Camera,
							Webcam</span>
					</div>
				</div>
				<div class="card border-0 bg-light col-1">
					<div class="card-body text-center">
						<img src="https://cdn.tgdd.vn//content/may-chieu-icon-128x129.png"
							style="height: 60px;" alt="hình"> <span class="card-text">Thiết
							bị nhà thông minh</span>
					</div>
				</div>
			</div>
		</section>
		<div class=" container">
			<div class="row">
				<c:forEach var="sp" items="${sp}">
					<div class="col-lg-3 p-2">
						<div class="card">
							<a href="/Java4_ASM/ctsp?masp=${sp.getId()}"
								style="text-decoration: none;"> <img class="w-75 h-75"
								src="${sp.getLogo()}">
								<div class="card-body">
									<h4 class="card-title">${sp.getName()}</h4>
									<p class="card-text fw-bold text-danger">
										<fmt:setLocale value="vi_VN" />
										<fmt:formatNumber value="${sp.getPrice()}" type="currency" />
									</p>
								</div>
							</a>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
		<section style="height: 300px;">
			<h4>CHUYÊN GIA THƯƠNG HIỆU</h4>
			<div class="row">
				<img class="col-4" style="border-radius: 25px;"
					src="https://cdn.tgdd.vn/2022/11/banner/samsung-390-210--1--390x210.png"
					alt=""> <img class="col-4" style="border-radius: 25px;"
					src="https://cdn.tgdd.vn/2023/01/banner/4138F801-4823-44D5-B626-32025C4D329C-390x210.png"
					alt=""> <img class="col-4" style="border-radius: 25px;"
					src="https://cdn.tgdd.vn/2023/01/banner/Mac-390x210.png" alt="">
			</div>
		</section>
		<section style="height: 300px;">
			<h4>CHUỖI MỚI DEAL KHỦNG</h4>
			<div class="row">
				<img class="col-4" style="border-radius: 25px;"
					src="https://cdn.tgdd.vn/2023/01/banner/760-400-760x400-7.png"
					alt=""> <img class="col-4" style="border-radius: 25px;"
					src="https://cdn.tgdd.vn/2023/01/banner/Component-30-380x200-2.png"
					alt=""> <img class="col-4" style="border-radius: 25px;"
					src="https://cdn.tgdd.vn/2023/01/banner/760x400-760x400-5.png"
					alt="">
			</div>
		</section>
	</div>
</div>