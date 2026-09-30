package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VoterServlet extends HttpServlet{
public  void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	PrintWriter pw=null;
	String name=null,tage=null,vstatus;
	int age=0;
	pw=res.getWriter();
	//set response content type
	res.setContentType("text/html");
	//read from data
	name=req.getParameter("pname");
	tage=req.getParameter("page");
	vstatus=req.getParameter("vflag");
	//get Client side validation s
	if(vstatus.equals("no")) 
	//if client side validation are not done
	{
		// server form validation
		if(name.equals("") || name==null || name.length()==0)
				{
			pw.println("<font color=red>Persion name is madatory</font>");
			return;
				}
				if(tage.equals("")|| tage==null||tage.length()==0)
				{
					pw.println("<font color=red> Persion age is madatory</font>");
					return;
				}
				else//to check whether age is numeric value or not
				{
					try{
						//convert given age value to numeric value
						age=Integer.parseInt(tage);
					}
					catch(NumberFormatException nfe){
						pw.println("<font color=red>age must be numeric value</font>");
						return;
					}
				}	//else
		System.out.println("Server side validation completed ");
	}//if
	else{  //when client side validation are done
		age=Integer.parseInt(tage);		
	}
	//write request processing logic /B.logic
	if(age>=18)
		pw.println("<h1><font color='green'>"+name+"u r eligible to vote</font></h1>");
		else
	pw.println("<h1><font color='red'>"+name+"u r not eligible for vote</font></h1> ");
	//add Graphical hyperlink
	pw.println("<br><a href='input.html'><img src='javababa.jpg' width='100' height='100'></a>");
	//close stream
	pw.close();
}//doGet(--)
public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
System.out.println("VoterServlet(----)");	
doGet(req,res);
}//class

}
