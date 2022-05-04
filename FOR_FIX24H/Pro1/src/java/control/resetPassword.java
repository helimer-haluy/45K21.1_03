/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.SendMail;
import dao.accountDAO;
import dao.employeeAccountDAO;
import entity.account;
import entity.empAccount;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hoang
 */
@WebServlet(name = "resetPassword", urlPatterns = {"/resetPassword"})
public class resetPassword extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        String email = request.getParameter("email");
        accountDAO adao = new accountDAO();
        account a = adao.getUserByEmail(email);
        employeeAccountDAO edao = new employeeAccountDAO();
        empAccount e = edao.getUserByEmail(email);
        if (a != null) {
            SendMail sm = new SendMail();
            String newPass = sm.getRandom();
            adao.resetPasswordByEmail(email, newPass);
            request.setAttribute("reset", true);
            try {
                request.setAttribute("mess1", "New Password have been sent to your Email Address");
                request.getRequestDispatcher("login.jsp").forward(request, response);
                sm.sendText(email, newPass);
            } catch (MessagingException ex) {
                Logger.getLogger(resetPassword.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e != null) { 
                SendMail sm = new SendMail();
                String newPass = sm.getRandom();
                edao.resetPasswordByEmail(email, newPass);
                request.setAttribute("reset", true);
                try {
                    request.setAttribute("mess1", "New Password have been sent to your Email Address");
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                    sm.sendText(email, newPass);
                } catch (MessagingException ex) {
                    Logger.getLogger(resetPassword.class.getName()).log(Level.SEVERE, null, ex);
                }
        } else {
            request.setAttribute("mess1", "Account with this email address haven't been registered yet");
            request.getRequestDispatcher("forgetPassword.jsp").forward(request, response);
        }
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
        processRequest(request, response);
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
