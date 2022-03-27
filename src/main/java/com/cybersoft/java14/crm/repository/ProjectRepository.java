package com.cybersoft.java14.crm.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cybersoft.java14.crm.db.MySQLConnection;
import com.cybersoft.java14.crm.entity.Project;

public class ProjectRepository {
	private List<Project> projects;
	
	public List<Project> getAll() {
		projects = new ArrayList<Project>();
		String query = "select p.id, p.name, p.description, p.start_date, p.end_date, p.owner \r\n"
				+ "from crm.project p";
		
		try (Connection conn = MySQLConnection.getConnection()) {
			PreparedStatement statement = conn.prepareStatement(query);
			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {
				Project pj = new Project();
				pj.setId(rs.getInt(1));
				pj.setName(rs.getString(2));
				pj.setDescription(rs.getString(3));
				pj.setStartDate(rs.getDate(4));
				pj.setEndDate(rs.getDate(5));
				pj.setCreateUser(rs.getInt(6));
				
				projects.add(pj);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return projects;
	}

	public int remove(int projectId) {
		
		try (Connection conn = MySQLConnection.getConnection()) {
			String query = "DELETE FROM project WHERE id=?";
			PreparedStatement statement = conn.prepareStatement(query);
			statement.setInt(1, projectId);
			statement.executeUpdate();
			return 1;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return -1;
	}
}
