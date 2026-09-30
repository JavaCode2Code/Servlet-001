package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Validate extends HttpServlet {
@Override
public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	// TODO Auto-generated method stub
	res.setContentType("text/html");
	PrintWriter pw=null;
	RequestDispatcher rd=null;
	pw=res.getWriter();
	try {
		String name=req.getParameter("user");
		String password=req.getParameter("pass");
		if(password.equals("meena"))
		{
			rd=req.getRequestDispatcher("welcome");
			rd.forward(req, res);
		}
		else
		{
			pw.println("<font color='red'><b>You have Enter incurrect password</b></font>");
			rd=req.getRequestDispatcher("index.html");
			rd.include(req, res);
		}
		
	}
	catch(ServletException se) {
		se.printStackTrace();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		pw.close();
	}

}
}
