package com.cybersoft.java14.crm.service;

import java.util.List;

import com.cybersoft.java14.crm.entity.Role;
import com.cybersoft.java14.crm.repository.RoleRepository;

public class RoleService {
	private RoleRepository repository;
	
	public RoleService() {
		repository = new RoleRepository();
	}

	public List<Role> getListRoles() {
		return repository.getAll();
	}

}
