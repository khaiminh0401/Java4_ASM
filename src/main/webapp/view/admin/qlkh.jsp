<%@ page language="java"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="col-10">
    <h4>Quản lí sản phẩm</h4>
    <div class="row mt-5">
        <form action="/Java4_ASM/admin/qlsp" class="col-3" method="post">
            <div class="mb-3 row">
                <label for="" class="col-sm-4 col-form-label">ID:</label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" name="id" value="${user2.id}">
                </div>
            </div>
            <div class="mb-3 row">
                <label for="" class="col-sm-4 col-form-label">Fullname</label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" name="fullname" value="${user2.fullname}">
                </div>
            </div>
            <div class="mb-3 row">
                <label for="" class="col-sm-4 col-form-label">Password</label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" name="password" value="${user2.password}">
                </div>
            </div>
            <div class="mb-3 row">
                <label for="" class="col-sm-4 col-form-label">Email</label>
                <div class="col-sm-8">
                    <input type="email" class="form-control" name="email" value="${user2.email}">
                </div>
            </div>
            <div class="mb-3 row">
                <label for="" class="col-sm-4 col-form-label">Phone</label>
                <div class="col-sm-8">
                    <input type="number" class="form-control" name="phone" value="${user2.phone}">
                </div>
            </div>
            <div class="mb-3 row">
                <label for="" class="col-sm-4 col-form-label">Role</label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" name="admin" value="${user2.admin}">
                </div>
            </div>
            <div class="mb-3">
                <button class="btn btn-success">Thêm</button>
                <button class="btn btn-info">Cập nhật</button>
                <button class="btn btn-danger">Xóa</button>
            </div>
        </form>
        <div class="col-9">
            <form action="">
                <div class="mb-3">
                    <div class="input-group">
                        <input type="text" class="form-control">
                        <button class="btn btn-primary">Tìm kiếm</button>
                    </div>
                </div>
            </form>
            <div class="table-responsive">
                <table class="table table-hover">
                    <thead class="table-dark">
                        <tr>
                            <th scope="col">ID</th>
                            <th scope="col">Fullname</th>
                            <th scope="col">Password</th>
                            <th>Email</th>
                            <th>Phone</th>
                            <th>Role</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="user" items="${user}">
                   				<tr class="" >
                                <td>${user.id}</td>
                                <td>${user.fullname}</td>
                                <td>${user.password}</td>
                                <td>${user.email}</td>
                                <td>${user.phone}</td>
                                <td>${user.admin==false?"Khách Hàng":""}</td>
                                <td><a class="text-decoration-none text-danger" href="/Java4_ASM/admin/qlkh?makh=${user.id}">Sửa</a></td>
                            </tr>
                        </c:forEach>

                    </tbody>
                </table>
            </div>
        </div>
        
    </div>
</div>