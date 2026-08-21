package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.RegisterDao;

//import model.FoodDao;

/**
 * Servlet implementation class RegisterAddServe
 */
@WebServlet("/RegisterAddServe")
public class RegisterAddServe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		String nm=request.getParameter("nm");
		RegisterDao rdao=new RegisterDao();
		rdao.insertData(uname, pass, nm);
	  response.sendRedirect("Success.jsp");
	}

}
