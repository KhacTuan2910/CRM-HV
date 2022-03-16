package com.cybersoft.java14.crm.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cybersoft.java14.crm.db.MySQLConnection;
import com.cybersoft.java14.crm.entity.Role;

public class RoleRepository {
	private List<Role> roles;

	public List<Role> getAll() {
		roles = new ArrayList<Role>();
		
		String query = "select id, name, description \r\n"
				+ "	from crm_app.crm_role;";
		
		try (Connection conn = MySQLConnection.getConnection()) {
			PreparedStatement statement = conn.prepareStatement(query);
			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {
				Role role = new Role();
				role.setId(rs.getInt(1));
				role.setName(rs.getString(2));
				role.setDescription(rs.getString(3));
				
				roles.add(role);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return roles;
	}

}
