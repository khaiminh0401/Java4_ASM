package com.poly.controller;

import java.util.List;

import com.poly.dao.SanPhamDao;
import com.poly.entity.HinhAnhSanPhamEntity;
import com.poly.entity.SanPhamEntity;
import com.poly.model.HttpServletModel;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HomeController extends HttpServletModel implements InterfaceController{
	public HomeController(HttpServletRequest req, HttpServletResponse res) {
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
		List<SanPhamEntity> sp = dao.selectAll();
		req.setAttribute("sp", sp);
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
