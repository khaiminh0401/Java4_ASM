package com.poly;

import java.io.IOException;
import java.io.PrintWriter;

import com.google.gson.Gson;
import com.poly.dao.UserDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/*")
public class Java4_ASM extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserDao dao = new UserDao();
		Gson gson = new Gson();
		String json = gson.toJson(dao.selectAll());
        PrintWriter out = res.getWriter();
        res.setContentType("application/json");
        res.setCharacterEncoding("UTF-8");
        out.print(json);
        out.flush();   
	}
	
}
