package com.cybersoft.java14.crm.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybersoft.java14.crm.entity.User;
import com.cybersoft.java14.crm.repository.UserRepository;
import com.google.gson.Gson;

public class UserService {
	private UserRepository repository;
	
	public UserService() {
		repository = new UserRepository();
	}
	
	public List<User> getListUsers() {
		return repository.getAll();
	}

	public boolean addUser(HttpServletRequest req) {
		User us = new User();
		us.setName(req.getParameter("fullname"));
		us.setEmail(req.getParameter("email"));
		us.setPassword(req.getParameter("password"));
		us.setPhone(req.getParameter("phone"));
		us.setAddress(req.getParameter("address"));
		us.setRole(req.getParameter("role"));
		
		if (repository.insert(us) == 0) {
			return false;
		};
		
		return true;
	}
	
	public User getById(String id) {
		return repository.getById(Integer.parseInt(id));
	}

	public boolean update(Object user) {
		if(user instanceof User) {
			repository.update((User) user);
			return true;
		}
		return false;
	}

	public void deteteUser(int deleteId) {
		int result = repository.remove(deleteId);
		if (result == -1) {
			/**
			 * TODO: handle noti can't remove
			 */
			return;
		}
	}

//	public void update(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//		String userId = req.getParameter("user_id");
//		
//		PrintWriter out = resp.getWriter();
//		resp.setContentType("application/json");
//		Gson gson = new Gson();
//		
//		User user = repository.getById(Integer.parseInt(userId));
//		
//		String objectToReturn = gson.toJson(user);
//		
//		out.write(objectToReturn); // Đưa Json trả về Ajax
//		out.flush();
//		return;
//	}
}
