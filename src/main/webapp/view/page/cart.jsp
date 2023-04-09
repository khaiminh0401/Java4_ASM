<%@ page language="java"  pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<style>
.container-cart{background-color:#fff !important}.custom-header{border-right:var(--bs-card-border-width) solid var(--bs-card-border-color);border-bottom:none}
</style>
<div class="container-cart">
    <section class="h-100">
        <div class="container h-100 py-5">
            <div class="row d-flex justify-content-center align-items-center h-100">
                <div class="col-10">

                    <div class="d-flex justify-content-between align-items-center mb-4">
                        <h3 class="fw-normal mb-0 text-black">Giỏ hàng</h3>
                        <div>
                            <p class="mb-0"><span class="text-muted">Sort by:</span> <a href="#!" class="text-body">price <i class="fas fa-angle-down mt-1"></i></a></p>
                        </div>
                    </div>
					<c:forEach var="gh" items="${gh}">
	                    <div class="card d-flex flex-row rounded-3 mb-4" ng-repeat="giohang in cart ">
	                        <div class="card-header custom-header d-flex flex-column justify-content-center">
	                            <input type="checkbox" ng-model="giohang.isChon">
	                        </div>
	                        <div class="card-body p-4">
	                            <div class="row d-flex justify-content-between align-items-center">
	                                <div class="col-md-2 col-lg-2 col-xl-2">
	                                    <img src="${gh.getSanPham().getLogo()}" class="img-fluid rounded-3"
	                                        alt="${gh.getSanPham().getName()}">
	                                </div>
	                                <div class="col-md-3 col-lg-3 col-xl-3">
	                                    <p class="lead fw-normal mb-2">${gh.getSanPham().getName()}</p>
	                                    <p><span class="text-muted">Màu:
	                                        </span>{}</p>
	                                </div>
	                                <div class="col-md-3 col-lg-3 col-xl-2 d-flex">
	                                    <button class="btn btn-link px-2"
	                                    ng-click="changeNumber(giohang.magiohang,giohang.soluong,'-')">
	                                        <i class="fas fa-minus"></i>
	                                    </button>
	
	                                    <input  min="0" name="quantity"
	                                        value="${gh.getSoluong()}" type="number"
	                                        class="form-control form-control-sm" />
	
	                                    <!-- <button class="btn btn-link px-2"
	                                        onclick="this.parentNode.querySelector('input[type=number]').stepUp()">
	                                        <i class="fas fa-plus"></i>
	                                    </button> -->
	                                    <button class="btn btn-link px-2"
	                                        ng-click="changeNumber(giohang.magiohang,giohang.soluong,'+')">
	                                        <i class="fas fa-plus"></i>
	                                    </button>
	                                </div>
	                                <div class="col-md-3 col-lg-2 col-xl-2 offset-lg-1">
	                                	<h5 class="mb-0">
	                                		<fmt:setLocale value="vi_VN" />
											<fmt:formatNumber value="${gh.getSanPham().getPrice()}" type="currency" />
	                                    </h5>
	                                </div>
	                                <div class="col-md-1 col-lg-1 col-xl-1 text-end"> 	
	                                    <button onclick="deleteGH()" class="text-danger"><a href="/Java4_ASM/cart"><i
	                                            class="fas fa-trash fa-lg"></i></a></button>
	                                </div>
	                            </div>
	                        </div>
	                    </div>
					</c:forEach>
                    <div class="card">
                        <div class="card-body">
                            <a href="#!order" ng-click="toOrder()" class="btn btn-default btn-block float-end btn-lg"
                                style="background-color:#2fcc76">Tiếp tục</a>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </section>
</div>
<script type="text/javascript">
	function deleteGH(){
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
			url: "/Java4_ASM/cart?"+$("#form").serialize(),
			async:false,
			data:{},
			success: function(data, textStatus, jqXHR) {
			 	alert('everything was OK');
			}
		});  
	}
</script>