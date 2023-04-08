package com.poly.controller;

import java.util.List;


import org.apache.commons.beanutils.BeanUtils;

import com.poly.commons.EntityManagerUtils;
import com.poly.dao.MauDao;
import com.poly.dao.SanPhamDao;
import com.poly.dao.ThuongHieuDao;
import com.poly.entity.SanPhamEntity;
import com.poly.entity.UserEntity;


import com.poly.dao.MauDao;
import com.poly.dao.SanPhamDao;
import com.poly.dao.ThuongHieuDao;
import com.poly.entity.SanPhamEntity;
import com.poly.entity.UserEntity;

import com.poly.dao.UserDao;
import com.poly.entity.UserEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class QlspController implements InterfaceController {
//	private EntityManager em = EntityManagerUtils.getEntityManager();
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
//		if (req.getParameter("search") == null) {
			
//		} else {
//			try {
//				String search = req.getParameter("search");
//				TypedQuery<SanPhamEntity> query = em.createNamedQuery("SanPhamEntity.findByKeyword", SanPhamEntity.class);
//				query.setParameter("name", "%" + search + "%");
//				List<SanPhamEntity> list = query.getResultList();
//				req.setAttribute("list", list);
//				req.setAttribute("name", search);
//			} catch (Exception e) {
//				// TODO: handle exception
//				e.printStackTrace();
//			}
//		}
		req.setAttribute("sanpham", daoSanPham.selectAll());
		req.setAttribute("mau", daoMau.selectAll());
		req.setAttribute("thuonghieu", daoThuongHieu.findAll());

	}

	@Override
	public void methodPOST(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		SanPhamEntity sp = getForm(req);
		try {
			daoSanPham.create(sp);
			req.setAttribute("message", "Thêm thành công!");
//			res.sendRedirect("/Java4_ASM/admin/qlsp");
		} catch (Exception e) {
			req.setAttribute("message", e + "Thêm thất bại!");
		}
	}

	@Override
	public void methodPUT(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub

	}

	@Override
	public void methodDELETE(HttpServletRequest req, HttpServletResponse res) {

	}
}
