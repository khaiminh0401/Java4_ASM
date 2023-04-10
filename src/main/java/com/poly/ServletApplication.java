
package com.poly;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import org.hibernate.usertype.DynamicParameterizedType.ParameterType;

import com.google.gson.Gson;
import com.poly.controller.CtspController;
import com.poly.controller.HomeController;
import com.poly.dao.SanPhamDao;
import com.poly.dao.UserDao;
import com.poly.entity.HinhAnhSanPhamEntity;
import com.poly.entity.SanPhamEntity;
import com.poly.utils.StringUtils;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/")
public class ServletApplication extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		res.setHeader("Allow", "GET,POST,PUT,DELETE, OPTIONS");

		// TODO Auto-generated method stub
		String uri = req.getRequestURI();
		String[] paths = uri.split("/");
		String file = "home";
		String defaultTemplate = "index";
		if (paths.length > 2) {
			file = paths[2];
			if(paths[2].equals("admin")) {
				defaultTemplate = "admin";
				file="home";
				if(paths.length>3) {
					file = paths[3];
				}
			}
		}
		System.out.println(defaultTemplate);
		String name = StringUtils.upperCaseFirstChar(file);
		String pathClassController = "com.poly.controller."+name+"Controller";
		try {
			Class<?> classNew =Class.forName(pathClassController);
			Object obj = classNew.newInstance();
			Method method = classNew.getMethod("method"+req.getMethod(),new Class[] {HttpServletRequest.class,HttpServletResponse.class});
			if(!(boolean)method.invoke(obj, req,res)){
				req.setAttribute("page", file);
				req.getRequestDispatcher("/view/"+defaultTemplate+".jsp").forward(req, res);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			req.getRequestDispatcher("/view/404.jsp");
			e.printStackTrace();
		} 

	}
}
