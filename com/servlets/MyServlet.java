package com.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(urlPatterns ="/myservlet", name = "MyServlet")

public class MyServlet extends HttpServlet {
    /*public MyServlet() {
        super();
    }*/

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("this is get method....");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>This is get method of my servlet</h1>");
    }

    /*@Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        System.out.println("this is get method....");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>This is get method of my servlet</h1>");
    }*/
}
