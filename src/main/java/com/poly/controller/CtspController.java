package com.poly.controller;

import com.poly.dao.SanPhamDao;
import com.poly.entity.SanPhamEntity;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.NoArgsConstructor;
@NoArgsConstructor
public class CtspController implements InterfaceController{
	
	@Override
	public void methodGET(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		SanPhamDao dao = new SanPhamDao();
		System.out.println(req.getParameter("masp"));
		SanPhamEntity entity = dao.getById(Integer.parseInt(req.getParameter("masp")));
		req.setAttribute("sanpham", entity);
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
