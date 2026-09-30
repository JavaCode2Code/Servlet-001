package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet {
@Override
public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	// TODO Auto-generated method stub
	res.setContentType("text/html");
	PrintWriter pw=null;
pw=res.getWriter();
try {
	pw.println("<h2>Welcome to Servlet</h2>");
}
finally {
	pw.close();
}
}
}
