/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Config.Config;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Saurabh
 */
public class RequestAppointment extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String appointmentID = "";
        String status = "Pending";
        String userId = request.getParameter("userId");
        String userName = request.getParameter("userName");
        String date = request.getParameter("date");
        String time = request.getParameter("time");
        String problemDescription = request.getParameter("problemDescription");

        HttpSession session = request.getSession();
        String patient = (String) session.getAttribute("patient");
        String user = (String) session.getAttribute("user");
        String patientName = (String) session.getAttribute("loginName");
        String admin = (String) session.getAttribute("admin");
        if (patient != null && user == null && admin == null) {
            Connection con;
            Statement st;
            ResultSet rs;
            try {
                con = Config.getcon();
                st = con.createStatement();
                String query = "select * from log";
                int noOfAppoint = 0;
                rs = st.executeQuery(query);
                if (rs.next()) {
                    noOfAppoint = rs.getInt("noOfAppoint") + 1;
                    appointmentID = "APPOT" + String.format("%06d", noOfAppoint);
                } else {
                    appointmentID = "APPOT000001";
                }
                query = "UPDATE log SET noOfAppoint='" + noOfAppoint + "'";
                st.executeUpdate(query);
                query = "insert into appointment values('" + appointmentID + "','" + patient + "','" + patientName + "','" + userId + "','" + userName + "','" + date + "','" + time + "','" + problemDescription + "','" + status + "')";
                st.executeUpdate(query);
                session.setAttribute("msg", "Appointment Successfully Registered");
                response.sendRedirect("RequestAppointment.jsp");
            } catch (Exception e) {
                System.out.println("Error=" + e);
                session.setAttribute("msg", "Error : " + e);
                response.sendRedirect("loginError.jsp");
            }
        } else {
            session.setAttribute("msg", "You are not Login..Login First");
            response.sendRedirect("loginError.jsp");
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
