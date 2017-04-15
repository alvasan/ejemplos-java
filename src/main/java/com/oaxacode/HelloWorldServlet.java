package com.oaxacode;

/*import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class HelloWorldServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        out.println( "Hello World Oaxacodes from Servlet3!" );
        out.flush();
        out.close();
    }
}*/

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(urlPatterns =
{ "/test" })
public class HelloWorldServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        out.println( "Hello World Oaxacodes from Servlet3! embedded" );
        out.flush();
        out.close();
    }
}
