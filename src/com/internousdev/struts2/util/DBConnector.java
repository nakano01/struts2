

package com.internousdev.struts2.util;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private static String driverName="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql://localhost/opeconnect";
	private static String user="root";
	private static String password="mysql";
	
	public Conection getConnection(){
		Conection con=null;
	try{
		Class.forName(driverName);
		con=(Conection)DriverManager.getConnection(url,user,password);
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}catch(SQLException e){
		e.printStackTrace();
	}
	return con;
	
	
	}
	
}