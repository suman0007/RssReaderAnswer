package com.rss.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rss.service.LoginService;

public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SignUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("username");
		String password = request.getParameter("password");

		LoginService loginService = new LoginService();
		loginService.saveUser(userName, password);
		request.getRequestDispatcher("/views/login.html").forward(request,
				response);
	}

}
