package com.poly.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.poly.commons.CookieUtils;
import com.poly.dao.GioHangDao;
import com.poly.dao.SanPhamDao;
import com.poly.dao.UserDao;
import com.poly.entity.GioHangEntity;
import com.poly.entity.SanPhamEntity;
import com.poly.entity.UserEntity;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CartController implements InterfaceController {
	public static String magh = "";
	GioHangDao dao = new GioHangDao();
	List<GioHangEntity> gh;
	GioHangEntity ghEntity;
	
	@Override
	public boolean methodGET(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		int username = Integer.parseInt(CookieUtils.get("username", req));
		gh = dao.findAllGH(username);
		req.setAttribute("gh", gh);
		magh = req.getParameter("maid");
		System.out.println(magh);
		this.methodDELETE(req, res);
		return false;

	}

	@Override
	public boolean methodPOST(HttpServletRequest req, HttpServletResponse res) {
		int username = Integer.parseInt(CookieUtils.get("username", req));
		String masp = CtspController.masp;
		SanPhamDao daoSP = new SanPhamDao();
		SanPhamEntity sp = daoSP.getById(Integer.parseInt(masp));
		UserDao daoUser = new UserDao();
		UserEntity User = daoUser.findById(String.valueOf(username));
		try {
//			check
			String a = "";
			gh = dao.findAllGH(username);
			for (int i = 0; i < gh.size(); i++) {
				if (gh.get(i).getSanPham().getId() == Integer.parseInt(masp)
						&& gh.get(i).getUsers().getId() == username) {
					System.out.println("Đã tồn tại");
					a = "1";
					this.methodGET(req, res);
					break;
				}
			}
			if (a == "") {
				GioHangEntity gh = new GioHangEntity();
				gh.setMau(null);
				gh.setSanPham(sp);
				gh.setSoluong(1);
				gh.setUsers(User);
				GioHangDao dao = new GioHangDao();
				dao.InsertGH(gh);
				System.out.println("thanh cong");
				this.methodGET(req, res);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("loi");
		}
		return false;
	}

	@Override
	public boolean methodPUT(HttpServletRequest req, HttpServletResponse res) {
		return false;
		// TODO Auto-generated method stub

	}

	@Override
	public boolean methodDELETE(HttpServletRequest req, HttpServletResponse res){
		if (magh != null) {
			ghEntity = dao.getById(Integer.parseInt(magh));
			dao.delete(ghEntity);
			int username = Integer.parseInt(CookieUtils.get("username", req));
			gh = dao.findAllGH(username);
			req.setAttribute("gh", gh);
			System.out.println("delete thanh cong");
			
			
			try {
				res.setContentType("text/html");
				PrintWriter pwriter =res.getWriter();
				pwriter.print("<html>");
				pwriter.print("<body>");
				pwriter.print("<h2>Generic Servlet Example</h2>");
				pwriter.print("Welcome to Edureka YouTube Channel");
				pwriter.print("</body>");
				pwriter.print("</html>");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return true;
	}

}
