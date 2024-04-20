package com.example.covertmoney;

import java.io.IOException;

public abstract class HttpServlet {
        protected abstract void doGet(Object request, Object response)
                throws ServletException, IOException, Convert.ServletException, InterruptedException;
    protected abstract void doPost(Object request, Object response)
            throws ServletException, IOException, Convert.ServletException, InterruptedException;
}
