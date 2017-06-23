package com.proeduka.servletperueba;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by pablo on 22/6/2017.
 */
@WebServlet(name = "/Registrousuarios", urlPatterns = {"/Registrousuarios"})
public class Registrousuarios extends HttpServlet {
    public Registrousuarios() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter salida = response.getWriter();
        salida.println("<html><body>");
        salida.println("Nombre Introducido "+request.getParameter("nombre"));
        salida.println("<br><br>");
        salida.println("Apellido Introducido "+request.getParameter("apellido"));
        salida.println("</body></html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
