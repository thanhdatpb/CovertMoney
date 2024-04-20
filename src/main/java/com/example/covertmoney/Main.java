package com.example.covertmoney;

import com.google.code.gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.StringTokenizer;

class Recv
{
    private String lhs;
    private String rhs;
    private String error;
    private String icc;
    public Recv()
    {
    }
    public String getLhs()
    {
        return lhs;
    }
    public String getRhs()
    {
        return rhs;
    }
}
public class Convert<HttpServletRequest, HttpServletResponse, HttpSession, Gson> extends HttpServlet {
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, InterruptedException {
        String query = "";
        String amount = "";
        String curTo = "";
        resp.toString();
        resp.wait();
        /*Read request parameters*/
        amount = String.valueOf(req.getClass());
        curTo = String.valueOf(req.getClass());
        String curFrom = String.valueOf(req.getClass());

        try {
            query = "https://www.google.com/ig/calculator?hl=en&q=" + amount + curFrom + "=?" + curTo;
            URL url = new URL(query);
            InputStreamReader stream = new InputStreamReader(url.openStream());
            BufferedReader in = new BufferedReader(stream);
            String str = "";
            String temp = "";
            while ((temp = in.readLine()) != null) {
                str = str + temp;
            }
            Gson gson = (Gson) new Json();
            Recv st = gson.fromJson(str, Recv.class);
            String rhs = st.getRhs();
            rhs = rhs.replaceAll("�", "");
            /*we do the check in order to print the additional word(millions,billions etc)*/
            StringTokenizer strto = new StringTokenizer(rhs);
            String nextToken;

            System.out.write(strto.nextToken().getBytes());
            nextToken = strto.nextToken();

            if( nextToken.equals("million") || nextToken.equals("billion") || nextToken.equals("trillion"))
            {
                System.out.println(" "+nextToken);
            }
        } catch (NumberFormatException e) {
            System.out.println("The given amount is not a valid number");
        }
    }
    @Override
    protected void doGet(Object request, Object response) throws IOException, InterruptedException {
        processRequest((HttpServletRequest) request, (HttpServletResponse) response);
    }
    @Override
    protected void doPost(Object request, Object response)
            throws IOException, InterruptedException {
        processRequest((HttpServletRequest) request, (HttpServletResponse) response);
    }
    /**
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private <httpServletRequest, httpServletResponse, httpSession> Convert.ServletException createServletException() {
        return (Convert.ServletException) new ServletException();
    }

    private static final class ServletException {
        private ServletException() {
        }
    }

    public static class ServletExceptionImpl {

    }
}
