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

		String query = "select id, name, description \r\n" + "	from crm.role;";

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

	public Role getRoleByName(String roleName) {
		Role role = new Role();

		String query = "select id, name, description \r\n" + "	from crm.role" + " where name = ?";

		try (Connection conn = MySQLConnection.getConnection()) {
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setString(1, roleName);

			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				role.setId(rs.getInt(1));
				role.setName(rs.getString(2));
				role.setDescription(rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return role;
	}

	public Role getRoleById(int roleId) {
		Role role = new Role();

		String query = "select id, name, description \r\n" + "	from crm.role" + " where id = ?";

		try (Connection conn = MySQLConnection.getConnection()) {
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setInt(1, roleId);

			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				role.setId(rs.getInt(1));
				role.setName(rs.getString(2));
				role.setDescription(rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return role;
	}

}
