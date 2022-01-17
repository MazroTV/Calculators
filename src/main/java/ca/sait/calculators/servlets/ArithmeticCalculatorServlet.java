
package ca.sait.calculators.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Marek PC
 */

public class ArithmeticCalculatorServlet extends HttpServlet {
    
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        String numberOne = request.getParameter("num1");
        String numberTwo = request.getParameter("num2");

        int total;

        try {

        if(request.getParameter("operator").equals("add")) {

            total = Integer.parseInt(numberOne) + Integer.parseInt(numberTwo);

            request.setAttribute("result", total);

        }else if(request.getParameter("operator").equals("sub")){

            total = Integer.parseInt(numberOne) - Integer.parseInt(numberTwo);

            request.setAttribute("result", total);

        }else if(request.getParameter("operator").equals("multi")) {

            total = Integer.parseInt(numberOne) * Integer.parseInt(numberTwo);

            request.setAttribute("result", total);

        }else if(request.getParameter("operator").equals("div")) {

            total = Integer.parseInt(numberOne) / Integer.parseInt(numberTwo);

            request.setAttribute("result", total);

        }

        }catch(Exception x){

            request.setAttribute("result", "Invalid Please Try Again.");

        }

            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    
}
