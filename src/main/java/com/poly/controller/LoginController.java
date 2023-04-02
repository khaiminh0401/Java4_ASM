package com.poly.controller;

import java.io.IOException;

import com.poly.dao.SanPhamDao;
import com.poly.dao.UserDao;
import com.poly.entity.SanPhamEntity;
import com.poly.entity.UserEntity;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class LoginController implements InterfaceController {
	@Override
	public void methodGET(HttpServletRequest req, HttpServletResponse res) {
//		try {
//			req.getRequestDispatcher("/view/page/login.jsp").forward(req, res);
//		} catch (ServletException | IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

	@Override
	public void methodPOST(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
//		String method = req.getMethod();
//		if (method.equalsIgnoreCase("POST")) {
			String id = req.getParameter("username");
			String pw = req.getParameter("password");
			try {
				UserDao dao = new UserDao();
				UserEntity user = dao.findById(id);
				if (!user.getPassword().equals(pw)) {
					req.setAttribute("message", "Sai tên đăng nhập hoặc mật khẩu!");
				} else {
					req.setAttribute("message", "Đăng nhập thành công!");
					req.getSession().setAttribute("user", user);
					 res.sendRedirect(req.getContextPath() + "/Java4_ASM");
				}
			} catch (Exception e) {
				req.setAttribute("message", "Lỗi!");
			}
//		}
	}

	@Override
	public void methodPUT(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub

	}

	@Override
	public void methodDELETE(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub

	}
}
