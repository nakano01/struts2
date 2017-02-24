/**
 * 
 */
package com.internousdev.struts2.dao;

import com.internousdev.struts2.dto.LoginDTO;
import com.internousdev.struts2.util.DBConnector;

/**
 * @author internousdev
 *
 */
public class LoginDAO {
	
	public LoginDTO select(String name,String password){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		LoginDTO dto = new LoginDTO();
		
		
	}
}
