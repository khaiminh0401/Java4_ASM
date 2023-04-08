<%@ page language="java"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="col-10">
    <div class="row">
        <form action="/Java4_ASM/admin/qlsp" class="col-5" method="post">
            <div class="mb-3 row">
                <label for="" class="col-sm-4 col-form-label">ID:</label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" name="id">
                </div>
            </div>
            <div class="mb-3 row">
                <label for="" class="col-sm-4 col-form-label">Tên sản phẩm</label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" name="name">
                </div>
            </div>
            <div class="mb-3 row">
                <label for="" class="col-sm-4 col-form-label">Giá</label>
                <div class="col-sm-8">
                    <input type="number" class="form-control" name="price">
                </div>
            </div>
            <div class="mb-3 row">
                <label for="" class="col-sm-4 col-form-label">Ram</label>
                <select class="col-sm-8 form-select ">
                    <option selected value="8GB">8GB</option>
                    <option value="12GB">12GB</option>
                    <option value="16GB">16GB</option>
                </select>
            </div>
            <div class="mb-3 row">
                <label for="" class="col-sm-4 col-form-label">Rom</label>
                <select class="form-select col-sm-8">
                    <option selected value="256GB">256GB</option>
                    <option value="512GB">512GB</option>
                    <option value="1TB">1TB</option>
                </select>
            </div>
            <div class="mb-3 row">
                <label for="" class="col-sm-4 col-form-label">Ngày xuất bản</label>   
                <div class="col-sm-8">
                    <input type="date" class="form-control" name="published_date">    
                </div>     
            </div>
            <div class="mb-3 row">
                <label for="" class="col-sm-4 col-form-label">Hệ điều hành</label>
                <select class="form-select col-sm-8">
                    <option selected value="macOS Big Sur">macOS Big Sur</option>
                    <option value="window 11">window 11</option>
                    <option value="window 10">window 10</option>
                </select>
            </div>
            <div class="mb-3 row">
                <label for="" class="col-sm-4 col-form-label">Số lượng</label>
                <div class="col-sm-8">
                    <input type="number" class="form-control" name="quantity">
                </div>
            </div>
            <div class="mb-3 row">
                <label for="" class="col-sm-4 col-form-label">Logo</label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" name="logo">
                </div>
            </div>
            <div class="mb-3 row">
                <label for="" class="col-sm-4 col-form-label">Thương hiệu</label>
                <select class="form-select col-sm-8">
                    <option selected value="null">--none--</option>
                    <c:forEach var="th" items="${thuonghieu}">
                        <option value="${th.id}">${th.name}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="mb-3 row">
                <label for="" class="col-sm-2 col-form-label">Màu sắc</label>
                <select class="form-select col-sm-8">
                    <option selected value="null">--none--</option>
                    <c:forEach var="m" items="${mau}">
                        <option value="${m.id}">${m.name}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="mb-3">
                <button class="btn btn-success">Thêm</button>
                <button class="btn btn-info">Cập nhật</button>
                <button class="btn btn-danger">Xóa</button>
            </div>
        </form>
        <div class="table-responsive col-7">
            <table class="table table-hover">
                <thead class="table-dark">
                    <tr>
                        <th scope="col">ID</th>
                        <th scope="col">Tên sản phẩm</th>
                        <th scope="col">Số lượng</th>
                        <th>Giá</th>
                        <th>Ngày sản xuất</th>
                    </tr>
                </thead>
                <tbody>
                    <tr class="">
                        <td scope="row">R1C1</td>
                        <td>R1C2</td>
                        <td>R1C3</td>
                    </tr>
                    <tr class="">
                        <td scope="row">Item</td>
                        <td>Item</td>
                        <td>Item</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>