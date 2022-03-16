package com.cybersoft.java14.crm.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cybersoft.java14.crm.db.MySQLConnection;
import com.cybersoft.java14.crm.entity.User;

public class UserRepository {
	private List<User> users;
	
//	public UserRepository() {
//		users = new ArrayList<>();
//	}
	
	public List<User> getAll() {
		users = new ArrayList<>();
		String query = "select u.id, u.name, u.email, u.password, u.phone, u.address, r.name  \r\n"
				+ "from crm_app.crm_user u, crm_role r\r\n"
				+ "where u.role = r.id;";
		try (Connection conn = MySQLConnection.getConnection()) {
			PreparedStatement statement = conn.prepareStatement(query);
			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {
				User us = new User();
				us.setId(rs.getInt(1));
				us.setName(rs.getString(2));
				us.setEmail(rs.getString(3));
				us.setPassword(rs.getString(4));
				us.setPhone(rs.getString(5));
				us.setAddress(rs.getString(6));
				us.setRole(rs.getString(7));
				
				users.add(us);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}
	
	public User getById(int id) {
		User us = new User();
		String query = "select u.id, u.name, u.email, u.password, u.phone, u.address, r.name \r\n"
				+ "from crm_app.crm_user u, crm_role r\r\n"
				+ "where u.id = ?;";
		try (Connection conn = MySQLConnection.getConnection()) {
			PreparedStatement statement = conn.prepareStatement(query);
			statement.setInt(1, id);
			
			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {
				us.setId(rs.getInt(1));
				us.setName(rs.getString(2));
				us.setEmail(rs.getString(3));
				us.setPassword(rs.getString(4));
				us.setPhone(rs.getString(5));
				us.setAddress(rs.getString(6));
				us.setRole(rs.getString(7));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return us;
	}
	
	public int insert(User us) {
		String query = "insert crm_user(name, email, password, phone, address, role)\r\n"
				+ "values \r\n"
				+ "	(?, ?, ?, ?, ?, ?)";
		int roleId = getIdRole(us.getRole());
		
		if (getIdRole(us.getRole()) == 0)
			return 0;
		
		try (Connection conn = MySQLConnection.getConnection()) {
			PreparedStatement statement = conn.prepareStatement(query);
			statement.setString(1, us.getName());
			statement.setString(2, us.getEmail());
			statement.setString(3, us.getPassword());
			statement.setString(4, us.getPhone());
			statement.setString(5, us.getAddress());
			statement.setInt(6, roleId);
			
			return statement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Error insert user.");
			e.printStackTrace();
		}
		return 0;
	}
	
	public int update(User us) {
		String query = "update crm_app.crm_user \r\n"
				+ "set\r\n"
				+ "	name = ?, email = ?, password = ?, phone = ?, address = ?, role = ?\r\n"
				+ "where \r\n"
				+ "	id = ?;";
		
		int roleId = getIdRole(us.getRole());
		
		if (getIdRole(us.getRole()) == 0)
			return 0;
		
		try (Connection conn = MySQLConnection.getConnection()) {
			PreparedStatement statement = conn.prepareStatement(query);
			statement.setString(1, us.getName());
			statement.setString(2, us.getEmail());
			statement.setString(3, us.getPassword());
			statement.setString(4, us.getPhone());
			statement.setString(5, us.getAddress());
			statement.setInt(6, roleId);
			statement.setInt(7, us.getId());
			
			return statement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Error insert user.");
			e.printStackTrace();
		}
		return 0;
	}
	
	private int getIdRole(String role) {
		String query = "select id\r\n"
				+ "from crm_app.crm_role\r\n"
				+ "where\r\n"
				+ "	name = ?;";
		try (Connection conn = MySQLConnection.getConnection()) {
			PreparedStatement statement = conn.prepareStatement(query);
			statement.setString(1, role);
			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {
				return rs.getInt("id");					
			}
			
		} catch (SQLException e) {
			System.out.println("Error get role id.");
			e.printStackTrace();
		}
		
		return 0;
	}

	public int remove(int deleteId) {
		
		String query = "DELETE FROM crm_user WHERE id=?";
		
		try (Connection conn = MySQLConnection.getConnection()) {
			
			PreparedStatement statement = conn.prepareStatement(query);
			statement.setInt(1, deleteId);
			statement.executeUpdate();
			return 1;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return -1;
	}
}
