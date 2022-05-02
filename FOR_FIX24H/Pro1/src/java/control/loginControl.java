/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.accountDAO;
import dao.employeeAccountDAO;
import entity.account;
import entity.empAccount;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Hi
 */
@WebServlet(name = "loginControl", urlPatterns = {"/login"})
public class loginControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        accountDAO adao = new accountDAO();
        account a = adao.Login(username, password);
        System.out.print(a);

        if (a != null) {
            HttpSession session = request.getSession();
            session.setAttribute("acc", a);
            request.setAttribute("usertest", username);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } else {
            request.setAttribute("wrong", true);
            request.setAttribute("mess", "Input incorrect username or password");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        request.getRequestDispatcher("homeControl").forward(request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
        processRequest(request, response);
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
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        accountDAO adao = new accountDAO();
        account a = adao.Login(username, password);
        employeeAccountDAO edao = new employeeAccountDAO();
        empAccount e = edao.EmpLogin(username, password);

        if ((e != null) || (a != null)) {
            HttpSession session = request.getSession();
            if (a != null) {
                session.setAttribute("acc", a);
            } else {
                session.setAttribute("acc", e);
            }
            request.setAttribute("usertest", username);
            request.getRequestDispatcher("homeControl").forward(request, response);
        } else {
            request.setAttribute("wrong", true);
            request.setAttribute("mess", "Input incorrect username or password");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        request.getRequestDispatcher("./homeControl").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
