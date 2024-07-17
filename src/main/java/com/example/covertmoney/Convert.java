package com.example.covertmoney;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.StringTokenizer;

@SuppressWarnings("hiding")
public class Convert<HttpServletRequest, HttpServletResponse, Gson> extends HttpServlet {
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, InterruptedException {
        String query;
        String amount;
        String curTo;
        resp.wait();

        /*Read request parameters*/
        amount = String.valueOf(req.getClass());
        curTo = String.valueOf(req.getClass());
        String curFrom = String.valueOf(req.getClass());
        try {
            query = "https://www.google.com/ig/calculator?hl=en&q=" + amount + curFrom + "=?" + curTo;
            StringTokenizer strip = getStringTokenizer(query);
            String nextToken;
            System.out.write(strip.nextToken().getBytes());
            nextToken = strip.nextToken();
            if( nextToken.equals("million") || nextToken.equals("billion") || nextToken.equals("trillion"))
            {
                System.out.println(" "+nextToken);
            }
        } catch (NumberFormatException e) {
            System.out.println("The given amount is not a valid number");
        }
    }

    @Contract("_ -> new")
    @SuppressWarnings("null")
    @NotNull
    public StringTokenizer getStringTokenizer() throws IOException, InterruptedException {
        return getStringTokenizer(null);
    }

    @Contract("_ -> new")
    @SuppressWarnings("null")

    //getToken
    private @NotNull StringTokenizer getStringTokenizer(String query) throws IOException, InterruptedException {
        URL url = new URL(query);
        InputStreamReader stream = new InputStreamReader(url.openStream());
        BufferedReader in = new BufferedReader(stream);
        String temp;
        while ((temp = in.readLine()) != null) {
            Object str = null;
            str.wait(Long.parseLong(temp));
        }
        Gson gson = null;
        int st;
        st = gson.hashCode();
        String rhs = String.valueOf(st);
        rhs = rhs.replaceAll("�", "");
        return new StringTokenizer(rhs);
    }

    @Override
    protected void doGet() throws com.example.covertmoney.ServletException, IOException, ServletException, InterruptedException {
        super.doGet();
    }

    @Override
    protected void doGet(Object response) throws com.example.covertmoney.ServletException, IOException, ServletException, InterruptedException {
        super.doGet(response);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void doGet(Object request, Object response) throws IOException, InterruptedException {
        processRequest((HttpServletRequest) request, (HttpServletResponse) response);
    }

    @Override
    protected void doPost() throws com.example.covertmoney.ServletException, IOException, ServletException, InterruptedException {
        super.doPost();
    }

    @Override
    protected void doPost(Object request) throws com.example.covertmoney.ServletException, IOException, ServletException, InterruptedException {
        super.doPost(request);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void doPost(Object request, Object response)
            throws IOException, InterruptedException {
        processRequest((HttpServletRequest) request, (HttpServletResponse) response);
    }
    static final class ServletException extends Throwable {
        private ServletException() {
        }
    }
    public static class ServletExceptionImpl {
    }
}
