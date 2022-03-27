package com.cybersoft.java14.crm.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybersoft.java14.crm.service.RoleService;
import com.cybersoft.java14.crm.service.UserService;
import com.cybersoft.java14.crm.util.JspConst;
import com.cybersoft.java14.crm.util.UrlConst;

@WebServlet(name = "userServlet", urlPatterns = {
		UrlConst.USER,
		UrlConst.USER_ADD,
		UrlConst.USER_DELETE,
		UrlConst.USER_UPDATE
})
public class UserServlet extends HttpServlet {
	
	private UserService service;
	private RoleService roleService;
	
	private String action;
	
	@Override
	public void init() throws ServletException {
		super.init();
		service = new UserService();
		roleService = new RoleService();
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
		case UrlConst.USER_ADD:
			req.setAttribute("roles", roleService.getListRoles());
			
			req.getRequestDispatcher(JspConst.USER_ADD)
				.forward(req, resp);
			break;
		case UrlConst.USER_DELETE:
			int deleteId = Integer.parseInt(req.getParameter("id"));
			service.deteteUser(deleteId);
			resp.sendRedirect(req.getContextPath() + UrlConst.USER);
			break;
		case UrlConst.USER_UPDATE:
			String userId = req.getParameter("id");
			var user = service.getById(userId);
			req.setAttribute("user", user);
			
			req.setAttribute("roles", roleService.getListRoles());
			
			req.getRequestDispatcher(JspConst.USER_UPDATE)
				.forward(req, resp);
			break;
		case UrlConst.USER:
			req.setAttribute("users", service.getListUsers());
			req.getRequestDispatcher(JspConst.USER)			
				.forward(req, resp);
			break;

		default:
			break;
		}
		
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		switch (action) {
		case UrlConst.USER_ADD:
			
			service.addUser(req);
			break;
		case UrlConst.USER_UPDATE:
			service.update(req);
			
			//			service.update(req, resp);
			break;

		default:
			break;
		}
		req.setAttribute("users", service.getListUsers());
		resp.sendRedirect(req.getContextPath() + UrlConst.USER);
	}
	
	
	
	
}
