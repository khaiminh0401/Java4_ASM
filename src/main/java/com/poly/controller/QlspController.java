package com.poly.controller;

<<<<<<< HEAD
import org.apache.commons.beanutils.BeanUtils;
=======
import com.poly.dao.MauDao;
import com.poly.dao.SanPhamDao;
import com.poly.dao.ThuongHieuDao;
import com.poly.entity.SanPhamEntity;
import com.poly.entity.UserEntity;
>>>>>>> b61601934d8acc6c3886b47b804c62ca7529be0f

import com.poly.dao.MauDao;
import com.poly.dao.SanPhamDao;
import com.poly.dao.ThuongHieuDao;
import com.poly.entity.SanPhamEntity;
import com.poly.entity.UserEntity;

import com.poly.dao.UserDao;
import com.poly.entity.UserEntity;
import jakarta.persistence.Entity;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class QlspController implements InterfaceController {
	MauDao daoMau = new MauDao();
	ThuongHieuDao daoThuongHieu = new ThuongHieuDao();
<<<<<<< HEAD
	SanPhamDao sanPhamDao = new SanPhamDao();
	SanPhamEntity entity = new SanPhamEntity();

=======
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
>>>>>>> b61601934d8acc6c3886b47b804c62ca7529be0f
	@Override
	public void methodGET(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		req.setAttribute("mau", daoMau.selectAll());
		req.setAttribute("thuonghieu", daoThuongHieu.findAll());
		req.setAttribute("sanpham", daoSanPham.selectAll());
	}

	@Override
	public void methodPOST(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		String method = req.getMethod();
		if (method.equalsIgnoreCase("POST")) {
			try {
				BeanUtils.populate(entity, req.getParameterMap());
				sanPhamDao.create(entity);
				req.setAttribute("message", "Thêm thành công!");
			} catch (Exception e) {
				req.setAttribute("message", "Thêm thất bại!");
			}
		}

=======
		SanPhamEntity sp = getForm(req);
>>>>>>> b61601934d8acc6c3886b47b804c62ca7529be0f
	}

	@Override
	public void methodPUT(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub

	}

	@Override
	public void methodDELETE(HttpServletRequest req, HttpServletResponse res) {
		try {
			BeanUtils.populate(entity, req.getParameterMap());
			sanPhamDao.remove(entity.getId());
			req.setAttribute("message", "Delete success!");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			req.setAttribute("message", e.getMessage());
		}
	}
}
