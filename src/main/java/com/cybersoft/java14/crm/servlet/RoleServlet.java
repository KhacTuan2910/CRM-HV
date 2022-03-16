package com.cybersoft.java14.crm.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybersoft.java14.crm.service.RoleService;
import com.cybersoft.java14.crm.util.JspConst;
import com.cybersoft.java14.crm.util.UrlConst;

@WebServlet(name = "roleServlet", urlPatterns = {
		UrlConst.ROLE,
		UrlConst.ROLE_CREATE
})
public class RoleServlet extends HttpServlet {
	private String action;
	private RoleService service;
	
	@Override
	public void init() throws ServletException {
		super.init();
		service = new RoleService();
		action = "";
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");
		action = req.getServletPath();
		super.service(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		switch (action) {
		case UrlConst.ROLE:
			req.setAttribute("roles", service.getListRoles());
			req.getRequestDispatcher(JspConst.ROLE)
				.forward(req, resp);
			break;
		case UrlConst.ROLE_CREATE:
			
			req.getRequestDispatcher(JspConst.ROLE_CREATE)			
				.forward(req, resp);
			break;

		default:
			break;
		}
	}
}
