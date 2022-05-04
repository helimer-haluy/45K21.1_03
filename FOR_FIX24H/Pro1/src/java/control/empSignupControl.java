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
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author Hoang
 */
@WebServlet(name = "empSignupControl", urlPatterns = {"/empSignupControl"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
        maxFileSize = 1024 * 1024 * 50, // 50MB
        maxRequestSize = 1024 * 1024 * 50) // 50MB
public class empSignupControl extends HttpServlet {

    private static final long serialVersionUID = 1L;

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
        String name = request.getParameter("name");
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String district = request.getParameter("district");
        String city = request.getParameter("city");
        String icard = request.getParameter("icard");
        String phoneno = request.getParameter("phonenumber");
        String pass = request.getParameter("password");
        String re_pass = request.getParameter("re_pass");
        String des = request.getParameter("des");
//        String license = request.getParameter("license");
        Part license = request.getPart("license");
        Part fIcard = request.getPart("ficard");
        Part bIcard = request.getPart("bicard");
        String licensefilename = (username + "-" + license.getSubmittedFileName());
        String fICardfilename = (username + "- mat truoc CCCD -" + fIcard.getSubmittedFileName());
        String bICardfilename = (username + "- mat sau CCCD - " + bIcard.getSubmittedFileName());

//        System.out.println(filename);
        if (!pass.equals(re_pass)) {
            response.sendRedirect("signupEmployee.jsp");
        } else {
            employeeAccountDAO edao = new employeeAccountDAO();
            accountDAO adao = new accountDAO();
            account a = adao.checkAccountExist(username);
            account a1 = adao.checkEmailExist(email);
            empAccount e = edao.checkAccountExist(username);
            empAccount e1 = edao.checkEmailExist(email);
            if ((e == null) && (a == null) && (e1 == null) && (a1 == null)) {
                String path = getServletContext().getRealPath("/" + "license" + File.separator + licensefilename);
                String path1 = getServletContext().getRealPath("/" + "icards" + File.separator + fICardfilename);
                String path2 = getServletContext().getRealPath("/" + "icards" + File.separator + bICardfilename);
                InputStream licenseS = license.getInputStream();
                InputStream fIcardS = fIcard.getInputStream();
                InputStream bIcardS = bIcard.getInputStream();
                boolean succ = uploadFile(licenseS, path);
                boolean succ1 = uploadFile(fIcardS, path1);
                boolean succ2 = uploadFile(bIcardS, path2);
                edao.Register(name, username, email, phoneno, pass, district, city, icard, licensefilename, des, fICardfilename, bICardfilename);
                request.getRequestDispatcher("login.jsp").forward(request, response);
            } else {
                request.setAttribute("mess", "Username or Email existed please try again");
                request.getRequestDispatcher("signupEmployee.jsp").forward(request, response);
            }
        }
    }

    public boolean uploadFile(InputStream is, String path) {
        boolean test = false;
        try {
            byte[] byt = new byte[is.available()];
            is.read(byt);
            FileOutputStream fops = new FileOutputStream(path);
            fops.write(byt);
            fops.flush();
            fops.close();
            test = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return test;
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
