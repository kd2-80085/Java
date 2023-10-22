package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DbUtil {
	public static final String DB_DRIVER="com.mysql.cj.jdbc.driver";
	public static final String DB_URL="jdbc:mysql://localhost:3306/karad";
	public static final String DB_USER="kd2_80085_ChaitanyaBhavar";
	public static final String DB_PASSWD="manager";
	
	static {
		try {
				Class.forName(DB_DRIVER);//load and register driver
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
				System.exit(1);
			}			
		}
		public static Connection getConnection() throws SQLException{
			Connection con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD);
			return con;
		}
	
	}
	
	
	
	
	

