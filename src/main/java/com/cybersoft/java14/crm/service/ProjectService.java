package com.cybersoft.java14.crm.service;

import java.util.List;

import com.cybersoft.java14.crm.entity.Project;
import com.cybersoft.java14.crm.repository.ProjectRepository;

public class ProjectService {
	private ProjectRepository repository;
	
	public ProjectService() {
		repository = new ProjectRepository();
	}

	public List<Project> getListProjects() {
		return repository.getAll();
	}

	public void removeProject(int projectId) {
		int result = repository.remove(projectId);
		
		if (result == -1) {
			/**
			 * TODO: handle noti can't remove
			 */
			return;
		}
		
	}
	
	
}
