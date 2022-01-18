
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

        int first = Integer.parseInt(numberOne);
        int second = Inter.parseInt(numberTwo);

        try {

        if(request.getParameter("operator").equals("add")) {

            total = first + second;

            request.setAttribute("result", total);

        }else if(request.getParameter("operator").equals("sub")){

            total = first - second;

            request.setAttribute("result", total);

        }else if(request.getParameter("operator").equals("multi")) {

            total = first * second;

            request.setAttribute("result", total);

        }else if(request.getParameter("operator").equals("div")) {

            total = first / second;

            request.setAttribute("result", total);

        }

        }catch(Exception ex){

            request.setAttribute("result", "Invalid Please Try Again.");

        }

            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    
}
