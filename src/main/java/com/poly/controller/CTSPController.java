package com.poly.controller;

import com.poly.dao.SanPhamDao;
import com.poly.entity.SanPhamEntity;
import com.poly.model.HttpServletModel;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CTSPController extends HttpServletModel implements InterfaceController{

	public CTSPController(HttpServletRequest req,HttpServletResponse res) {
		super(req,res);
		switch (req.getMethod()) {
		case "GET":
			methodGet();
		}
	}
	@Override
	public void methodGet() {
		// TODO Auto-generated method stub
		SanPhamDao dao = new SanPhamDao();
		System.out.println(req.getParameter("masp"));
		SanPhamEntity entity = dao.getById(Integer.parseInt(req.getParameter("masp")));
		req.setAttribute("sanpham", entity);
	}
	@Override
	public void methodPost() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void methodPut() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void methodDelete() {
		// TODO Auto-generated method stub
		
	}
}
