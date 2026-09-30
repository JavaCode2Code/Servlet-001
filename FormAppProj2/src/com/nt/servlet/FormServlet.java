package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet{
 public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
	 
	 String name=null,gender=null,ms=null,addrs=null,qlfy=null,crs[]=null,hb[]=null;
	 int age=0;
	 PrintWriter pw=null;
	 //get printWriter object`
	 pw=res.getWriter();
	 //set response content type
	 res.setContentType("text/html");
	 //read from data
	 name=req.getParameter("tname");
	 age=Integer.parseInt(req.getParameter("tage"));
	 gender=req.getParameter("gen");
	 ms=req.getParameter("ms");
	 addrs=req.getParameter("taddress");
	 qlfy=req.getParameter("qlfy");
	 crs=req.getParameterValues("crs");
	 hb =req.getParameterValues("hb");
	 if(ms==null)
		 ms="single";
	 if(crs==null) {
		 crs=new String[1];
	 crs[0]="no courses are selected";
	 }
	 if(hb==null) {
		 hb=new String[1];
		 hb[0]="no Hobbes->sanyashi";
	 }
	 //write request processing logic
	 if(gender.equalsIgnoreCase("M")) {
		 
		 if(age<=5)
			 pw.println(name+"u r baby boy");
		 else if(age<=12)
			 pw.println(name+"u r small boy");
		 else if(age<=19)
			 pw.println(name+"u r teenager boy");
		 else if(age<=35)
			 pw.println(name+"u r young aged man");
		 else if(age<=50)
			 pw.println(name+"u r middle man");
		 else
			 pw.println(name+"u r old man");
			
	 }//if
	 else if(gender.equalsIgnoreCase("F"))
	 {
		 if(age<=5)
			 pw.println(name+"u r baby girl");
		 else if(age<=12)
			 pw.println(name+"u r small girl");
		 else if(age<=19)
			 pw.println(name+"u r teenager girl");
		 else if(age<=35)
			 pw.println(name+"u r young lady");
		 else if(age<=50)
			 pw.println(name+"u r middle aged");
		 else
			 pw.println(name+"u r old lady");
		 
		 
	 }
	 pw.println("<br>name="+name);
	 pw.println("<br>age="+age);
	 pw.println("<br>Gender="+gender);
	 pw.println("<br>Marital Status="+ms);
	 pw.println("<br>Address="+addrs);
	 pw.println("<br>Qualification"+qlfy);
	 pw.println("<br>Courses="+Arrays.toString(crs));
	 pw.println("<br>Hobbies="+Arrays.toString(hb));
	 
 }
 //doGet(-,-)
 public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
 {
	 doGet(req,res);
 }
 
	

}//class
