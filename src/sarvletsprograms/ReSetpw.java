package sarvletsprograms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReSetpw
 */
@WebServlet("/ReSetpw")
public class ReSetpw extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		String email=request.getParameter("Email");
		String newpassword=request.getParameter("New Password");
		String confirmpassword=request.getParameter("Confirm Password");
		
		out.println("successfully submmited");
		out.println("Email----------->"+email);
		out.println("New Password----->"+newpassword);
		out.println("Confirm Password---->"+confirmpassword);
	}

}
