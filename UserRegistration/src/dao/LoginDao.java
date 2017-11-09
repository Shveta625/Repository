package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.LoginBean;
import util.ConnectionProvider;
public class LoginDao {

	public static String validate(LoginBean bean){
		String user=null;
		try{
			Connection con=ConnectionProvider.getCon();
			
			PreparedStatement ps=con.prepareStatement("select * from REGISTERED_USERS where USERNAME=? and PASSWORD=?");
			ps.setString(1,bean.getUsername());
			ps.setString(2, bean.getPassword());
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
			user=rs.getString("ROLE");
			}
			
		}catch(Exception e){}
		return user;
	}
}
