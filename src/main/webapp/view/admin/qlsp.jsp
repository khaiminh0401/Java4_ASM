<%@ page language="java"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<div class="col-10">
    <h4>Quản lí sản phẩm</h4>
    <div class="row mt-5">
        <form action="/Java4_ASM/admin/qlsp" id="form" class="col-3" method="post">
            <div class="mb-3 row">
                <label for="" class="col-sm-4 col-form-label">ID:</label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" name="id" value="${sp.id}">
                </div>
            </div>
            <div class="mb-3 row">
                <label for="" class="col-sm-4 col-form-label">Tên sản phẩm</label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" name="name" value="${sp.name}">
                </div>
            </div>
            <div class="mb-3 row">
                <label for="" class="col-sm-4 col-form-label">Giá</label>
                <div class="col-sm-8">
<%--                 	<fmt:setLocale value="en"/>
 --%>                	<fmt:formatNumber type="number" pattern="0" value="${sp.price}" var="price"/>
                    <input type="number" class="form-control" step="100000" name="price" value="${price}">
                </div>
            </div>
            <div class="mb-3 row">
                <label for="" class="col-sm-4 col-form-label">Ram</label>
                <div class="col-sm-8">
                    <select class="form-select" name="ram">
                        <option ${sp.ram=='8GB'?"selected":"" } value="8GB">8GB</option>
                        <option ${sp.ram=='12GB'?"selected":"" } value="12GB">12GB</option>
                        <option ${sp.ram=='16GB'?"selected":"" } value="16GB">16GB</option>
                    </select>
                </div>

            </div>
            <div class="mb-3 row">
                <label for="" class="col-sm-4 col-form-label">Rom</label>
                <div class="col-sm-8">
                    <select class="form-select" name="rom">
                        <option ${sp.rom=='256GB'?"selected":"" }  value="256GB">256GB</option>
                        <option ${sp.rom=='512GB'?"selected":"" }  value="512GB">512GB</option>
                        <option ${sp.rom=='1TB'?"selected":"" }  value="1TB">1TB</option>
                    </select>
                </div>
            </div>
            <div class="mb-3 row">
                <label for="" class="col-sm-4 col-form-label">Màn hình</label>
                <div class="col-sm-8">
                    <select class="form-select" name="screen">
                        <option ${sp.screen=='14 inch'?"selected":"" }  value="14inch">14inch</option>
                        <option ${sp.screen=='15.6 inch'?"selected":"" } value="15.6inch">15.6inch</option>
                    </select>
                </div>
            </div>
            <div class="mb-3 row">
                <label for="" class="col-sm-4 col-form-label">Ngày xuất bản</label>   
                <div class="col-sm-8">
                    <input type="date" class="form-control" name="published_date" value="${sp.published_date}">    
                </div>     
            </div>
            <div class="mb-3 row">
                <label for="" class="col-sm-4 col-form-label">Hệ điều hành</label>
                <div class="col-sm-8">
                    <select class="form-select" name="hdh">
                        <option ${sp.hdh=='macOS Big Sur'?"selected":"" } value="macOS Big Sur">macOS Big Sur</option>
                        <option ${sp.hdh=='window 11'?"selected":"" } value="window 11">window 11</option>
                        <option ${sp.hdh=='window 10'?"selected":"" } value="window 10">window 10</option>
                    </select>
                </div>
            </div>
            <div class="mb-3 row">
                <label for="" class="col-sm-4 col-form-label">Số lượng</label>
                <div class="col-sm-8">
                	<fmt:formatNumber type="number" pattern="0" value="${sp.quantity}" var="quantity"/>
                    <input type="number" class="form-control" name="quantity" value="${quantity}">
                </div>
            </div>
            <div class="mb-3 row">
                <label for="" class="col-sm-4 col-form-label">Logo</label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" name="logo" value="${sp.logo}">
                </div>
            </div>
            <div class="mb-3 row">
                <label for="" class="col-sm-4 col-form-label">Thương hiệu</label>
                <div class="col-sm-8">
                    <select class="form-select" name="mathuonghieu">
                        <option selected value="null">--none--</option>
                        <c:forEach var="th" items="${thuonghieu}">
                            <option ${th.id==sp.getThuongHieu().id?"selected":""} value="${th.id}">${th.name}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>
            <div class="mb-3 row">
                <label for="" class="col-sm-4 col-form-label">Màu sắc</label>
                <div class="col-sm-8">
                    <select class="form-select" name="mamau">
                        <option selected value="null">--none--</option>
                        <c:forEach var="m" items="${mau}">
                            <option ${m.id==sp.getMau().id?"selected":""} value="${m.id}">${m.name}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>
            <div class="mb-3">
                <button type="submit" class="btn btn-success">Thêm</button>
                <a href="/Java4_ASM/admin/qlsp" onclick="update()" class="btn btn-info">Cập nhật</a>
                <a href="/Java4_ASM/admin/qlsp" onclick="deleteSP()" class="btn btn-danger">Xóa</a>
            </div>
        </form>
        
        <div class="col-9">
