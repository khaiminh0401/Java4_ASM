package com.poly.fiter;


import java.io.IOException;


import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebFilter(filterName = "AuthFilter" , urlPatterns = {"/Bai3_AccountManagementServlet/*","/Bai3_AccountManagementServlet","/UserServletBai3/*"})
public class AuthFilter implements HttpFilter{

	@Override
	public void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		String uri = req.getRequestURI();
		User user = (User) req.getSession().getAttribute("user");
		String error = "";
		System.out.println("AuthFilter running");
		if(user == null) {
			error = resp.encodeURL("Please login to use this function!");
			System.out.println("Vui lòng đăng nhập!");
		}
		else if(!user.getAdmin() && uri.contains("Bai3_AccountManagementServlet")) {
			System.out.println("Vui lòng đăng nhập với vai trò admin");
			error = resp.encodeURL("Please login with admin role");
			
		}
		if(!error.isEmpty()) {
//			req.setCharacterEncoding("UTF-8");
//			resp.setCharacterEncoding("UTF-8");
//			req.getSession().setAttribute("securi", uri);
			req.getSession().setAttribute("securi", error);
			System.out.println("Error!");
			//resp.sendRedirect("accountBai3/sign-in?error="+resp.encodeURL(error));
			resp.sendRedirect("views/login.jsp?error="+resp.encodeURL(error));
			//req.getRequestDispatcher("/views/login.jsp").forward(req, resp);
			
			
		}
		else {
			System.out.println("No Error!");
			chain.doFilter(req, resp);
			req.getSession().setMaxInactiveInterval(60);
		}
	}

}
