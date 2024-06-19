package myPackage;

import java.io.IOException;
import java.io.PrintWriter;
//import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



//@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    public MyServlet() {
        super();
    }

    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		response.getWriter().append("Served at: ").append(request.getContextPath());

        response.setContentType("text/html"); 
          
        PrintWriter out = response.getWriter(); 
        
        out.print("<h2>Welcome to Servlet</h2>");
	}

}
