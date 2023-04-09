package com.poly.controller;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.poly.dao.MauDao;
import com.poly.dao.SanPhamDao;
import com.poly.dao.ThuongHieuDao;
import com.poly.entity.SanPhamEntity;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class QlspController implements InterfaceController {
	MauDao daoMau = new MauDao();
	ThuongHieuDao daoThuongHieu = new ThuongHieuDao();

	SanPhamEntity entity = new SanPhamEntity();

	SanPhamDao daoSanPham = new SanPhamDao();

	public SanPhamEntity getForm(HttpServletRequest req) {
		SanPhamEntity sp = new SanPhamEntity();
		sp.setId(Integer.parseInt(req.getParameter("id")));
		sp.setName(req.getParameter("name"));
		sp.setRom(req.getParameter("rom"));
		sp.setRam(req.getParameter("ram"));
		sp.setHdh(req.getParameter("hdh"));
		sp.setScreen(req.getParameter("screen"));
		sp.setPublished_date(req.getParameter("published_date"));
		sp.setPrice(Float.parseFloat(req.getParameter("price")));
		sp.setLogo(req.getParameter("logo"));
		sp.setQuantity(Integer.parseInt(req.getParameter("quantity")));
		sp.setThuongHieu(daoThuongHieu.findById(Integer.parseInt(req.getParameter("mathuonghieu"))));
		sp.setMau(daoMau.findById(Integer.parseInt(req.getParameter("mamau"))));
		return sp;
	}

	@Override
	public boolean methodGET(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		List<SanPhamEntity> sanpham = new ArrayList();
		if(req.getParameter("search")==null) {
			sanpham = daoSanPham.selectAll();
		}else {
			sanpham = daoSanPham.getByName(req.getParameter("search"));
			req.setAttribute("search", req.getParameter("search"));
		}
		req.setAttribute("sanpham", sanpham);
		String a = req.getParameter("masp");
		if(a !=null) {
			SanPhamDao dao = new SanPhamDao();
			SanPhamEntity sp = dao.getById(Integer.parseInt(a));
			req.setAttribute("sp", sp);
		}
		req.setAttribute("mau", daoMau.selectAll());
		req.setAttribute("thuonghieu", daoThuongHieu.findAll());
		return false;
	}

	@Override
	public boolean methodPOST(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		SanPhamEntity sp = getForm(req);
		daoSanPham.save(sp);
		try {
			res.sendRedirect("/Java4_ASM/admin/qlsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean methodPUT(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub

//		try {
			System.out.println(req.getParameterMap().size());
			SanPhamEntity sp = getForm(req);
			daoSanPham.update(sp);
//			res.sendRedirect("/Java4_ASM/admin/qlsp");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return true;

	}

	@Override
	public boolean methodDELETE(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		SanPhamEntity sp = daoSanPham.getById(Integer.parseInt(req.getParameter("id")));
		System.out.println(sp.getId());
		daoSanPham.delete(sp);
//		try {
//			res.sendRedirect("/Java4_ASM/admin/qlsp");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return true;
	}

}
