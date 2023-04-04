<%@ page language="java" pageEncoding="utf-8"%>
<style>
.btn-default{margin-right:10px}.img-thuonghieu{width:auto;height:20px;vertical-align:middle}.container-dtdd{background-color:#fff}.star{color:#ff4500}
</style>
<div class="container-dtdd">
    <div class="row g-2 mt-3">
        <div class="col-8">
            <div id="carouselDTDD" class="carousel slide" data-bs-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-bs-target="#carouselDTDD" data-bs-slide-to="0" class="active" aria-current="true"
                        aria-label="First slide"></li>
                    <li data-bs-target="#carouselDTDD" data-bs-slide-to="1" aria-label="Second slide"></li>
                    <li data-bs-target="#carouselDTDD" data-bs-slide-to="2" aria-label="Third slide"></li>
                </ol>
                <div class="carousel-inner" role="listbox">
                    <div class="carousel-item active">
                        <img src="https://cdn.tgdd.vn/2023/01/banner/Zflip-Fold-Tet-800-200-800x200.png"
                            class="w-100 d-block" alt="First slide">
                    </div>
                    <div class="carousel-item">
                        <img src="https://cdn.tgdd.vn/2022/12/banner/A96-tet-800-200-800x200.webp" class="w-100 d-block"
                            alt="Second slide">
                    </div>
                    <div class="carousel-item">
                        <img src="https://cdn.tgdd.vn/2023/01/banner/Xiaomi-tet-800-200-800x200-1.png"
                            class="w-100 d-block" alt="Third slide">
                    </div>
                </div>
                <button class="carousel-control-prev" type="button" data-bs-target="#carouselDTDD" data-bs-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Previous</span>
                </button>
                <button class="carousel-control-next" type="button" data-bs-target="#carouselDTDD" data-bs-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Next</span>
                </button>
            </div>
        </div>
        <div class="col-4 ">
            <img src="https://cdn.tgdd.vn/2022/07/banner/390-97-390x97-3.png" alt="" class="w-100 d-block pb-2">
            <img src="https://cdn.tgdd.vn/2022/12/banner/sticky-a57-copy-390x97-2.webp" alt="" class="w-100 d-block">
        </div>
    </div>
    <div class="dtdd-body w-100">
        <!-- button dropdown filter -->
        <div class="d-flex flex-row justify-content-start">
            <!--  Modal trigger button  -->
            <button type="button" class="btn btn-default border" data-bs-toggle="modal" data-bs-target="#modalId"><i
                    class="fa fa-filter" aria-hidden="true"></i> Bộ lọc</button>

            <!-- Modal Body-->
            <div class="modal fade" id="modalId" tabindex="-1" role="dialog" aria-labelledby="modalTitleId"
                aria-hidden="true">
                <div class="modal-dialog w-75" style="max-width:none" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="modalTitleId">Bộ lọc</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div class="modal-body">
                            <div class="container-fluid">
                                <div class="row price">
                                    <div class="col-4">
                                        <h6>Giá</h6>
                                        <button class="btn btn-default border">Dưới 2 triệu</button>
                                        <button class="btn btn-default border">Từ 2 - 4 triệu</button>
                                        <button class="btn btn-default border">Từ 4 - 7 triệu</button>
                                        <button class="btn btn-default border">Từ 7 - 13 triệu</button>
                                        <button class="btn btn-default border">Từ 13 - 20 triệu</button>
                                        <button class="btn btn-default border">Trên 20 triệu</button>
                                    </div>
                                    <div class="col-4">
                                        <h6>Loại điện thoại</h6>
                                        <button class="btn btn-default border">Android</button>
                                        <button class="btn btn-default border">iPhone (iOS)</button>
                                        <button class="btn btn-default border">Điện thoại phổ thông</button>
                                    </div>
                                    <div class="col-4">
                                        <h6>Nhu cầu</h6>
                                        <button class="btn btn-default border">Chơi game/ Cấu hình cao</button>
                                        <button class="btn btn-default border">Chụp ảnh, quay phim</button>
                                        <button class="btn btn-default border">Mỏng nhẹ</button>
                                        <button class="btn btn-default border">Nhỏ gọn</button>
                                    </div>
                                </div>
                                <div class="row thongsokythuat">
                                    <div class="col-4">
                                        <h6>RAM</h6>
                                        <button class="btn btn-default border">2 GB</button>
                                        <button class="btn btn-default border">3 GB</button>
                                        <button class="btn btn-default border">4 GB</button>
                                        <button class="btn btn-default border">6 GB</button>
                                        <button class="btn btn-default border">8 GB</button>
                                        <button class="btn btn-default border">12 GB</button>
                                    </div>
                                    <div class="col-4">
                                        <h6>Dung lượng lưu trữ</h6>
                                        <button class="btn btn-default border">32 GB</button>
                                        <button class="btn btn-default border">64 GB</button>
                                        <button class="btn btn-default border">128 GB</button>
                                        <button class="btn btn-default border">256 GB</button>
                                        <button class="btn btn-default border">512 GB</button>
                                        <button class="btn btn-default border">1 TB</button>
                                    </div>
                                    <div class="col-4">
                                        <h6>Pin & Sạc</h6>
                                        <button class="btn btn-default border">Pin khủng trên 5000 mAh</button>
                                        <button class="btn btn-default border">Sạc nhanh (từ 18W)</button>
                                        <button class="btn btn-default border">Sạc siêu nhanh (từ 33W)</button>
                                        <button class="btn btn-default border">Sạc không dây</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                            <button type="button" class="btn btn-primary">Tìm</button>
                        </div>
                    </div>
                </div>
            </div>
            <!-- dropdown Gia -->
            <div class="dropdown open">
                <button class="btn btn-default border dropdown-toggle" type="button" id="dropdown-gia"
                    data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Giá
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdown-gia">
                    <button class="dropdown-item" href="#">Action</button>
                    <button class="dropdown-item disabled" href="#">Disabled action</button>
                </div>
            </div>
            <!-- dropdown Loai dien thoai -->
            <div class="dropdown open">
                <button class="btn btn-default border dropdown-toggle" type="button" id="dropdown-loaidt"
                    data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Loại điện thoại
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdown-loaidt">
                    <button class="dropdown-item" >Android</button>
                    <button class="dropdown-item">iOS</button>
                    <button class="dropdown-item">Điện thoại phổ thông</button>
                </div>
            </div>
            <!-- dropdown Nhu cầu -->
            <div class="dropdown open">
                <button class="btn btn-default border dropdown-toggle" type="button" id="dropdown-nhucau"
                    data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Nhu cầu
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdown-nhucau">
                    <button class="dropdown-item" href="#">Chơi game/ Cấu hình cao</button>
                    <button class="dropdown-item" href="#">Chụp ảnh, quay phim</button>
                    <button class="dropdown-item" href="#">Mỏng nhẹ</button>
                    <button class="dropdown-item" href="#">Nhỏ gọn dễ cầm</button>
                </div>
            </div>
            <!-- dropdown ram -->
            <div class="dropdown open">
                <button class="btn btn-default border dropdown-toggle" type="button" id="dropdown-ram"
                    data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Ram
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdown-ram">
                    <button class="dropdown-item" href="#">4GB</button>
                    <button class="dropdown-item" href="#">6GB</button>
                    <button class="dropdown-item" href="#">8GB</button>
                    <button class="dropdown-item" href="#">12GB</button>
                </div>
            </div>
        </div>
        <!-- button thương hiệu -->
        <div class="d-flex flex-row justify-content-start mt-3 w-100 flex-wrap">
            <a class="btn btn-default border mb-2" href="#!dtdd?th={{th.mathuonghieu}}&page=1" style="background-color: white;padding: 6px 13px;"
                ng-repeat="th in thuonghieu"><img src="{{th.logo}}" class="img-thuonghieu" alt=""></a>
        </div>
        <!-- div phone -->
        <section class="box-phone w-100 mt-2">
            <div class="row d-flex flex-row" style="width: inherit;">
                <div class="card col-4" ng-repeat="sp in sanpham | limitTo:6:begin">
                    <img class="card-img-top img-fluid mt-2" src="{{sp.hinhanh}}" alt="Title">
                    <div class="card-body">
                       <a class="nav-link" href="#!dtdd/{{sp.tensp}}"><h4  class="card-title">{{sp.tensp}}</h4></a> 
                        <p class="card-text">{{sp.giasp | currency:"":0}} VNĐ</p>
                        <p class="star">
                            <i class="fa-solid fa-star"></i>
                            <i class="fa-solid fa-star"></i>
                            <i class="fa-solid fa-star"></i>
                            <i class="fa-solid fa-star"></i>
                            <i class="fa-solid fa-star text-secondary"></i>
                        <span class="text-dark"> 300</span>
                        </p>
                    </div>
                </div>
            </div>
            <nav aria-label="Page navigation" class="float-end">
              <ul class="pagination    ">
                <li class="page-item disabled">
                  <a class="page-link" href="#" aria-label="Previous">
                    <span aria-hidden="true">&laquo;</span>
                  </a>
                </li>
                <li class="page-item {{$index ==(begin/6) ? 'active':''}}"  ng-repeat ="pg in getIndexPage(page) track by $index"><a class="page-link" href="#!dtdd?th={{th}}&page={{$index+1}}" >{{$index +1}}</a></li>
                <li class="page-item">
                  <a class="page-link" href="#" aria-label="Next">
                    <span aria-hidden="true">&raquo;</span>
                  </a>
                </li>
              </ul>
            </nav>
        </section>
    </div>

</div>