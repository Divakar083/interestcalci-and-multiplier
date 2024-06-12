package com.example.interestcalculator;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(name = "answer",value = "/answer")
public class Answer extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int P = Integer.parseInt(req.getParameter("a1"));
        int Q = Integer.parseInt(req.getParameter("a2"));
        int R = Integer.parseInt(req.getParameter("a3"));
        int Z = (P+Q+R)*100;
        resp.setContentType("text/html");
        resp.getWriter().println("The ans: "+Z);
    }
}
