package com.poly.controller;

import com.poly.dao.SanPhamDao;

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
		req.setAttribute("sp", dao.selectAll());
	}
}
