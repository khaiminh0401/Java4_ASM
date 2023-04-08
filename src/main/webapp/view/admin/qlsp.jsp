<%@ page language="java"
    pageEncoding="utf-8"%>
<div class="col-10">
    <div class="row">
        <form action="/Java4_ASM/admin/qlsp" class="col-5" method="post">
            <div class="mb-3">
                <label for="" class="form-label">ID:</label>
                <input type="text" class="form-control" name="id">
            </div>
            <div class="mb-3">
                <label for="" class="form-label">Tên sản phẩm</label>
                <input type="text" class="form-control" name="name">
            </div>
            <div class="mb-3">
                <label for="" class="form-label">Giá</label>
                <input type="number" class="form-control" name="price">
            </div>
            <div class="mb-3">
                <label for="" class="form-label">Ram</label>
                <select class="form-select">
                    <option selected value="8GB">8GB</option>
                    <option value="12GB">12GB</option>
                    <option value="16GB">16GB</option>
                </select>
            </div>
            <div class="mb-3">
                <label for="" class="form-label">Rom</label>
                <select class="form-select">
                    <option selected value="256GB">256GB</option>
                    <option value="512GB">512GB</option>
                    <option value="1TB">1TB</option>
                </select>
            </div>
            <div class="mb-3">
                <label for="" class="form-label">Ngày xuất bản</label>        
                <input type="date" class="form-control" name="published_date">    
            </div>
            <div class="mb-3">
                <label for="" class="form-label">Hệ điều hành</label>
                <select class="form-select">
                    <option selected value="macOS Big Sur">macOS Big Sur</option>
                    <option value="window 11">window 11</option>
                    <option value="window 10">window 10</option>
                </select>
            </div>
            <div class="mb-3">
                <label for="" class="form-label">Số lượng</label>
                <input type="number" class="form-control" name="quantity">
            </div>
            <div class="mb-3">
                <label for="" class="form-label">Logo</label>
                <input type="text" class="form-control" name="logo">
            </div>
            <div class="mb-3">
                <label for="" class="form-label">Thương hiệu</label>
                <select class="form-select">
                    <option selected value="macOS Big Sur">macOS Big Sur</option>
                    <option value="window 11">window 11</option>
                    <option value="window 10">window 10</option>
                </select>
            </div>
            <div class="mb-3">
                <label for="" class="form-label">Màu sắc</label>
                <select class="form-select">
                    <option selected value="macOS Big Sur">macOS Big Sur</option>
                    <option value="window 11">window 11</option>
                    <option value="window 10">window 10</option>
                </select>
            </div>
        </form>
        <table class="col-7">
        
        </table>
    </div>
</div>