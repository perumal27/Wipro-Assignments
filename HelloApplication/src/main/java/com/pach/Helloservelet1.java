package com.pach;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Helloservelet1")
public class Helloservelet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Helloservelet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    String user ="Wipro", pass ="1234";
	    if(user.equals("Wipro")&&pass.equals("1234")) {
		out.println("<html><body>");
		out.println("<h1>Login succuss</h1>");	
		out.println("</body></html>");
	    }
	    else {
	    out.println("<html><body>");
		out.println("<h1>Login not succuss</h1>");	
		out.println("</body></html>");
	    }
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
