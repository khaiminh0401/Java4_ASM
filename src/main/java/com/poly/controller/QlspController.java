package com.poly.controller;

import org.apache.commons.beanutils.BeanUtils;

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
	SanPhamDao sanPhamDao = new SanPhamDao();
	SanPhamEntity entity = new SanPhamEntity();

	@Override
	public void methodGET(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		req.setAttribute("mau", daoMau.selectAll());
		req.setAttribute("thuonghieu", daoThuongHieu.findAll());
	}

	@Override
	public void methodPOST(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
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
