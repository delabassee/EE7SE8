package com.delabassee;

import javax.enterprise.context.ContextNotActiveException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ValidationServlet", urlPatterns = {"/"})
public class ValidationServlet extends HttpServlet {

    public static ServletOutputStream out;
    @Inject
    Supplier aSupplier;    
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        out = response.getOutputStream();
        out.println("<HTML><HEAD></HEAD><BODY>");
        out.println("<h3>CDI Bean Validation @Repeatable</h3><br/>");
        
        placeOrder("VW Golf IV");
        placeOrder("Peugeot 205 GTI");
        placeOrder("Skoda Supperb");
        placeOrder("Renault Espace Initiale");
        placeOrder("Audi RS8");
        
        out.println("</BODY></HTML>");
    }

    private void placeOrder(String car) throws IOException {
        try {
            out.println(aSupplier.order(car));
        } catch (Exception e) {
            out.println(e.getMessage());
        }
        out.println("<hr>");
    }
}