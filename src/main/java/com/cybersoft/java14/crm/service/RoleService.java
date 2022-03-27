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

	public Role getRoleByName(String roleName) {
		return repository.getRoleByName(roleName);
	}

	public Role getRoleById(int roleId) {
		// TODO Auto-generated method stub
		return repository.getRoleById(roleId);
	}

}
