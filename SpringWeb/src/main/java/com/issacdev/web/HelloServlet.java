package com.issacdev.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.issacdev.web.module.Hello;

public class HelloServlet extends HttpServlet {

	private String message;

	public void init() throws ServletException {
		message = "Servlet init";
		System.out.println(message);

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		WebApplicationContext ctx = WebApplicationContextUtils
				.getRequiredWebApplicationContext(this.getServletContext());
		Hello hello = (Hello) ctx.getBean("hello");

		response.setContentType("text/html");

		// Actual logic goes here.
		PrintWriter out = response.getWriter();
		out.println("<h1>" + message + "</h1>" + "<br/> <h1>" + hello.name + "</h1>");

	}

	public void destroy() {
		// do nothing.
		System.out.println("Servlet destory");
	}
}