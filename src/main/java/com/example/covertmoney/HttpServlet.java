package com.example.covertmoney;

import java.io.IOException;

public abstract class HttpServlet {
    protected void doGet()
            throws ServletException, IOException, Convert.ServletException, InterruptedException {
        doGet(null, null);
    }

    protected void doGet(Object response)
                throws ServletException, IOException, Convert.ServletException, InterruptedException {
        doGet(null, response);
    }

    protected abstract void doGet(Object request, Object response)
                throws ServletException, IOException, Convert.ServletException, InterruptedException;
    protected void doPost()
            throws ServletException, IOException, Convert.ServletException, InterruptedException {
        doPost(null, null);
    }

//        /**
//         * @throws ServletException
//         * @throws IOException
//         * @throws Convert.ServletException
//         * @throws InterruptedException
//         */
        protected void doPost(Object request)
                throws ServletException, IOException, Convert.ServletException, InterruptedException {
            doPost(request, null);
        }

    protected abstract void doPost(Object request, Object response)
            throws ServletException, IOException, Convert.ServletException, InterruptedException;
}
