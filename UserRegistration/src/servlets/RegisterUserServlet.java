package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.UserBean;
import dao.RegisterDao;

public class RegisterUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String fullName = request.getParameter("firstName");
		String role = request.getParameter("role");
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		UserBean registerBean = new UserBean();

		registerBean.setFirstName(fullName);
		registerBean.setRole(role);
		registerBean.setUsername(userName);
		registerBean.setPassword(password);
		RegisterDao registerDao = new RegisterDao();

		String userRegistered = registerDao.registerUser(registerBean);
	}
}