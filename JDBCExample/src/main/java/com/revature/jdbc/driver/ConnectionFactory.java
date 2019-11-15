package com.revature.jdbc.driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	private static String URL;
	private static String USERNAME;
	private static String PASSWORD;
	
	private static final String PROPERTIES_FILE = "src/main/resources/database.properties";
	
	private static ConnectionFactory cf;
	
	public static Connection getConnection() {
		if (cf == null) {
			cf = new ConnectionFactory();
		}
		return cf.createConnection();
	}
	
	private ConnectionFactory() {
		Properties prop = new Properties();
		
		try (FileInputStream fis = new FileInputStream(PROPERTIES_FILE)) {
			prop.load(fis);
			URL = prop.getProperty("url");
			USERNAME = prop.getProperty("user");
			PASSWORD = prop.getProperty("password");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private Connection createConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		} catch (SQLException e) {
			System.out.println("Failed to create connection");
			e.printStackTrace();
		}
		return conn;
	}
}
