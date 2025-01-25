package sarvletsprograms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Address
 */
@WebServlet("/Address")
public class Address extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String city=request.getParameter("City");
		String state=request.getParameter("State");
		String country=request.getParameter("Country");
		
		
		out.println("Sucessfully");
		out.println("City---------->"+city);
		out.println("State---------->"+state);
		out.println("Country---------->"+country);
		
		
	}

}
