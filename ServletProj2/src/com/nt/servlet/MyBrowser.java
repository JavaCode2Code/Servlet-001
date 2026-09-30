package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyBrowser extends HttpServlet {
 
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException 
	{
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter pw=res.getWriter();
		try {
			String user=req.getParameter("user");
			pw.println("<h2> Welcome To Servelt Mr." +user+" </h2>");
		}
		finally {
			pw.close();
		}
	}
}
