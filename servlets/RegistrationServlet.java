package com.marlabs.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public RegistrationServlet() {
		System.out.println("RegistrationServlet Constructor");
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("INIT Method");
	}

	/**
	 * @see Servlet#destroy()
	 */
	@Override
	public void destroy() {
		System.out.println("Destroy Method");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("In DoGet");
		String eName = request.getParameter("eName");
		int eId = Integer.parseInt(request.getParameter("eId"));
		double eSal = Double.parseDouble(request.getParameter("eSal"));
		int deptNo = Integer.parseInt(request.getParameter("deptNo"));

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body style='background-color: lightgreen'>");
		out.println("<h1>Employee Name: " + eName + " </h1>");
		out.println("<h3>Employee ID: " + eId + "</h3>");
		out.println("<h3>Employee Salary: " + eSal + "</h3>");
		out.println("<h3>Employee Department: " + deptNo + "</h3>");
		out.println("</body></html>");

		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("In DoPost");
		doGet(request, response);

	}

}
