package com.nt.servlet;




import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
@Override
public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	// TODO Auto-generated method stub
	res.setContentType("text/html");
	PrintWriter pw=res.getWriter();
	pw.println("<html><body>");
	pw.println("<h1>Hello Reader</h1>");
	pw.println("</body></html>");   
	   
}

}