<<<<<<< HEAD
<<<<<<< HEAD
=======
            <form action="/Java4_ASM/admin/qlsp" method="get">
                <div class="mb-3">
                    <div class="input-group">
                        <input type="text" class="form-control" name="search" value="${search}">
                        <button class="btn btn-primary">Tìm kiếm</button>
=======
>>>>>>> origin/master
        <label> ${message }</label>
            <form action="">
                <div class="mb-3">
                    <div class="input-group">
                        <input type="text" class="form-control" name="search">
                        <button type="submit" class="btn btn-primary">Tìm kiếm</button>
                      
<<<<<<< HEAD
=======
            <form action="/Java4_ASM/admin/qlsp" method="get">
                <div class="mb-3">
                    <div class="input-group">
                        <input type="text" class="form-control" name="search" value="${search}">
                        <button class="btn btn-primary">Tìm kiếm</button>
=======
>>>>>>> origin/master
>>>>>>> origin/master
                    </div>
                </div>
            </form>
            <div class="table-responsive">
                <table class="table table-hover">
                    <thead class="table-dark">
                        <tr>
                            <th scope="col">ID</th>
                            <th scope="col">Tên sản phẩm</th>
                            <th scope="col">Số lượng</th>
                            <th>Giá</th>
                            <th>Ngày sản xuất</th>
                            <th>Hệ điều hành</th>
                            <th>Ram</th>
                            <th>Rom</th>
                            <th>Màn hình</th>
                            <th>Thương hiệu</th>
                            <th>Màu sắc</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="sp" items="${sanpham}">
                   				<tr class="" >
                                <td>${sp.id}</td>
                                <td>${sp.name}</td>
                                <td>${sp.quantity}</td>
                                <td>			 <fmt:setLocale value = "vi_VN"/>
         <fmt:formatNumber value = "${sp.price}" type = "currency"/></td>
                                <td>${sp.published_date}</td>
                                <td>${sp.hdh}</td>
                                <td>${sp.ram}</td>
                                <td>${sp.rom}</td>
                                <td>${sp.screen}</td>
                                <td>${sp.getThuongHieu().name}</td>
                                <td>${sp.getMau().name}</td>
                                <td><a class="text-decoration-none text-danger" href="/Java4_ASM/admin/qlsp?masp=${sp.id}">Sửa</a></td>
                            </tr>
                        </c:forEach>

                    </tbody>
                </table>
            </div>
        </div>
        
    </div>
</div>
<script type="text/javascript">
	function update(){
		var obj = {};
		$("#form").serializeArray().forEach(s=>{
			obj = {...obj,[s.name]:s.value};
		})
		console.log(1);
/* 		$("#form").attr("method","put");
		$("#form").submit(); */
/* 		await axios.put("/Java4_ASM/admin/qlsp?"+$("#form").serialize());
 */  		$.ajax({
			type: "PUT",
			url: "/Java4_ASM/admin/qlsp?"+$("#form").serialize(),
			async:false,
			data:{},
			success: function(data, textStatus, jqXHR) {
			 	alert('everything was OK');
			}
		});  
	}
	function deleteSP(){
		var obj = {};
		$("#form").serializeArray().forEach(s=>{
			obj = {...obj,[s.name]:s.value};
		})
		console.log(1);
/* 		$("#form").attr("method","put");
		$("#form").submit(); */
/* 		await axios.put("/Java4_ASM/admin/qlsp?"+$("#form").serialize());
 */  		$.ajax({
			type: "DELETE",
			url: "/Java4_ASM/admin/qlsp?"+$("#form").serialize(),
			async:false,
			data:{},
			success: function(data, textStatus, jqXHR) {
			 	alert('everything was OK');
			}
		});  
	}
</script>