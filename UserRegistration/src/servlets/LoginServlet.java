package servlets;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.LoginBean;
import bean.UserBean;
import dao.LoginDao;
import dao.UserDetailDao;

public class LoginServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		LoginBean loginBean = new LoginBean();
		String username = request.getParameter("username");
		loginBean.setUsername(username);
		loginBean.setPassword(request.getParameter("password"));
		String role = LoginDao.validate(loginBean);
		HttpSession session = request.getSession(true);
		if (role != null) {			
			ResultSet rs=UserDetailDao.getUserDetails(username);
			UserBean user=new UserBean();
			try {
				if(rs.next()) {
					user.setFirstName(rs.getString("FIRST_NAME"));
					user.setRole(rs.getString("ROLE"));
					user.setUsername(rs.getString("USERNAME"));
					user.setPassword(rs.getString("PASSWORD"));
				}
				session.setAttribute("userDetails",user);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (role.equalsIgnoreCase("admin")) {
				response.sendRedirect("RegisterUser.jsp");
			}else {
				response.sendRedirect("UserDetail.jsp");
			}
		} else {
			response.sendRedirect("Login.jsp");
		}
	}
}
