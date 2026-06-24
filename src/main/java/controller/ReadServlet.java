package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.StudentDAO;

import java.io.IOException;
//import java.io.PrintWriter;
import java.util.List;

import entity.Student;


@WebServlet("/Read")
public class ReadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     private StudentDAO  dao=new  StudentDAO();
     
  
    public ReadServlet() {
        
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		List<Student> student = dao.getAll();
		request.setAttribute("Student", student);
		request.getRequestDispatcher("read.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter out=response.getWriter();
//		out.println("<h1 align='center'>success</h1>");
//		List<Student> ls = dao.getAll();
//		out.println("<center>");
//		for (Student s : ls) {
//
//			out.println(s.getId() + "   " + s.getName() + "   " + s.getAge() + "   " + s.getCourse() + "<br>");
//
//		}
//		out.println("</center>");
//	}
	
	}
}
