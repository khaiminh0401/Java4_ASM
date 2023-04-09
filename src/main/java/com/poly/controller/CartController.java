package com.poly.controller;

import java.io.IOException;
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

	@Override
	public void methodGET(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		int username = Integer.parseInt(CookieUtils.get("username", req));
		GioHangDao dao = new GioHangDao();
		List<GioHangEntity> gh = dao.findAllGH(username);
		req.setAttribute("gh", gh);

	}

	@Override
	public void methodPOST(HttpServletRequest req, HttpServletResponse res) {
		int username = Integer.parseInt(CookieUtils.get("username", req));
		String masp = CtspController.masp;
		SanPhamDao daoSP = new SanPhamDao();
		SanPhamEntity sp = daoSP.getById(Integer.parseInt(masp));
		UserDao daoUser = new UserDao();
		UserEntity User = daoUser.findById(String.valueOf(username));
		try {
//			check
			String a = "";
			GioHangDao daoGH = new GioHangDao();
			List<GioHangEntity> gh2 = daoGH.findAllGH(username);
			for (int i = 0; i < gh2.size(); i++) {
				if (gh2.get(i).getSanPham().getId() == Integer.parseInt(masp)
						&& gh2.get(i).getUsers().getId() == username) {
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

	@Override
	public void methodPUT(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub

	}

	@Override
	public void methodDELETE(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub

	}

}
