package com.poly;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.google.gson.Gson;
import com.poly.controller.CTSPController;
import com.poly.controller.HomeController;
import com.poly.dao.SanPhamDao;
import com.poly.dao.UserDao;
import com.poly.entity.HinhAnhSanPhamEntity;
import com.poly.entity.SanPhamEntity;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/")
public class Java4_ASM extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String uri = req.getRequestURI();
		String[] paths = uri.split("/");
		String file = "trangchu";
		if (paths.length > 2) {
			file = paths[2];
		}

		req.setAttribute("page", file);

		switch (file) {
		case "trangchu":
			new HomeController(req, req.getMethod());
			break;
		case "ctsp":
			new CTSPController(req, req.getMethod());
		}
		req.getRequestDispatcher("/view/index.jsp").forward(req, res);
	}

}
