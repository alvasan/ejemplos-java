package com.oaxacode;

import java.io.*;
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
}
