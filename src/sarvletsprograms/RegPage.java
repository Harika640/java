package sarvletsprograms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegPage
 */
@WebServlet("/RegPage")
public class RegPage extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		String firstname=request.getParameter("FirstName");
		String lastname=request.getParameter("LastName");
		String email=request.getParameter("Email");
		String password=request.getParameter("Password");
		String gender=request.getParameter("gender");
		
		out.println(" SuccessFully Registration");
		out.println("FirstName---------->"+firstname);
		out.println("LasttName---------->"+lastname);
		out.println("Email---------->"+email);
		out.println("Password---------->"+password);
		out.println("gender---------->"+gender);
		
		
		
		
	}

}
