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
	public boolean methodGET(HttpServletRequest req, HttpServletResponse res) {
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
		return false;
	}

	@Override
	public boolean methodPOST(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		String id = req.getParameter("id");
		String pw = req.getParameter("password");
		boolean remember = (req.getParameter("remember") !=null);
		System.out.println(remember);
		boolean isAdmin = Boolean.valueOf(req.getParameter("isAdmin"));
		try {
			UserEntity checkEntity = em.find(UserEntity.class, id);
			if (checkEntity != null) {
//				System.out.println("không tồn tại username này");
				if (checkEntity.getPassword().equals(pw)) {
					if (checkEntity.isAdmin() == isAdmin) {
						req.setAttribute("message", "Đăng nhập thành công!");
						int hours = (remember == false) ? 0 : 15 * 24; // 0 = xóa
						CookieUtils.add("user", id, hours, res);
						CookieUtils.add("tenkh", checkEntity.getFullname(), hours, res);
						CookieUtils.add("password", pw, hours, res);
						res.sendRedirect("/Java4_ASM");
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
		return true;

//		}
	}

	@Override
	public boolean methodPUT(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean methodDELETE(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		return true;
	}
}
