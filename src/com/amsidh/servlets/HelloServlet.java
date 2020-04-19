package com.amsidh.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter writer = response.getWriter();
		writer.print("<html><head><title>Simple Filter Example</title></head><body>");
		String firstFilterValue=(String)request.getAttribute("firstFilter"); //this is from a request in FirstFilter
		String secondFilterValue=(String) getServletContext().getAttribute("secondFilter");  // This is from servletContext added in second filter
		writer.print("<h1> First Filter Value : "+firstFilterValue+"</h1><br>");
		writer.print("<h1> Second Filter Value : "+secondFilterValue+"</h1><br>");
		writer.print("</body></html>");
	}

}
