package com.raka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
	
	String url = "jdbc:mysql://localhost:3306/jsp";
	String username = "root";
	String password = "Raka@Database09";
	
	String query = "select * from credentials where binary uname=? and binary pass=?";
	
	public boolean verifyUser(String uname, String pass) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, uname);
			pst.setString(2, pass);
			
			ResultSet rs = pst.executeQuery();
			
			if (rs.next()) {
				return true;
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

}
