package com.pawana.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pawana.DAO.SQLQuery;
import com.pawana.DAOImplementation.DataQuery;
import com.pawana.been.StudentVO;


public class MyServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int result=0;
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		  Integer id =Integer.parseInt(request.getParameter("id"));
		  String name = request.getParameter("name");
		  Integer branch =Integer.parseInt(request.getParameter("branch"));
		  StudentVO s= new StudentVO();
		  s.setId(id);
		  s.setName(name);
		  s.setBranch(branch);
		  SQLQuery sq = new DataQuery();
		  try {
		 result= sq.InserQuery(s);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  if(result == 1)
			  pw.println("inserted");
		  else
			  pw.print("not inserted");
	}

}
