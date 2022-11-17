package com.tpe;

import java.awt.print.Printable;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tpe.domain.Lesson;

/**
 * Servlet implementation class ListLessonServlet
 */
@WebServlet("/ListLessonServlet")
public class ListLessonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	private List<Lesson> list;
	
	
    public ListLessonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    @Override
    public void init() throws ServletException {
    	list=new ArrayList<>();
    	
    	Lesson lesson1=new Lesson();
    	lesson1.setId(1L);
    	lesson1.setName("advance java");
    	lesson1.setSubject("multi threads");
    	
    	list.add(lesson1);
    	
    	Lesson lesson2=new Lesson();
    	lesson2.setId(2L);
    	lesson2.setName("spring MVC");
    	
    	lesson2.setSubject("servlet container");
    	
    	list.add(lesson2);
    	
  
    	
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		 out.println("<html><body>");
	        out.println("<h3>Lessons Details</h3>");
	        out.println("<table border=1><tr>" + "<td><b>id</b></td>" + "<td><b>Name</b></td>"
	                + "<td><b>Subject</b></td></tr>");
	        for (Lesson lesson : list) {
	            out.println("<tr>" + "<td>" + lesson.getId() + "</td>" + "<td>" + lesson.getName() + "</td>"
	                    + "<td>" + lesson.getSubject() + "</td></tr>");
	        }
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
