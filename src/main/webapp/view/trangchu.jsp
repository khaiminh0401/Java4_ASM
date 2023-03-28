<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<title>Insert title here</title>
<%@include file="./commons/import.jsp"%>
</head>

<body>
	<div class="container" style="margin-top: 100px;">
		<div class="justify-content-end d-flex mb-4">
			<input class="rounded-pill" type="search" name="search" id="">
			<Button class="rounded-pill">Tìm Kiếm</Button>
		</div>
		<div class="row">
			<div class="col-lg-3">
				<div class="card">
					<div class="card">
						<div class="card-header">
							<a href="#collagse" class="text-dark text-decoration-none"
								data-bs-toggle="collapse" role="button" aria-expanded="false"
								aria-controls="collapseExample"> <i class="fa fa-list"
								aria-hidden="true"></i> <strong><span class="bi-list"></span>Thương
									Hiệu</strong>
							</a>
						</div>
						<div class="list-group collapse show" id="collagse">
							<a href="" class="list-group-item">Acer</a> <a href=""
								class="list-group-item">Asus</a>
						</div>
					</div>
					<div class="card my-3">
						<div class="card-header">
							<a href="#collagse" class="text-dark text-decoration-none"
								data-bs-toggle="collapse" role="button" aria-expanded="false"
								aria-controls="collapseExample"> <i class="fa fa-list"
								aria-hidden="true"></i> <strong><span class="bi-list"></span>Màu
									Sắc</strong>
							</a>
						</div>
						<div class="list-group collapse show" id="collagse">
							<a href="" class="list-group-item">Xanh</a> <a href=""
								class="list-group-item">Đỏ</a>
						</div>
					</div>
					<div class="card my-3">
						<div class="card-header">
							<a href="#collagse" class="text-dark text-decoration-none"
								data-bs-toggle="collapse" role="button" aria-expanded="false"
								aria-controls="collapseExample"> <i class="fa fa-list"
								aria-hidden="true"></i> <strong><span class="bi-list"></span>Màu
									Sắc</strong>
							</a>
						</div>
						<div class="list-group collapse show" id="collagse">
							<a href="" class="list-group-item">Xanh</a> <a href=""
								class="list-group-item">Đỏ</a>
						</div>
					</div>
				</div>
			</div>
			<div class="col-lg-9 row">
				<div class="card bg-primary col-lg-3 mx-1">
					<div class="card-body">
						<img src="" alt="">
					</div>
					<div class="card-footer">
						<h3>San Pham</h3>
						<p>Gia</p>
					</div>
				</div>
				<div class="card bg-primary col-lg-3 mx-1">
					<div class="card-body">
						<img src="" alt="">
					</div>
					<div class="card-footer">
						<h3>San Pham</h3>
						<p>Gia</p>
					</div>
				</div>
				<div class="card bg-primary col-lg-3 mx-1">
					<div class="card-body">
						<img src="" alt="">
					</div>
					<div class="card-footer">
						<h3>San Pham</h3>
						<p>Gia</p>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>

</html>