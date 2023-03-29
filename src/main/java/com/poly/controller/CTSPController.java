package com.poly.controller;

import com.poly.dao.SanPhamDao;
import com.poly.entity.SanPhamEntity;

import jakarta.servlet.http.HttpServletRequest;

public class CTSPController {
	private HttpServletRequest req;
	private String method;
	public CTSPController(HttpServletRequest req, String method) {
		this.req = req;
		this.method = method;
		switch (method) {
		case "GET":
			MethodGet(Integer.parseInt(req.getParameter("masp")));
		}
	}
	public void MethodGet(int masp) {
		SanPhamDao dao = new SanPhamDao();
		SanPhamEntity entity = dao.getById(masp);
		req.setAttribute("sanpham", entity);
	}
}
