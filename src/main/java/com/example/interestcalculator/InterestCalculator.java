package com.example.interestcalculator;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.xml.namespace.QName;
import java.io.IOException;
@WebServlet(name = "interestcalculator",value = "/interestcalculator")
public class InterestCalculator extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int A = Integer.parseInt(req.getParameter("principle"));
        int B = Integer.parseInt(req.getParameter("rate of interest"));
        int C = Integer.parseInt(req.getParameter("time"));
        int K = (A*B*C)/100;
        resp.setContentType("text/html");
        resp.getWriter().println("The interest is "+K);

    }
}
