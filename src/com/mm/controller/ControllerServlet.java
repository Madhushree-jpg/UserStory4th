package com.mm.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mm.dao.ProjectDAO;
import com.mm.model.Project;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/Welcome")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		
		int Id=Integer.parseInt(request.getParameter("Id"));
		String Title= request.getParameter("Title");
		String Description=request.getParameter("Description");
		String Domain=request.getParameter("Domain");
		Project p= new Project(Id,Title,Description,Domain);
		PrintWriter out=response.getWriter();
		ProjectDAO pdao=new ProjectDAO();
		boolean b =pdao.insertProject(p);
		if(b==true)
		//request.getRequestDispatcher("success.jsp").include(request, response);
		
		out.println("successful insertion");
		
	}
}	

