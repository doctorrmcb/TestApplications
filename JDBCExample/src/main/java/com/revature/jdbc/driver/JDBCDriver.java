package com.revature.jdbc.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDriver {
	
	
	public static void main(String[] args) {
		
		try (Connection conn = DriverManager.getConnection("jdbc:postgresql://" + URL + ":5432/postgres?", USERNAME, PASSWORD);) {
		
			String sql = "create table cookie ("
						+ "c_id serial primary key,"
						+ "flavor text,"
						+ "deliciousness integer"
						+ ")";
			
			String sql2 = "insert into cookie (flavor, deliciousness) values ('PB', 10)";
			
			String sql3 = "select * from cookie";
			
			Statement stmt = conn.createStatement();
			
			//stmt.executeUpdate(sql2);
			
			ResultSet resultSet = stmt.executeQuery(sql3);
			
			while(resultSet.next()) {
				System.out.println("Cookie ID: " + resultSet.getInt(1) + " Flavor: " + resultSet.getString(2) + " Deliciousness: " + resultSet.getInt(3));
			}
			
			System.out.println("OK");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
