package com.poly;

import java.io.IOException;
import java.io.PrintWriter;

import com.google.gson.Gson;
import com.poly.dao.SanPhamDao;
import com.poly.dao.UserDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/")
public class Java4_ASM extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uri = req.getRequestURI();
		String [] paths =uri.split("/");
		String file = paths[2];
		if(file == "home") {
			req.setAttribute("sanpham", new SanPhamDao().selectAll());
		}
		req.setAttribute("body", file);
		req.getRequestDispatcher("/view/index.jsp").forward(req, res);
	}
	
}
