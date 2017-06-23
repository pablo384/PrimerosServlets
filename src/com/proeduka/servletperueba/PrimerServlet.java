package com.proeduka.servletperueba;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


@WebServlet(name = "/PrimerServlet", urlPatterns = {"/server"})
public class PrimerServlet extends HttpServlet {
    public PrimerServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //especificamos formato de respuesta
        PrintWriter salida=response.getWriter();
        //generar respuesta de la peticion
        salida.println("<html><body>");
        salida.println("<h1 style='text-align:center'> Prueba Servlet</h1>");
        salida.println("");
        salida.println("");
        salida.println("");
        salida.println("");
        salida.println("Fecha y hora actual"+new Date());
        salida.println("</body></html>");
    }
}
