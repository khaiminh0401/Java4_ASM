package com.poly.controller;

import com.poly.dao.GioHangDao;
import com.poly.entity.GioHangEntity;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DonhangController implements InterfaceController{

	@Override
	public boolean methodGET(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean methodPOST(HttpServletRequest req, HttpServletResponse res) {
		int magh = Integer.parseInt( req.getParameter("magh"));
		GioHangDao dao = new GioHangDao();
		GioHangEntity gh = dao.getById(magh);
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
