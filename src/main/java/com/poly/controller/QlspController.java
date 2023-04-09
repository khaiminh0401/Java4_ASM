package com.poly.controller;

<<<<<<< HEAD
<<<<<<< HEAD
import java.util.List;


import org.apache.commons.beanutils.BeanUtils;

import com.poly.commons.EntityManagerUtils;
import com.poly.dao.MauDao;
import com.poly.dao.SanPhamDao;
import com.poly.dao.ThuongHieuDao;
import com.poly.entity.SanPhamEntity;
import com.poly.entity.UserEntity;


=======
=======

>>>>>>> origin/master
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
>>>>>>> origin/master
=======
>>>>>>> origin/master
import com.poly.dao.MauDao;
import com.poly.dao.SanPhamDao;
import com.poly.dao.ThuongHieuDao;
import com.poly.entity.SanPhamEntity;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

<<<<<<< HEAD
<<<<<<< HEAD

public class QlspController implements InterfaceController {
//	private EntityManager em = EntityManagerUtils.getEntityManager();
=======
public class QlspController implements InterfaceController {
>>>>>>> origin/master
=======

public class QlspController implements InterfaceController {
>>>>>>> origin/master
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
<<<<<<< HEAD
<<<<<<< HEAD
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

=======
=======
>>>>>>> origin/master
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
<<<<<<< HEAD
>>>>>>> origin/master
=======
>>>>>>> origin/master
	}

	@Override
	public boolean methodPOST(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		SanPhamEntity sp = getForm(req);
<<<<<<< HEAD
<<<<<<< HEAD
		try {
			daoSanPham.create(sp);
			req.setAttribute("message", "Thêm thành công!");
//			res.sendRedirect("/Java4_ASM/admin/qlsp");
		} catch (Exception e) {
			req.setAttribute("message", e + "Thêm thất bại!");
		}
=======
=======
>>>>>>> origin/master
		daoSanPham.save(sp);
		try {
			res.sendRedirect("/Java4_ASM/admin/qlsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
<<<<<<< HEAD
>>>>>>> origin/master
=======
>>>>>>> origin/master
	}

	@Override
	public boolean methodPUT(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub

<<<<<<< HEAD
<<<<<<< HEAD
	}

	@Override
	public void methodDELETE(HttpServletRequest req, HttpServletResponse res) {
=======
=======
>>>>>>> origin/master
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
<<<<<<< HEAD
>>>>>>> origin/master
=======
>>>>>>> origin/master

}
