package com.poly.controller;

import java.util.List;

import com.poly.dao.SanPhamDao;
import com.poly.entity.SanPhamEntity;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.NoArgsConstructor;
@NoArgsConstructor
public class HomeController implements InterfaceController{


	@Override
	public boolean methodGET(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		SanPhamDao dao = new SanPhamDao();
		List<SanPhamEntity> sp = dao.selectAll();
		req.setAttribute("sp", sp);
		return false;
	}

	@Override
	public boolean methodPOST(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		return true;
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
