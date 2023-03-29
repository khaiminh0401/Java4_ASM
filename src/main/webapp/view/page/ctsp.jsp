<%@ page language="java" pageEncoding="utf-8"%>
<style>
.container-detail{margin:0;padding:0 5%;background-color:#fff}.container-detail .row .col-5 .color button{margin-right:10px}.container-detail .row .col-5 .buy button{color:#fff;margin-bottom:10px;height:50px;text-transform:uppercase}.container-detail .row .col-5 .buy .btn-buy{background-color:#2fcc76;width:100%}.container-detail .row .col-7 .group-item div.item{width:80px}.container-detail .row .col-7 .group-item div.item span{font-size:small}
</style>
<div class="container-detail">
    <div class="row">
        <h4 class="name-phone">Sản phẩm ${sanpham.tensp}</h4>
        <hr class="w-100">
        <div class="col-7">
            <div id="detail-carousel" class="carousel slide" data-bs-ride="carousel">
                <div class="carousel-inner" role="listbox">
                    <div class="carousel-item active">
                        <img src="https://cdn.tgdd.vn/Products/Images/42/258047/Slider/vi-vn-samsung-galaxy-z-flip4--(1).jpg"
                            class="w-100 d-block" alt="First slide">
                    </div>
                </div>

                <button class="carousel-control-prev" type="button" data-bs-target="#detail-carousel"
                    data-bs-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Previous</span>
                </button>
                <button class="carousel-control-next" type="button" data-bs-target="#detail-carousel"
                    data-bs-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Next</span>
                </button>
            </div>
            <div class="group-item row w-100 d-flex flex-row">
                <!-- điểm nổi bật  -->
                <div class="item d-flex  flex-column justify-content-center align-items-center">
                    <button class="btn btn-default border">
                        <i class="fa-solid fa-medal"></i>
                    </button>
                    <span class="text-center">Điểm nổi bật</span>
                </div>
                <!-- hình mở hộp  -->
                <div class="item d-flex  flex-column justify-content-center align-items-center">
                    <button class="btn btn-default border">
                        <i class="fa-solid fa-box-open"></i>
                    </button>
                    <span class="text-center">Hình mở hộp</span>
                </div>
                <!-- chụp từ camera  -->
                <div class="item d-flex  flex-column justify-content-center align-items-center">
                    <button class="btn btn-default border">
                        <i class="fa-solid fa-camera"></i>
                    </button>
                    <span class="text-center">Chụp từ camera</span>
                </div>
                <!-- Hình 360 độ  -->
                <div class="item d-flex  flex-column justify-content-center align-items-center">
                    <button class="btn btn-default border">
                        <i class="fa-solid fa-arrow-rotate-right"></i>
                    </button>
                    <span class="text-center">Hình 360 độ</span>
                </div>
                <!-- thông số kỹ thuật  -->
                <div class="item d-flex  flex-column justify-content-center align-items-center">
                    <button class="btn btn-default border">
                        <i class="fa-solid fa-box"></i>
                    </button>
                    <span class="text-center">Thông số kỹ thuật</span>
                </div>
                <!-- Thông tin sản phẩm  -->
                <div class="item d-flex  flex-column justify-content-center align-items-center">
                    <button class="btn btn-default border">
                        <i class="fa-regular fa-pen-to-square"></i>
                    </button>
                    <span class="text-center">Thông tin sản phẩm</span>
                </div>
            </div>
            <div class="alert row d-flex mt-3">
                <div class="row py-3 flex-fill border rounded">
                    <div class="col-6">
                        <i class="fa-solid fa-file-circle-plus text-primary"></i>
                        <span>Hư gì đổi nấy <span class="fw-bold">12 tháng</span> tại 3384 siêu thị toàn quốc (miễn phí
                            tháng đầu)</span>
                    </div>
                    <div class="col-6">
                        <i class="fa-solid fa-shield-halved text-primary"></i>
                        <span>Bảo hành <span class="fw-bold">chính hãng điện thoại 1 năm</span> tại các trung tâm bảo
                            hành hãng</span>
                    </div>
                    <hr class="d-block mx-auto my-3" style="width:90%">
                    <div class="col-6">
                        <i class="fa-solid fa-box-archive text-primary"></i>
                        <span>Bộ sản phẩm gồm: Hộp, Sách hướng dẫn, Cây lấy sim, Cáp Type C</span>
                    </div>
                </div>
            </div>
            <!-- thông số kỹ thuật  -->
            <div class="info row">
                <p class="h3">Thông số kỹ thuật</p>
                <div class="row w-50">
                    <div class="d-block mb-3">
                        <span>Màn hình</span>
                        <span class="float-end">{{sanpham.thongsokythuat.kichco}}</span>
                    </div>
                    <div class="d-block mb-3">
                        <span>Camera trước</span>
                        <span class="float-end">{{sanpham.thongsokythuat.camera_truoc}}</span>
                    </div>
                    <div class="d-block mb-3">
                        <span>Camera sau</span>
                        <span class="float-end">{{sanpham.thongsokythuat.camera_sau}}</span>
                    </div>
                    <div class="d-block mb-3">
                        <span>RAM</span>
                        <span class="float-end">{{sanpham.thongsokythuat.ram}}</span>
                    </div>
                    <div class="d-block mb-3">
                        <span>Bộ nhớ trong</span>
                        <span class="float-end">{{sanpham.thongsokythuat.rom}}</span>
                    </div>
                    <div class="d-block mb-3">
                        <span>Dung lượng pin</span>
                        <span class="float-end">{{sanpham.thongsokythuat.dungluongpin}}</span>
                    </div>
                </div>
                
            </div>
        </div>
        <div class="col-5">
            <div class="place">
                <span>Giá tại</span>
                <!--  Modal trigger button  -->
                <button type="button" class="btn btn-default " data-bs-toggle="modal" data-bs-target="#modalPlace">
                    Hồ Chí Minh
                </button>

                <!-- Modal Body-->
                <div class="modal fade" id="modalPlace" tabindex="-1" role="dialog" aria-labelledby="modalTitleId"
                    aria-hidden="true">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="modalTitleId">Modal title</h5>
                                <button type="button" class="btn-close" data-bs-dismiss="modal"
                                    aria-label="Close"></button>
                            </div>
                            <div class="modal-body">
                                <div class="container-fluid">
                                    Add rows here
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                                <button type="button" class="btn btn-primary">Save</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <p class="price text-danger fw-bold">VNĐ</p>
            <!-- card khuyến mãi  -->
            <div class="card">
                <div class="card-header">
                    <h6>Khuyến mãi</h6>
                    <span>Gía và khuyến mãi dự kiến áp dụng đến 23:00 | 31/01</span>
                </div>
                <div class="card-body">
                    <ul class="nav justify-content-start align-items-start flex-column">
                        <li class="nav-item">
                            <span class="nav-link">
                                <span class="badge bg-primary">1</span>
                                <span class="text-dark">Tặng gói Bảo hiểm mở rộng Samsung Care+ 6 tháng</span>
                            </span>
                        </li>
                        <li class="nav-item">
                            <span class="nav-link">
                                <span class="badge bg-primary">2</span>
                                <span class="text-dark">Phiếu mua hàng trị giá 50.000đ áp dụng mua sim</span>
                            </span>
                        </li>
                        <li class="nav-item">
                            <span class="nav-link">
                                <span class="badge bg-primary">3</span>
                                <span class="text-dark">Thu cũ Đổi mới: Giảm đến 8 triệu (Giảm ngay 3 triệu + Hỗ trợ 5
                                    triệu, tùy model máy cũ, không kèm giảm giá khác)</span>
                            </span>
                        </li>
                        <li class="nav-item">
                            <span class="nav-link">
                                <span class="badge bg-primary">4</span>
                                <span class="text-dark">Giảm thêm 5% khi mua cùng sản phẩm bất kỳ có giá trị cao
                                    hơn</span>
                            </span>
                        </li>
                        <li class="nav-item">
                            <span class="nav-link">
                                <span class="badge bg-primary">5</span>
                                <span class="text-dark">Cơ hội trúng 2023 chỉ vàng (trị giá 5.5 triệu/giải)</span>
                            </span>
                        </li>
                    </ul>
                </div>
            </div>
            <p><span class="text-primary"><i class="fa fa-map" aria-hidden="true"></i> Chọn địa chỉ nhận hàng</span> để
                biết thời gian giao</p>
            <p class="text-primary"><i class="fa fa-shopping-cart" aria-hidden="true"></i> Xem siêu thị có hàng</p>
            <div class="buy">
                <button class="btn btn-default btn-buy">Mua ngay</button>
                <div class="w-100 d-flex flex-row" style="gap:10px">
                    <button class="flex-fill btn btn-primary p-0" >Thêm vào giỏ hàng</button>
                    <button class="flex-fill btn btn-primary p-0">Trả góp qua thẻ <br>Visa, Mastercard,JCB,Amex</button>
                </div>
                <p class="text-center">Gọi đặt mua <span class="text-primary">1800.1060</span> từ ngày 25/1 (Mùng 4 Tết)
                </p>
            </div>
        </div>
    </div>
</div>