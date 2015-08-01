package com.rss.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rss.service.LoginService;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("username");
		String password = request.getParameter("password");

		LoginService loginService = new LoginService();
		Boolean userExistance = loginService.checkUserExistance(userName,password);
		if (userExistance) {
			request.getRequestDispatcher("/views/index.html").forward(request,
					response);
		} else {
			request.getRequestDispatcher("/views/signup.html").forward(request,
					response);
		}
	}

}
