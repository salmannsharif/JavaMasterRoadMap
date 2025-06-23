package com.training.servlet;
import java.io.*;
//import javax.servlet.*;
//import javax.servlet.http.*;

public class ServletClass {

    /**
     * Servlet is a server-side programming technology used to develop web applications.
     * It is built on top of the Java programming language and is compatible with Java classes and interfaces.
     * A Servlet is a Java class that resides on the server side, primarily used to handle client requests
     * and send responses back to the client.
     * Since Servlets are written in Java, they are platform-independent, robust, and secure.
     * Servlets can use any Java API, such as JDBC, making database interaction possible within the servlet.
     * Servlets are protocol-independent and support multiple protocols like HTTP, HTTPS, FTP, and SMTP.
     * Note: HTTP is a stateless protocol, and Servlets are typically used over HTTP.
     *
     * There is a teo packages in servlet
     * 1. javax.servlet
     * 2. javax.servlet.http
     *
     * 1. javax.servlet: This package contains the core Servlet interfaces and classes for all protocols.
     * 2. javax.servlet.http: This package contains the HTTP-specific interfaces and classes for handling HTTP requests and responses.
     *

    /**
     * Advantages of Servlets:
     * - Protocol independent: Supports HTTP, FTP, SMTP, etc., making them suitable for various web applications.
     * - Java compatible: Can use all Java APIs (e.g., JDBC, Collections).
     * - Automatic memory management: Handled by JVM, reducing memory leaks.
     * - Platform independent: Runs on any OS or Java-enabled web server.
     * - Secure: Inherits security from JVM and web servers.
     * - Extensible: Easily extendable to meet specific requirements.
     * - High performance: Compiled to bytecode, making them faster than scripting-based technologies.
     */

    /**
     * Java Servlet Life Cycle :
     * The life of a servlet goes through five stages. They are,
     *
     * Loading The Servlet
     * Instantiating The Servlet
     * Calling init() method
     * Calling service() method
     * Calling destroy() method
     */

    /**
     *
     * import javax.servlet.Servet - > Base Interface
     * import javax.servlet.GenericServlet - > Abstract class that is implement Servlet interface.
     * import javax.servlet.http.HttpServlet - > Abstract class that is extends GenericServlet
     */

    //public class HelloServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out.println("<h2>Hello, Salman! Welcome to Servlet POC</h2>");
//    }
//}

//Servlet Deployment Descriptor in WEB-INF/ -> Configuration file
//<web-app xmlns="http://java.sun.com/xml/ns/javaee"
//version="3.0">
//    <servlet>
//        <servlet-name>HelloServlet</servlet-name>
//        <servlet-class>HelloServlet</servlet-class>
//    </servlet>
//
//    <servlet-mapping>
//        <servlet-name>HelloServlet</servlet-name>
//        <url-pattern>/hello</url-pattern>
//    </servlet-mapping>
//</web-app>



}
