<%@ page language="java" pageEncoding="utf-8"%>
<section class="vh-100 col-12" style="background-color: #508bfc;">
	<div class="container py-5 h-100">
		<div
			class="row d-flex justify-content-center align-items-center h-100">
			<div class="col-12 col-md-8 col-lg-6 col-xl-5">
				<div class="card shadow-2-strong" style="border-radius: 1rem;">
					<div class="card-body p-5 text-center">
						<h3 class="mb-5">Đăng nhập admin</h3>
						<form action="/Java4_ASM/admin/login" method="post">
							<div class="form-outline mb-4">
								<input type="text" id="typeEmailX-2" name="id" class="form-control " />
								<label class="form-label" for="typeEmailX-2">Tài khoản</label>
							</div>

							<div class="form-outline mb-4">
								<input type="password" id="typePasswordX-2" name="password" class="form-control" />
								<label class="form-label" for="typePasswordX-2">Mật khẩu</label>
							</div>

							<!-- Checkbox -->
							<div class="form-check d-flex justify-content-start mb-4">
								<input class="form-check-input" type="checkbox" value="" name="isAdmin"
									id="form1Example3" /> <label class="form-check-label"
									for="form1Example3"> Nhớ mật khẩu </label>
							</div>

							<button class="btn btn-primary btn-lg btn-block" type="submit">Đăng
								nhập</button>

							<hr class="my-4">

							<button class="btn btn-lg btn-block btn-primary"
								style="background-color: #dd4b39;" type="submit">
								<i class="fab fa-google me-2"></i> Đăng nhập với google
							</button>
							<button class="btn btn-lg btn-block btn-primary mb-2"
								style="background-color: #3b5998;" type="submit">
								<i class="fab fa-facebook-f me-2"></i>Đăng nhập với facebook
							</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>