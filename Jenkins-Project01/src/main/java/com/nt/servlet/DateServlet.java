package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/dateurl")
public class DateServlet extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//Set Response Content type
		res.setContentType("text/html");
		//Get PrintWriter
		PrintWriter pw = res.getWriter();
		//Business Logic
		Date d = new Date();
		pw.println("<h1>Date and Time is: "+d+"</h1>");
		
		//Add Home Page Hyperlink
		pw.println("<br><a href='index.jsp'> Home </a>");
		//Close the Stream
		pw.close();
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}
}
