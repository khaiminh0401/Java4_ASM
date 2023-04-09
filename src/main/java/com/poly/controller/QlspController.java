package com.poly.controller;

import com.poly.dao.MauDao;
import com.poly.dao.SanPhamDao;
import com.poly.dao.ThuongHieuDao;
import com.poly.entity.SanPhamEntity;
import com.poly.entity.UserEntity;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class QlspController implements InterfaceController {
	MauDao daoMau = new MauDao();
	ThuongHieuDao daoThuongHieu = new ThuongHieuDao();
	SanPhamDao daoSanPham = new SanPhamDao();

	public SanPhamEntity getForm(HttpServletRequest req) {
		SanPhamEntity sp = new SanPhamEntity();
		sp.setId(Integer.parseInt(req.getParameter("id")));
		sp.setName(req.getParameter("name"));
		sp.setRom(req.getParameter("rom"));
		sp.setRam(req.getParameter("ram"));
		sp.setHdh(req.getParameter("hdh"));
		sp.setPublished_date(req.getParameter("published_date"));
		sp.setPrice(Float.parseFloat(req.getParameter("price")));
		sp.setLogo(req.getParameter("logo"));
		sp.setQuantity(Integer.parseInt(req.getParameter("quantity")));
		sp.setThuongHieu(daoThuongHieu.findById(Integer.parseInt(req.getParameter("mathuonghieu"))));
		sp.setMau(daoMau.findById(Integer.parseInt(req.getParameter("mamau"))));
		return sp;
	}

	@Override
	public void methodGET(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		req.setAttribute("mau", daoMau.selectAll());
		req.setAttribute("thuonghieu", daoThuongHieu.findAll());
		req.setAttribute("sanpham", daoSanPham.selectAll());
		String a = req.getParameter("masp");
		if(a !=null) {
			SanPhamDao dao = new SanPhamDao();
			SanPhamEntity sp = dao.getById(Integer.parseInt(a));
			req.setAttribute("sp", sp);
		}
	}

	@Override
	public void methodPOST(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		SanPhamEntity sp = getForm(req);
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
