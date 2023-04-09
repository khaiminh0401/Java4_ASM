package com.poly.controller;

import com.poly.commons.CookieUtils;
import com.poly.dao.GioHangDao;
import com.poly.dao.SanPhamDao;
import com.poly.dao.UserDao;
import com.poly.entity.GioHangEntity;
import com.poly.entity.SanPhamEntity;
import com.poly.entity.UserEntity;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CtspController implements InterfaceController {
	
		public static String masp ="";

	@Override
	public boolean methodGET(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		SanPhamDao dao = new SanPhamDao();
		masp=req.getParameter("masp");
		System.out.println(req.getParameter("masp"));
		SanPhamEntity entity = dao.getById(Integer.parseInt(req.getParameter("masp")));
		req.setAttribute("sanpham", entity);
		return false;
	}

	@Override
	public boolean methodPOST(HttpServletRequest req, HttpServletResponse res) {
		return false;
	}

	@Override
	public boolean methodPUT(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean methodDELETE(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		return false;
	}
}
