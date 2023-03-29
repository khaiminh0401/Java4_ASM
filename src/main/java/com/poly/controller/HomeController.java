package com.poly.controller;

import java.util.List;

import com.poly.dao.SanPhamDao;
import com.poly.entity.HinhAnhSanPhamEntity;

import jakarta.servlet.http.HttpServletRequest;

public class HomeController {
	private HttpServletRequest req;
	private String method;
	public HomeController(HttpServletRequest req, String method) {
		this.req = req;
		this.method = method;
		switch (method) {
		case "GET":
			MethodGet();
		}
	}
	public void MethodGet() {
		SanPhamDao dao = new SanPhamDao();
		List<HinhAnhSanPhamEntity> sp = dao.selectAll2();
		req.setAttribute("sp", sp);
		System.out.println(sp.get(0).getUrl());
	}
}
