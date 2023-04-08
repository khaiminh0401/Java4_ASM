package com.poly.controller;

import java.util.ArrayList;
import java.util.List;

import com.poly.dao.SanPhamDao;
import com.poly.dao.ThuongHieuDao;
import com.poly.entity.SanPhamEntity;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LaptopController implements InterfaceController{
	ThuongHieuDao daoThuongHieu = new ThuongHieuDao();
	SanPhamDao daoSanPham = new SanPhamDao();
	@Override
	public void methodGET(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		List<SanPhamEntity> listSP = new ArrayList<>();
		if(req.getParameterMap().size()==0) {
			listSP = daoSanPham.selectAll();
		}
		if(req.getParameter("th")!=null) {
			listSP = daoSanPham.getByMaThuongHieu(Integer.parseInt(req.getParameter("th")));
		}
		req.setAttribute("sanpham", listSP);
		req.setAttribute("thuonghieu", daoThuongHieu.findAll());
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
