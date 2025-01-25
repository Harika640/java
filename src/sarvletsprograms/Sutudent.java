package sarvletsprograms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sutudent
 */
@WebServlet("/Student")
public class Sutudent extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		String username=request.getParameter("Username");
		String password=request.getParameter("Password");
		
		out.println("Login Successfully");
		out.println("Login Username------->"+username);
		out.println("Login Password-------->"+password);

	}

}
