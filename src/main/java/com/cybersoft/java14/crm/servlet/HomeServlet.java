package com.cybersoft.java14.crm.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybersoft.java14.crm.db.MySQLConnection;
import com.cybersoft.java14.crm.util.JspConst;
import com.cybersoft.java14.crm.util.UrlConst;

@WebServlet(name = "homeServlet", urlPatterns = {
		UrlConst.HOME,
		UrlConst.DEFAULT
})
public class HomeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher(JspConst.HOME)
			.forward(req, resp);
	}
}
