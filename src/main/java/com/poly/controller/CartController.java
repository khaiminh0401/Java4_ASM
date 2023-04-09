package com.poly.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.poly.commons.CookieUtils;
import com.poly.dao.GioHangDao;
import com.poly.dao.SanPhamDao;
import com.poly.dao.UserDao;
import com.poly.entity.GioHangEntity;
import com.poly.entity.SanPhamEntity;
import com.poly.entity.UserEntity;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CartController implements InterfaceController {
	public static String magh = "";
	GioHangDao dao = new GioHangDao();
	List<GioHangEntity> gh;
	GioHangEntity ghEntity;
	UserEntity user;

	@Override
	public boolean methodGET(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
//		user = (UserEntity) req.getSession().getAttribute("user");
		if (req.getParameter("kh") != null) {
			gh = dao.findAllGH(Integer.parseInt(req.getParameter("kh")));
			req.setAttribute("gh", gh);
			this.methodDELETE(req, res);
		}
		return false;
	}

	@Override
	public boolean methodPOST(HttpServletRequest req, HttpServletResponse res) {
		user = (UserEntity) req.getSession().getAttribute("user");
		if (user != null) {
			String masp = CtspController.masp;
			SanPhamDao daoSP = new SanPhamDao();
			SanPhamEntity sp = daoSP.getById(Integer.parseInt(masp));
			UserDao daoUser = new UserDao();
			UserEntity User = daoUser.findById(String.valueOf(user.getId()));
			try {
//			check
				String a = "";
				gh = dao.findAllGH(user.getId());
				for (int i = 0; i < gh.size(); i++) {
					if (gh.get(i).getSanPham().getId() == Integer.parseInt(masp)
							&& gh.get(i).getUsers().getId() == user.getId()) {
						System.out.println("Đã tồn tại");
						a = "1";
						this.methodGET(req, res);
						break;
					}
				}
				if (a == "") {
					GioHangEntity gh = new GioHangEntity();
					gh.setMau(null);
					gh.setSanPham(sp);
					gh.setSoluong(1);
					gh.setUsers(User);
					GioHangDao dao = new GioHangDao();
					dao.InsertGH(gh);
					System.out.println("thanh cong");
					this.methodGET(req, res);
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("loi");
			}
		}
		return false;
	}

	@Override
	public boolean methodPUT(HttpServletRequest req, HttpServletResponse res) {
		return false;
		// TODO Auto-generated method stub

	}

	@Override
	public boolean methodDELETE(HttpServletRequest req, HttpServletResponse res) {
		if (magh != null) {
			ghEntity = dao.getById(Integer.parseInt(magh));
			dao.delete(ghEntity);
			user = (UserEntity) req.getSession().getAttribute("user");
			if (user != null) {
				gh = dao.findAllGH(user.getId());
				req.setAttribute("gh", gh);
				System.out.println("delete thanh cong");
			}
		}
		return true;
	}

}
