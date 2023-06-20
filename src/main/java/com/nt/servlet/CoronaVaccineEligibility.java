
package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/vaccine")
public class CoronaVaccineEligibility extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		String uname=req.getParameter("uname");
		String address=req.getParameter("address");
		Integer age=0;
		try {
		 age=Integer.parseInt(req.getParameter("page"));
		}
		catch(NumberFormatException nfe) {
			nfe.printStackTrace();
		}
		if(age<18)
			writer.println("<h1 style='color:red;text-align:center'> Mr/Ms "+uname +"You are not "
					+ " Eligible for vaccination</h1>");
		else
			writer.println("<h1 style='color:green;text-align:center'> Mr/Ms "+uname +"You are  "
					+ " Eligible for vaccination Make it Happen !!</h1>");
		writer.println("<a href='index.jsp'><img src='images/home.jfif'></a>");
		
		/*writer.println("<a href='http://localhost:2020/CoronaVaccineApp/corona_vaccine.html'>"
				+ "<img src='images/home.jfif'>"+"</a>");*/
		writer.close();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		LocalDateTime ldt=LocalDateTime.now();
		int hour=ldt.getHour();
		if(hour<12)
			writer.println("<h1 style='color:red;text-align:center'>Good Morning</h1>");
		else if(hour<16)
			writer.println("<h1 style='color:orange;text-align:center'>Good Afternoon</h1>");
		else if(hour<18)
			writer.println("<h1 style='color:pink;text-align:center'>Good Evening</h1>");
		else
			writer.println("<h1 style='color:green;text-align:center'>Good Night</h1>");
		writer.println("<a href='index.jsp'><img src='images/home.jfif'></a>");
		writer.close();
	}
}
