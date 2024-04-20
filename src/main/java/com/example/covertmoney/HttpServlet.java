package com.example.covertmoney;

import java.io.IOException;

public abstract class HttpServlet {
    //     <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    //     * Handles the HTTP <code>GET</code> method.
    //     * @param request servlet request
    //     * @param response servlet response
    //     * @throws ServletException if a servlet-specific error occurs
    //     * @throws IOException if an I/O error occurs
    //
        protected abstract void doGet(Object request, Object response)
                throws ServletException, IOException, Convert.ServletException, InterruptedException;

    protected abstract void doPost(Object request, Object response)
            throws ServletException, IOException, Convert.ServletException, InterruptedException;

    public abstract String getServletInfo()// </editor-fold>
    ;
}
