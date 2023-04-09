package com.poly.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface InterfaceController {
	boolean methodGET(HttpServletRequest req, HttpServletResponse res);
	boolean methodPOST(HttpServletRequest req, HttpServletResponse res);
	boolean methodPUT(HttpServletRequest req, HttpServletResponse res);
	boolean methodDELETE(HttpServletRequest req, HttpServletResponse res);
}
