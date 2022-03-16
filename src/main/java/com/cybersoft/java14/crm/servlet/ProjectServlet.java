package com.cybersoft.java14.crm.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybersoft.java14.crm.service.ProjectService;
import com.cybersoft.java14.crm.util.JspConst;
import com.cybersoft.java14.crm.util.UrlConst;

@WebServlet(name = "projectServlet", urlPatterns = { 
		UrlConst.PROJECT_CREATE,
		UrlConst.PROJECT_REMOVE,
		UrlConst.PROJECT 
})
public class ProjectServlet extends HttpServlet {
	private String action;
	private ProjectService service;

	@Override
	public void init() throws ServletException {
		super.init();
		service = new ProjectService();
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
		case UrlConst.PROJECT_REMOVE:
			int removeId = Integer.parseInt(req.getParameter("id"));
			service.removeProject(removeId);
			resp.sendRedirect(req.getContextPath() + UrlConst.PROJECT);
			break;
		case UrlConst.PROJECT_CREATE:
			req.getRequestDispatcher(JspConst.PROJECT_CREATE).forward(req, resp);
			break;
		case UrlConst.PROJECT:
			req.setAttribute("projects", service.getListProjects());
			req.getRequestDispatcher(JspConst.PROJECT)
				.forward(req, resp);
			break;

		default:
			break;
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		switch (action) {
		case UrlConst.PROJECT_CREATE:
			
			break;

		default:
			break;
		}
	}
}