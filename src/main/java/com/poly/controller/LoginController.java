package com.poly.controller;

import java.io.IOException;

import com.poly.commons.CookieUtils;
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
		// đọc giá trị của cookie
		String username = CookieUtils.get("username", req);
		String password = CookieUtils.get("password", req);
		req.setAttribute("username", username);
		req.setAttribute("password", password);
	}

	@Override
	public void methodPOST(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
			String id = req.getParameter("username");
			String pw = req.getParameter("password");
			String remember = req.getParameter("remember");
			try {
				UserDao dao = new UserDao();
				UserEntity user = dao.findById(id);
				if (!user.getPassword().equals(pw)) {
					req.setAttribute("message", "Sai tên đăng nhập hoặc mật khẩu!");
				} else {
					req.setAttribute("message", "Đăng nhập thành công!");
					// set cookie ko có set sesion à nha. nghiệp vụ để nhớ đăng nhập nó dùng cookie
					// coi lab 7 hay lab 3 gì quên rồi
					// lam tiếp đi với lưu cookie xong đẩy lên
					
					int hours = (remember == null) ? 0 : 15*24; // 0 = xóa
					CookieUtils.add("username", id, hours, res);
					CookieUtils.add("password", pw, hours, res);
					res.sendRedirect("/Java4_ASM");
					return;
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
