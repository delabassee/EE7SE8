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
        out.println("<h3>Bean Validation @Repeatable</h3><br/>");
        
        placeOrder(new Car("Audi", "A6 1.9 TDi", "11YUT3"));
        placeOrder(new Car("Peugeot", "208 GTI", "POL654"));
        placeOrder(new Car("VW", "Golf+ 1.9", "234PMO"));
        placeOrder(new Car("Renault", "Espace Intiale", "123RTB"));
        placeOrder(new Car("Skoda", "Superb", "XYZ123"));
        
        out.println("</BODY></HTML>");
    }

    private void placeOrder(Car car) throws IOException {

        try {
            out.println(aSupplier.order(car));
        } catch (Exception e) {
            out.println(e.getMessage());
        }
        out.println("<hr>");
    }
}