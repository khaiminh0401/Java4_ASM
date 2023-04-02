package com.poly.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface InterfaceController {
	void methodGET(HttpServletRequest req, HttpServletResponse res);
	void methodPOST(HttpServletRequest req, HttpServletResponse res);
	void methodPUT(HttpServletRequest req, HttpServletResponse res);
	void methodDELETE(HttpServletRequest req, HttpServletResponse res);
}
