package com.poly.filter;

import java.io.IOException;

import com.poly.entity.UserEntity;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebFilter({"/admin/qlsp","/admin/qlkh","/admin","/cart"})
public class MyFilter implements HttpFilter{
	@Override
	public void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		UserEntity admin = (UserEntity) req.getSession().getAttribute("user");
		String uri = req.getRequestURI();
		if(uri.contains("admin")) {
			if(admin ==null) {
				resp.sendRedirect("/Java4_ASM/admin/login");
			}
		}else if(uri.contains("cart")) {
			if(admin==null) {
				resp.sendRedirect("/Java4_ASM/login");
			}
		}
		chain.doFilter(req, resp);
	}
}
