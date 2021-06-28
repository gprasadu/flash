package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddServlet extends HttpServlet{
	
	//public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		
		PrintWriter out=res.getWriter();
		out.println("<html><body bgcolor='Red'>");
		out.println("Result is "+k);
		out.println("</body></html>");
		
		ServletContext cxt=req.getServletContext();
		String str=cxt.getInitParameter("name");
//		ServletConfig cg=getServletConfig();
//		String str=cg.getInitParameter("name");
		out.println(str);
	}

}
