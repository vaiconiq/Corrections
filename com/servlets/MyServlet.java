package com.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(urlPatterns ="/myservlet", name = "MyServlet")
//@WebServlet(name = "MyServlet", value = "/myservlet")

//@WebServlet
public class MyServlet extends HttpServlet {
    /*public MyServlet() {
        super();
    }*/

//    private String message;
//
//    public void init() throws ServletException {
//        // Do required initialization
//        message = "Hello World";
//    }
//
//    public void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//        // Set response content type
//        response.setContentType("text/html");
//
//        // Actual logic goes here.
//        PrintWriter out = response.getWriter();
//        out.println("<h1>" + message + "</h1>");
//    }
//
//    public void destroy() {
//        // do nothing.
//    }


    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("this is get method....");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>This is get method of my servlet</h1>");
    }

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }

}
