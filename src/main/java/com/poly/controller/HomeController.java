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
	public void methodGET(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		SanPhamDao dao = new SanPhamDao();
		List<SanPhamEntity> sp = dao.selectAll();
		req.setAttribute("sp", sp);
	}

	@Override
	public void methodPOST(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		
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
