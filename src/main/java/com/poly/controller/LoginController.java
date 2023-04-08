package com.poly.controller;

import java.io.IOException;

import org.apache.commons.beanutils.BeanUtils;

import com.poly.commons.CookieUtils;
import com.poly.commons.EntityManagerUtils;
import com.poly.dao.SanPhamDao;
import com.poly.dao.UserDao;
import com.poly.entity.SanPhamEntity;
import com.poly.entity.UserEntity;

import jakarta.persistence.EntityManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginController implements InterfaceController {
	EntityManager em = EntityManagerUtils.getEntityManager();

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
		String id = req.getParameter("id");
		String pw = req.getParameter("password");
		String remember = req.getParameter("remember");
		boolean isAdmin = Boolean.valueOf(req.getParameter("isAdmin"));
		try {
			UserEntity checkEntity = em.find(UserEntity.class, id);
			if (checkEntity != null) {
//				System.out.println("không tồn tại username này");
				if (checkEntity.getPassword().equals(pw)) {
					if (checkEntity.isAdmin() == isAdmin) {
						req.setAttribute("message", "Đăng nhập thành công!");
						int hours = (remember == null) ? 0 : 15 * 24; // 0 = xóa
						CookieUtils.add("username", id, hours, res);
						CookieUtils.add("password", pw, hours, res);
						
					
						res.sendRedirect("/Java4_ASM");
						return;
					} else {
						req.setAttribute("message", "Chọn đúng quyền hạn!");
					}
				} else {
					req.setAttribute("message", "Sai tên đăng nhập hoặc mật khẩu!");
				}
			}
		} catch (Exception e) {
			req.setAttribute("message", e);
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
