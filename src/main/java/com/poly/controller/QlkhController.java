package com.poly.controller;

import java.util.List;

import org.apache.catalina.User;

import com.poly.dao.UserDao;
import com.poly.entity.SanPhamEntity;
import com.poly.entity.UserEntity;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class QlkhController implements InterfaceController{
	public UserEntity getForm(HttpServletRequest req) {
		UserEntity user = new UserEntity();
		user.setId(Integer.parseInt(req.getParameter("id")));
		user.setFullname(req.getParameter("fullname"));
		user.setPassword(req.getParameter("password"));
		user.setEmail(req.getParameter("email"));
		user.setPhone(req.getParameter("phone"));
		user.setAdmin(Boolean.getBoolean(req.getParameter("admin")));
		return user;
	}
	@Override
	public boolean methodGET(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		UserDao dao = new UserDao();
		List<UserEntity> user = dao.findKH();
		req.setAttribute("user", user);
		System.out.println(user.get(0).isAdmin());
		
		String a = req.getParameter("makh");
		if(a !=null) {
			UserDao daouser = new UserDao();
			UserEntity user2 = daouser.findById(String.valueOf(a));
			req.setAttribute("user2", user2);
			System.out.println(user2.getEmail());
			System.out.println(user2.isAdmin());
		}
		return false;
	}

	@Override
	public boolean methodPOST(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		UserEntity user = getForm(req);
		return true;
	}

	@Override
	public boolean methodPUT(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean methodDELETE(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		return true;
	}

}
